package com.guanhong.catbook.ui.mail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.guanhong.catbook.base.BaseFragment
import com.guanhong.catbook.R

class MailFragment: BaseFragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_mail, container, false)
    }

    fun newInstance(): MailFragment {
        return this
    }
}