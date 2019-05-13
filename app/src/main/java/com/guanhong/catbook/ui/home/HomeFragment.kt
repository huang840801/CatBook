package com.guanhong.catbook.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.guanhong.catbook.base.BaseFragment
import com.guanhong.catbook.R

class HomeFragment : BaseFragment(), HomeContract.View {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    fun newInstance(): HomeFragment {
        return this
    }
}