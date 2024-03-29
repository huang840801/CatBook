package com.guanhong.catbook.ui.home

import android.app.Activity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.LinearSnapHelper
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.guanhong.catbook.base.BaseFragment
import com.guanhong.catbook.R
import com.guanhong.catbook.util.GalleryItemDecoration
import com.guanhong.catbook.util.RecyclerViewOnScrollListener
import dagger.android.support.AndroidSupportInjection
import kotlinx.android.synthetic.main.fragment_home.*
import javax.inject.Inject

class HomeFragment : BaseFragment(), HomeContract.View {

    @Inject
    lateinit var presenter: HomePresenter

    private lateinit var adapter: HomeAdapter
    override fun onAttach(activity: Activity?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(activity)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = HomeAdapter()
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = adapter
        recyclerView.addItemDecoration(GalleryItemDecoration(8))

        LinearSnapHelper().attachToRecyclerView(recyclerView)
        recyclerView.addOnScrollListener(RecyclerViewOnScrollListener())

        setMockList()

        presenter.test()
    }

    private fun setMockList() {

        val stringList = arrayOf("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh", "iii", "jjj")
        adapter.onBindArticle(stringList)
    }
    fun newInstance(): HomeFragment = this
}