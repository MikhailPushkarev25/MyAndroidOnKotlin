package com.example.lesson_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.lesson_3.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    lateinit var viewBiding : ActivityMain2Binding
    lateinit var name : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBiding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(viewBiding.root)

        viewBiding.btnRes.setOnClickListener {

            if(viewBiding.edText.text.toString() != "") {

                name = viewBiding.edText.text.toString()

                viewBiding.tvName.visibility = View.VISIBLE

                when (name) {


                    "Mike" -> {
                        viewBiding.tvName.visibility = View.VISIBLE
                        viewBiding.tvName.text = "Ваша зарплата -> 30.000 рублей"
                    }

                    "Roma" -> {
                        viewBiding.tvName.visibility = View.VISIBLE
                        viewBiding.tvName.text = "Ваша зарплата -> 50.000 рублей"
                    }

                    "Alex" -> {
                        viewBiding.tvName.visibility = View.VISIBLE
                        viewBiding.tvName.text = "Ваша зарплата -> 100.000 рублей"
                    }
                }
            } else {
                viewBiding.tvName.visibility = View.VISIBLE
                viewBiding.tvName.text = "Вы не ввели данные"
            }
        }
    }
}