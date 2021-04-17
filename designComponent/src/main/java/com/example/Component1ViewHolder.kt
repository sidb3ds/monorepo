package com.example

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.base.BaseViewHolder
import com.example.base.R
import com.example.builder.Component

class Component1ViewHolder(itemView : View) : BaseViewHolder(itemView) {
    val textView = itemView.findViewById<TextView>(R.id.textView)

    override fun onBindViewHolder(component: Component) {
        textView.text = component.data
    }

}