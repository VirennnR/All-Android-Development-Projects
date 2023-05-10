package com.example.fooddeliveryapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        supportActionBar?.hide()

        /*This is how we change the activity with a delay of 2000 milliseconds.
       * The delay time can be changed by changing the value of the time in milliseconds
       * Here the activity is displayed for 2 seconds and then the Handler starts the new process after 2 seconds
       * the new task is the one which we write inside the handler.
       * startActivity() is used to start the new activity, whereas finish() is used to destroy the current activity.
       * We use finish() here so the when the user presses back button, she is not redirected to this activity*/

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 2000)
    }
}