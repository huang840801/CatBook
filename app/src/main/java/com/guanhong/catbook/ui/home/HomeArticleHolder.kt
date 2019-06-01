package com.guanhong.catbook.ui.home

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.widget.TextView
import com.guanhong.catbook.R

class HomeArticleHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val title = itemView.findViewById<TextView>(R.id.title)

    fun setResource(context: Context): RecyclerView.ViewHolder {
        return this
    }
    fun setResult(s: String) {

        title.text = s
    }
}