package com.guanhong.catbook.ui.notification

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.guanhong.catbook.base.BaseFragment
import com.guanhong.catbook.R

class NotificationFragment: BaseFragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_notification, container, false)
    }
    fun newInstance(): NotificationFragment {
        return this
    }
}