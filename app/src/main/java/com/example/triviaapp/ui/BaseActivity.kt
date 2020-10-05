package com.example.triviaapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.triviaapp.R
import kotlinx.android.synthetic.main.activity_base.*

abstract class BaseActivity : AppCompatActivity() {
    abstract val layoutRes: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)

        root_layout.addView(layoutInflater.inflate(layoutRes, null, false))

    }
}