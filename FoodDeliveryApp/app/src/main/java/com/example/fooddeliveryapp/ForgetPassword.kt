package com.example.fooddeliveryapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ForgetPassword : AppCompatActivity() {

    /*Declaring the different variables used for this activity*/
    lateinit var etForgotMobile: EditText
    lateinit var etForgotEmail: EditText
    lateinit var btnForgotNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password)
        supportActionBar?.hide()

        /*Linking the view*/
        setContentView(R.layout.activity_forget_password)

        /*Initialising the views with the ones defined in the XML*/
        etForgotMobile = findViewById(R.id.etMobileNumberFP)
        etForgotEmail = findViewById(R.id.etEmailFP)
        btnForgotNext = findViewById(R.id.buttonForget)

        /*Handling the click on the button using the setOnClickListener method*/
        btnForgotNext.setOnClickListener {

            /*Declaring the intent which sets up the route for the navigation of the activity*/
            val intent = Intent(this@ForgetPassword, ViewActivity::class.java)

            /*Declaring the bundle object which will carry the data*/
            val bundle = Bundle()

            /*Setting a value data which is activity specific. This will be used to identify from where the data was sent*/
            bundle.putString("data", "forgot")

            /*Putting the values in Bundle*/
            bundle.putString("mobile", etForgotMobile.text.toString())
            bundle.putString("email", etForgotEmail.text.toString())

            /*Putting the Bundle to be shipped with the intent*/
            intent.putExtra("details", bundle)

            /*Starting the new activity by sending the intent in the startActivity method*/
            startActivity(intent)
        }
    }
}