package com.example.myviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myviewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var viewBinding : ActivityMainBinding
    val a = 324
    val b = 34

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.btnButton1.setOnClickListener {
            val result = a + b
            viewBinding.tvText.text = "Результат сложения равен: $result"

            viewBinding.btnButton2.setOnClickListener {

                val result = a - b
                viewBinding.tvText.text = "Результат Вычитания равен: $result"

            }

            viewBinding.btnButton3.setOnClickListener {
                val result = a * b
                viewBinding.tvText.text = "Результат Умножения равен: $result"
            }
        }
    }
}