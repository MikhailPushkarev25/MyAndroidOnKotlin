package com.example.myaccound

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myaccound.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var viewBind : ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBind = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(viewBind.root)
        val result = intent.getStringExtra(Constance.ENTER_KEY)
        if (result == Constance.STATE_IN) {
            viewBind.edName.visibility = View.GONE
            viewBind.edLastName.visibility = View.GONE
            viewBind.edMiddleName.visibility = View.GONE
            viewBind.btnAvatar.visibility = View.GONE
            viewBind.imgAvatar2.visibility = View.VISIBLE
        }
    }
    
    fun onClickOK(view: View) {
        val intent = Intent()
        intent.putExtra(Constance.LOGIN, viewBind.edLogin.text.toString())
        intent.putExtra(Constance.PASSWORD, viewBind.edPassword.text.toString())
        intent.putExtra(Constance.FIRST_NAME, viewBind.edName.text.toString())
        intent.putExtra(Constance.LAST_NAME, viewBind.edLastName.text.toString())
        intent.putExtra(Constance.MIDDLE_NAME, viewBind.edMiddleName.text.toString())
        setResult(RESULT_OK, intent)
        finish()
    }


    fun onClickAvatar(view : View) {
        viewBind.imgAvatar2.visibility = View.VISIBLE
    }
}