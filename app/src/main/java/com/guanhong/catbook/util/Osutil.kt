package com.guanhong.catbook.util

import android.app.Activity
import android.content.res.Resources
import android.util.DisplayMetrics

/**
 *
 * @author RyanLee
 * @date 2017/11/29
 */

object OsUtil {


    /**
     * 获取屏幕宽度
     *
     * @return
     */
    val screenWidth: Int
        get() = Resources.getSystem().displayMetrics.widthPixels

    /**
     * 获取屏幕高度
     *
     * @return
     */
    val screenHeigth: Int
        get() = Resources.getSystem().displayMetrics.heightPixels

    fun dpToPx(dp: Int): Int {
        return (dp * Resources.getSystem().displayMetrics.density).toInt()
    }

    fun pxToDp(px: Int): Int {
        return (px / Resources.getSystem().displayMetrics.density).toInt()
    }

    /**
     * 获取屏幕宽度
     *
     * @return
     */
    fun getScreenWidth(activity: Activity): Int {
        val outMetrics = DisplayMetrics()
        activity.windowManager.defaultDisplay.getMetrics(outMetrics)
        return outMetrics.widthPixels

    }
}
