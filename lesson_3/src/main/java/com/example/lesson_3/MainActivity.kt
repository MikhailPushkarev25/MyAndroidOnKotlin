package com.example.lesson_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.lesson_3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var viewBiding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBiding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBiding.root)

        viewBiding.bntButton1.setOnClickListener {

            if(viewBiding.edValue.text.toString() != "") {
                val result = viewBiding.edValue.text.toString().toInt()
                Log.d("MyTag", "Result = $result")
                when(result) {
                    in 0..1000 -> {
                        viewBiding.tvResult.visibility = View.VISIBLE
                        viewBiding.tvResult.text = "Вы начинающий блогер"
                    }

                    in 10000..100000 -> {
                        viewBiding.tvResult.visibility = View.VISIBLE
                        viewBiding.tvResult.text = "Вы средний блогер"
                    }

                    else -> {

                        viewBiding.tvResult.visibility = View.VISIBLE
                        viewBiding.tvResult.text = "Вы супер звезда"

                    }
                }
            } else {
                viewBiding.tvResult.visibility = View.VISIBLE
                viewBiding.tvResult.text = "Введите данные"
            }
        }
    }
}