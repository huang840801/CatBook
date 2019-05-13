package com.guanhong.catbook.ui.main

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class MainViewPagerAdapter(fm: FragmentManager,
                           private val fragmentList: List<Fragment>
): FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment  = fragmentList[position]

    override fun getCount(): Int  = fragmentList.count()
}