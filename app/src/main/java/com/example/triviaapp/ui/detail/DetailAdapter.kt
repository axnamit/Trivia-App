package com.example.triviaapp.ui.detail

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.triviaapp.R
import com.example.triviaapp.data.uimodel.Model
import kotlinx.android.synthetic.main.item_view_rv.view.*
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

class DetailAdapter(var list: MutableList<Model>) :
    RecyclerView.Adapter<DetailAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_view_rv, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.apply {
            val dateFormat: DateFormat = SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.US)
            val da = list[position].date
            date.text = dateFormat.format(da)
            name.text = list[position].name
            cricketr.text = list[position].cricketerName
            flag_.text = list[position].flagColor.joinToString()
        }
    }

    override fun getItemCount(): Int = list.size

}