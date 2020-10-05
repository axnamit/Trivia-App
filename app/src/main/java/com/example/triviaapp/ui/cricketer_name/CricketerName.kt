package com.example.triviaapp.ui.cricketer_name

import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import com.example.triviaapp.R
import com.example.triviaapp.ui.BaseActivity
import com.example.triviaapp.ui.flagcolor.FlagActivity
import com.example.triviaapp.utils.SingletonClass
import kotlinx.android.synthetic.main.activity_crickter_name.*


class CricketerName : BaseActivity() {
    override val layoutRes: Int
        get() = R.layout.activity_crickter_name
    var ccName: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /**
         * on change callback for radio group
         */
        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            val radio: RadioButton = findViewById(checkedId)

            ccName = radio.text.toString()


        }

        submit.setOnClickListener {
            if (ccName != "") {
                SingletonClass.instance?.setCricketerName(ccName)
                startActivity(Intent(this, FlagActivity::class.java))

            } else {
                Toast.makeText(this, "Please select one of them", Toast.LENGTH_SHORT).show()
            }
        }
    }
}