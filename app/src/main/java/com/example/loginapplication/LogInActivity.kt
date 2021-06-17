package com.example.loginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LogInActivity : AppCompatActivity() {
    lateinit var btnLogin:Button
    lateinit var etEmail1:EditText
    lateinit var etpassword1:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        castView2()
        onClick2()
    }
    fun castView2(){
        btnLogin=findViewById(R.id.btnLogin)
        etEmail1=findViewById(R.id.etEmail1)
        etpassword1=findViewById(R.id.etPassword1)
    }
    fun onClick2(){
        btnLogin.setOnClickListener {
            var error=false
            var email = etEmail1.text.toString()
            if (email.isEmpty()){
                etEmail1.setError("Email is required")
            }

            var password = etpassword1.text.toString()
            if (email.isEmpty()){
                etpassword1.setError("Password is required")
            }
            var login=Intent(baseContext,MainActivity::class.java)
            startActivity(login)
        }
    }
}