package com.example.triviaapp.ui.flagcolor

import android.content.Intent
import android.os.Bundle
import com.example.triviaapp.R
import com.example.triviaapp.data.uimodel.Model
import com.example.triviaapp.ui.BaseActivity
import com.example.triviaapp.ui.name.NameActivity
import com.example.triviaapp.utils.SingletonClass
import kotlinx.android.synthetic.main.activity_flag.*
import java.util.*

class FlagActivity : BaseActivity() {
    override val layoutRes: Int
        get() = R.layout.activity_flag

    var list: MutableList<String> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        submit.setOnClickListener {
            var ds = SingletonClass.instance?.data

            if (white.isChecked) {

                list.add("white")
            }
            if (yellow.isChecked) {
                list.add("yellow")
            }

            if (orange.isChecked) {
                list.add("orange")
            }

            if (green.isChecked) {
                list.add("green")
            }

          //  SingletonClass.instance?.setFlagList(list)
            val name = SingletonClass.instance?.nameText
            val cName = SingletonClass.instance?.cricketerName
            if (name != null) {
                var d = Date()
                var s = cName?.let { it1 -> Model(name, it1, list, d) }

                var j = arrayListOf<Model>()
                ds?.forEach { e ->
                    j.add(e)
                }
                if (s != null) {
                    j.add(s)
                    SingletonClass.instance?.setData(j)
                }

            }

            startActivity(Intent(this, NameActivity::class.java))


        }
    }
}