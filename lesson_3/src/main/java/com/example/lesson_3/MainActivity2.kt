package com.example.lesson_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.lesson_3.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    lateinit var viewBiding : ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBiding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(viewBiding.root)
        val message = intent.getStringExtra("key")
        viewBiding.textView5.text = message
    }

    fun onClickSend(view: View) {
        val i = Intent(this, MainActivity::class.java)
        i.putExtra("key", "Михаил")
        setResult(RESULT_OK, i)
        finish()
    }
}