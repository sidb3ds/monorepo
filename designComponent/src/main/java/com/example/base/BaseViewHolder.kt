package com.example.base

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.builder.Component

abstract class BaseViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
    abstract fun onBindViewHolder(component: Component)
}