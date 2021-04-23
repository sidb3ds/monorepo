package com.example.builder

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.Component1ViewHolder
import com.example.Component2ViewHolder
import com.example.Component3ViewHolder
import com.example.base.BaseViewHolder
import com.example.base.R
import java.lang.IllegalArgumentException

object WidgetBuilder {

    fun getWidgetViewHolder(context: Context, parent: ViewGroup, widgetId: Int): BaseViewHolder {
        return when (widgetId) {
            1 -> {
                getComponent1ViewHolder(context,parent)
            }
            2 -> {
                getComponent2ViewHolder(context, parent)
            }
            3 -> {
                getComponent3ViewHolder(context, parent)
            }
            else -> {
                throw IllegalArgumentException("No viewholder defined for the given widget id")
            }
        }
    }

    private fun getComponent1ViewHolder(context: Context, parent: ViewGroup): BaseViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.component1, parent, false)
        return Component1ViewHolder(view)
    }

    private fun getComponent2ViewHolder(context: Context, parent: ViewGroup): BaseViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.component2, parent, false)
        return Component2ViewHolder(view)
    }

    private fun getComponent3ViewHolder(context: Context, parent: ViewGroup): BaseViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.component3, parent, false)
        return Component3ViewHolder(view)
    }

}