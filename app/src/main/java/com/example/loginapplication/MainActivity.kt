package com.example.loginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var etName:EditText
    lateinit var  spGender:Spinner
    lateinit var etEmail:EditText
    lateinit var etPhone:EditText
    lateinit var etPassword:EditText
    lateinit var btnSignup:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        castView()
        onClick()
    }
    fun castView(){
        btnSignup=findViewById(R.id.btnSignup)
        etName=findViewById(R.id.etName)
        spGender=findViewById(R.id.spGender)
        etEmail=findViewById(R.id.etEmail)
        etPhone=findViewById(R.id.etPhone)
        etPassword=findViewById(R.id.etPassword)
        var gender= arrayOf("Select gender","Male","Female","Other")
        var genderAdapter=ArrayAdapter(baseContext,android.R.layout.simple_spinner_item,gender)
        genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spGender.adapter=genderAdapter




    }
    fun onClick(){
        btnSignup.setOnClickListener {

            var error=false
            var name = etName.text.toString()
            if (name.isEmpty()){
                error=true
                etName.setError("Name is required")

        }
            var gen = ""
            if (spGender.selectedItemPosition!=0){
                gen=spGender.selectedItem.toString()
            }
            else{
                error=true
                Toast.makeText(baseContext,"Select gender", Toast.LENGTH_LONG)
            }
            var phone = etPhone.text.toString()
            if (phone.isEmpty()){
                error=true
                etPhone.setError("Phone number is required")
            }
            var email = etEmail.text.toString()
            if (email.isEmpty()){
                etEmail.setError("Email is required")
            }

            var password = etPassword.text.toString()
            if (email.isEmpty()){
                etPassword.setError("Password is required")
            }

            var signUp=Intent(baseContext,LogInActivity::class.java)
            startActivity(signUp)



            }


    }

}