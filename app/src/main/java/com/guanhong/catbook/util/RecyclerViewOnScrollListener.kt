package com.guanhong.catbook.util

import android.support.v7.widget.RecyclerView
import android.util.Log
import com.guanhong.catbook.util.OsUtil.screenHeigth
import com.guanhong.catbook.util.OsUtil.screenWidth

class RecyclerViewOnScrollListener: RecyclerView.OnScrollListener() {

    override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
        super.onScrolled(recyclerView, dx, dy)

        val position = recyclerView

//        val itemView = recyclerView.findViewHolderForAdapterPosition(0)!!.itemView.height

        Log.d("Huang", " y = "+dy)
//        Log.d("Huang", " itemView = "+itemView)
        Log.d("Huang", " screenWidth = "+screenWidth)
        Log.d("Huang", " screenHeigth = "+screenHeigth)
    }

    override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
        super.onScrollStateChanged(recyclerView, newState)

        Log.d("Huang", " newState = "+newState)

    }
}