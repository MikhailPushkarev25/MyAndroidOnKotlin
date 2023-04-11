package com.example.arrays

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    val bad = 0..3
    val normal = 4 .. 6
    val nice = 7 .. 9
    val excellent = 10
    val gradeArray = arrayOf(4, 7, 3, 6, 10, 2)
    val nameArray = arrayOf("Антон", "Егор", "Маша", "Светлана", "Юля", "Семен")
    val badArray = ArrayList<String>()
    val normalArray = ArrayList<String>()
    val nicelArray = ArrayList<String>()
    val excellentlArray = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for ((index, item) in gradeArray.withIndex()) {

            val result = "Ученик: ${nameArray[index]} - $item"

            when (item) {
                in bad -> {
                    badArray.add(result)
                }
                in normal -> {
                    normalArray.add(result)
                }
                in nice -> {
                    nicelArray.add(result)
                }
                excellent -> {
                    excellentlArray.add(result)
                }
            }

        }

        badArray.forEach {
            Log.d("MyTag", "Плохие оценки: $it")
        }

        normalArray.forEach {
            Log.d("MyTag", "Нормальные оценки: $it")
        }

        nicelArray.forEach {
            Log.d("MyTag", "Хорошие оценки: $it")
        }

        excellentlArray.forEach {
            Log.d("MyTag", "Отличные оценки: $it")
        }
    }
}