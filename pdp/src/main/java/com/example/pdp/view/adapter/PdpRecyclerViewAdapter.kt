package com.example.pdp.view.adapter

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.base.BaseViewHolder
import com.example.builder.WidgetBuilder
import com.example.builder.Component


class PdpRecyclerViewAdapter(val context: Context, val list: List<Component>) :
    RecyclerView.Adapter<BaseViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        return WidgetBuilder.getWidgetViewHolder(context, parent, viewType)
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.onBindViewHolder(list[position])
    }

    override fun getItemViewType(position: Int): Int {
        return list[position].widgetId
    }

    override fun getItemCount(): Int {
        return list.size
    }

}