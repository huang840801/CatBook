package com.guanhong.catbook

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.util.Log
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),
        BottomNavigationView.OnNavigationItemSelectedListener,
        ViewPager.OnPageChangeListener {

    private lateinit var homeFragment: HomeFragment
    private lateinit var mailFragment: MailFragment
    private lateinit var notificationFragment: NotificationFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigation.setOnNavigationItemSelectedListener(this)

        setupViewPager()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when (item.itemId){

            R.id.navigation_home ->{
                viewPager.currentItem = 0
            }
            R.id.navigation_mail ->{
                viewPager.currentItem = 1
            }
            R.id.navigation_notifications ->{
                viewPager.currentItem = 2
            }
        }
        return true
    }

    override fun onPageScrollStateChanged(position: Int) {

    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
    }

    override fun onPageSelected(position: Int) {
        bottomNavigation.menu.getItem(position).isChecked = true
    }

    private fun setupViewPager() {

        homeFragment = HomeFragment().newInstance()
        mailFragment = MailFragment().newInstance()
        notificationFragment = NotificationFragment().newInstance()

        val fragmentList = mutableListOf<Fragment>()
        fragmentList.add(homeFragment)
        fragmentList.add(mailFragment)
        fragmentList.add(notificationFragment)

        val adapter = MainViewPagerAdapter(supportFragmentManager, fragmentList)

        viewPager.adapter = adapter
        viewPager.addOnPageChangeListener(this)
    }
}
