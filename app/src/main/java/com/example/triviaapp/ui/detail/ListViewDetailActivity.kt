package com.example.triviaapp.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.triviaapp.R
import com.example.triviaapp.data.uimodel.Model
import com.example.triviaapp.utils.SingletonClass
import kotlinx.android.synthetic.main.activity_list_view_detail.*


class ListViewDetailActivity : AppCompatActivity() {
    var list: MutableList<Model> = arrayListOf()
    lateinit var detailAdapter: DetailAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view_detail)
        list = SingletonClass.instance?.data!!
        detailAdapter = DetailAdapter(list)
        val linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)


        r_view.apply {
            layoutManager = linearLayoutManager
            adapter = detailAdapter
        }


    }
}