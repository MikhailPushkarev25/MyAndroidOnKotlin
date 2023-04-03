package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var tvText: TextView
    lateinit var btnButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        tvText = findViewById(R.id.tvText)
        btnButton = findViewById(R.id.btnTest)

        btnButton.setOnClickListener {
            tvText.text = "it is work"
        }
    }
}