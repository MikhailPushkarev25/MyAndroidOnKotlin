package com.example.myaccound

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myaccound.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var viewBind : ActivityMainBinding
    private var login = ""
    private var password = ""
    private var firstName = ""
    private var lastName = ""
    private var middleName = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBind.root)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == Constance.REQUEST_CODE_ENTER) {
            val log = data?.getStringExtra(Constance.LOGIN)
            val pass = data?.getStringExtra(Constance.PASSWORD)
            if (log == login && pass == password) {

                val tvResult = "$firstName $lastName $middleName"
                viewBind.textView.text = tvResult
                viewBind.imgIn.visibility = View.VISIBLE
                viewBind.btnReg.visibility = View.GONE
                viewBind.btnEnter.text = "Выход"

            } else {
                viewBind.textView.text = "Такого аакаунта не существует!"
            }
        } else if (requestCode == Constance.REQUEST_CODE_REGISTER) {

            login = data?.getStringExtra(Constance.LOGIN)!!
            password = data.getStringExtra(Constance.PASSWORD)!!
            firstName = data.getStringExtra(Constance.FIRST_NAME)!!
            lastName = data.getStringExtra(Constance.LAST_NAME)!!
            middleName = data.getStringExtra(Constance.MIDDLE_NAME)!!

            val text = "$firstName $lastName $middleName"
            viewBind.textView.text = text
            viewBind.imgIn.visibility = View.VISIBLE
            viewBind.btnReg.visibility = View.GONE
            viewBind.btnEnter.text = "Выход"


        }
    }

    fun onClickEnter(view : View) {
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra(Constance.ENTER_KEY, Constance.STATE_IN)
        startActivityForResult(intent, Constance.REQUEST_CODE_ENTER)
    }

    fun onClickRegistration(view : View) {
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra(Constance.REGISTRATION_KEY, Constance.STATE_UP)
        startActivityForResult(intent, Constance.REQUEST_CODE_REGISTER)
    }
}