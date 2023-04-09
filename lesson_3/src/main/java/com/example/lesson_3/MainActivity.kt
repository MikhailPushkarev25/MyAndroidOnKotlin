package com.example.lesson_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.lesson_3.databinding.ActivityMain2Binding
import com.example.lesson_3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var viewBiding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBiding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBiding.root)
        val message = intent.getStringExtra("key")
        viewBiding.textView.text = message
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 100 && resultCode == RESULT_OK && data != null) {

            viewBiding.textView.text = data.getStringExtra("key")
        }
    }
    fun onClickMain2(view : View) {

        val i = Intent(this, MainActivity2::class.java)
        i.putExtra("key", "Как тебя зовут?")
        startActivityForResult(i, 100);
    }
}