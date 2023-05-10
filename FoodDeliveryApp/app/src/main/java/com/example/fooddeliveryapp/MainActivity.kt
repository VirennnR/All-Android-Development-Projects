package com.example.fooddeliveryapp

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView




class MainActivity : AppCompatActivity() {

    /*Declaring the different variables used for this activity*/
    private lateinit var registerYourself: TextView
    private lateinit var login: Button
    private lateinit var etMobileNumber: EditText
    private lateinit var etPassword: EditText
    private lateinit var txtForgotPassword: TextView

    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()


        sharedPreferences = getSharedPreferences(getString(R.string.preference_file_name), Context.MODE_PRIVATE)

        val isStatus = sharedPreferences.getBoolean("status" , false)

        if(isStatus){
            startActivity(Intent(this@MainActivity, ViewActivity::class.java))

        } else {
            setContentView(R.layout.activity_main)
        }

        setContentView(R.layout.activity_main)

        /*Initialising the views with the ones defined in the XML*/
        etMobileNumber = findViewById(R.id.etMobileNumberSU)
        etPassword = findViewById(R.id.etPasswordSU)
        txtForgotPassword = findViewById(R.id.tvForgotPasswordSU)
        registerYourself = findViewById(R.id.tvRegisterYourself)
        login = findViewById(R.id.buttonSU)

        /*Handling the clicks using the setOnClickListener method*/
        txtForgotPassword.setOnClickListener {
            startActivity(Intent(this@MainActivity, ForgetPassword::class.java))
        }
        registerYourself.setOnClickListener {
            startActivity(Intent(this@MainActivity, RegistrationActivity::class.java))
        }


        login.setOnClickListener {

            sharedPreferences.edit().putBoolean("status" , true).apply()

            /*Declaring the intent which sets up the route for the navigation of the activity*/
            val intent = Intent(this@MainActivity, ViewActivity::class.java)

            /*Declaring the bundle object which will carry the data
            * You can send the data inside intents
            *
            * We specifically used Bundle just to demonstrate a new technique*/
            val bundle = Bundle()

            /*Setting a value data which is activity specific. This will be used to identify from where the data was sent*/
            bundle.putString("data", "login")

            /*Putting the values in Bundle*/
            bundle.putString("mobile", etMobileNumber.text.toString())
            bundle.putString("password", etPassword.text.toString())


            /*Putting the Bundle to be shipped with the intent*/
            intent.putExtra("details", bundle)

            /*Starting the new activity by sending the intent in the startActivity method*/
            startActivity(intent)
        }
    }

}