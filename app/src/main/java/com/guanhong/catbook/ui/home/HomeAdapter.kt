package com.guanhong.catbook.ui.home

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.guanhong.catbook.R

class HomeAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private lateinit var stringList: Array<String>
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_home_article, parent, false)
        return HomeArticleHolder(view).setResource(parent.context)
    }

    override fun getItemCount(): Int = stringList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when (holder) {
            is HomeArticleHolder -> {
                holder.setResult(stringList[position])
            }
        }
    }

    fun onBindArticle(stringList: Array<String>) {
        this.stringList = stringList
        notifyDataSetChanged()
    }
}