package com.example.test.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.test.R
import com.example.test.model.note_data

class note_adapter(
    val mContext : Context,
    val mList : List<note_data>,
): RecyclerView.Adapter<note_adapter.MyViewHolder> () {
    inner class MyViewHolder(row : View) : RecyclerView.ViewHolder(row) {
        val txtTitle = row.findViewById<TextView>(R.id.txtTitle)
        val txtContents = row.findViewById<TextView>(R.id.txtContents)

        fun bind(data:note_data) {
            txtTitle.text=data.title
            txtContents.text=data.contents
        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val row = LayoutInflater.from(mContext).inflate(R.layout.note_list_item, parent, false)
        return MyViewHolder(row)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind (mList[position])

    }

    override fun getItemCount(): Int {
        return mList.size
    }
}