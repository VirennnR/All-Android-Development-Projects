package com.example.fooddeliveryapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RelativeLayout

class RegistrationActivity : AppCompatActivity() {

    lateinit var btnRegister: Button
    lateinit var etName: EditText
    lateinit var etPhoneNumber: EditText
    lateinit var etPassword: EditText
    lateinit var etEmail: EditText
    lateinit var etAddress: EditText
    lateinit var etConfirmPassword: EditText
    lateinit var rlRegister: RelativeLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        supportActionBar?.hide()

        etName = findViewById(R.id.etNameSI)
        etPhoneNumber = findViewById(R.id.etMobileNumberSI)
        etEmail = findViewById(R.id.etEmailSI)
        etPassword = findViewById(R.id.etPasswordSI)
        etConfirmPassword = findViewById(R.id.etConfirmPasswordSI)
        etAddress = findViewById(R.id.etAddress)
        btnRegister = findViewById(R.id.buttonSI)

        btnRegister.setOnClickListener {
            val intent = Intent(this@RegistrationActivity, ViewActivity::class.java)
            val bundle = Bundle()
            bundle.putString("data", "register")
            bundle.putString("name", etName.text.toString())
            bundle.putString("mobile", etPhoneNumber.text.toString())
            bundle.putString("password", etPassword.text.toString())
            bundle.putString("address", etAddress.text.toString())
            intent.putExtra("details", bundle)
            startActivity(intent)
        }
    }
}