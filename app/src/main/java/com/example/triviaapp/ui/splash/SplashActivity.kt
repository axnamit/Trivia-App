package com.example.triviaapp.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.example.triviaapp.R
import com.example.triviaapp.ui.BaseActivity
import com.example.triviaapp.ui.name.NameActivity


class SplashActivity : BaseActivity() {
    override val layoutRes: Int
        get() = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /***
         * this thread will hold screen for 1 sec
         */
        Handler().postDelayed(Runnable {
            val mainIntent = Intent(this@SplashActivity, NameActivity::class.java)

            mainIntent.flags =
                Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK //this will clear back stack
            startActivity(mainIntent)
            finish()
        }, 1000)
    }
}