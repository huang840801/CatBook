package com.guanhong.catbook.util

import android.graphics.Rect
import android.support.v7.widget.RecyclerView
import android.view.View
import com.guanhong.catbook.util.OsUtil.dpToPx

class GalleryItemDecoration(private val space: Int) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        super.getItemOffsets(outRect, view, parent, state)

        val position = parent.getChildAdapterPosition(view)
        val itemCount = parent.adapter!!.itemCount

        outRect.top = dpToPx(space)
        outRect.left = dpToPx(space)
        outRect.right = dpToPx(space)

        if (position == itemCount -1) {

            outRect.bottom = dpToPx(space)
        }
    }
}