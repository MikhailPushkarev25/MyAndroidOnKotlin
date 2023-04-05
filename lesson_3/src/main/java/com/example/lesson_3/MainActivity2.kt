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
                viewBiding.imgFoto.visibility = View.VISIBLE

                when (name) {

                        Constance.DIRECTOR -> {
                            viewBiding.tvName.visibility = View.VISIBLE
                            val temp = "Ваша зарплата -> ${Constance.DIRECTOR_PRICE}"
                            if(viewBiding.edCode.text.toString().toInt() == Constance.DIRECTOR_PASSWORD) {
                                viewBiding.imgFoto.setImageResource(R.drawable.director)
                                viewBiding.tvName.text = temp
                            } else {
                                viewBiding.imgFoto.setImageResource(R.drawable.fig)
                            }
                        }


                    Constance.DVORNIK -> {
                        viewBiding.tvName.visibility = View.VISIBLE
                        val temp = "Ваша зарплата -> ${Constance.DVORNIK_PRICE}"
                        if(viewBiding.edCode.text.toString().toInt() == Constance.DVORNIK_PASSWORD) {
                            viewBiding.imgFoto.setImageResource(R.drawable.dvornik)
                            viewBiding.tvName.text = temp
                        } else {
                            viewBiding.imgFoto.setImageResource(R.drawable.fig)
                        }
                    }

                    Constance.INGENER -> {
                        viewBiding.tvName.visibility = View.VISIBLE
                        val temp = "Ваша зарплата -> ${Constance.INGENER_PRICE}"
                        if(viewBiding.edCode.text.toString().toInt() == Constance.INGENER_PASSWORD) {
                            viewBiding.imgFoto.setImageResource(R.drawable.ingener)
                            viewBiding.tvName.text = temp
                        } else {
                            viewBiding.imgFoto.setImageResource(R.drawable.fig)
                        }
                    }
                }
            } else {
                viewBiding.tvName.visibility = View.VISIBLE
                viewBiding.tvName.text = "Вы не ввели данные"
            }
        }
    }
}