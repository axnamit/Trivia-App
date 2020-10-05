package com.example.triviaapp.ui.name

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Toast
import com.example.triviaapp.R
import com.example.triviaapp.ui.BaseActivity
import com.example.triviaapp.ui.cricketer_name.CricketerName
import com.example.triviaapp.ui.detail.ListViewDetailActivity
import com.example.triviaapp.utils.SingletonClass
import kotlinx.android.synthetic.main.activity_name.*

class NameActivity : BaseActivity() {
    override val layoutRes: Int
        get() = R.layout.activity_name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /***
         * checking here if list is greater than zero
         * if greater than zero will show history button otherwise it is hidden
         */
        var js = SingletonClass.instance?.data
        if (js?.size!! <= 0) {
            history.visibility = View.GONE
        }

        /***
         * this  will lead to ListViewDetail activity which is showing history
         */
        history.setOnClickListener {
            var ds = SingletonClass.instance?.data
            if (ds?.size!! > 0) {
                startActivity(Intent(this, ListViewDetailActivity::class.java))

            } else {
                Toast.makeText(this, "Please complete one step at least", Toast.LENGTH_SHORT).show()
            }

        }
        /***
         * this will lead to next page
         */
        submit.setOnClickListener {
            val name_text = name.text.toString()
            //storing the  name value to singleton
            SingletonClass.instance?.setName(name_text)
            /**
             * if text is empty will throw a toast message
             */
            if (TextUtils.isEmpty(name_text)) {
                Toast.makeText(this, "Please enter your name ", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            startActivity(Intent(this, CricketerName::class.java))
        }
        // setContentView(R.layout.activity_name)
    }
}