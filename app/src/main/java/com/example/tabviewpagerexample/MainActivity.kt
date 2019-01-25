package com.example.tabviewpagerexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.FragmentManager
import com.example.tabviewpagerexample.Adapter.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ViewPagerTab.addTab(ViewPagerTab.newTab().setIcon(R.drawable.tab_ic_calendar).setText("달력"))
        ViewPagerTab.addTab(ViewPagerTab.newTab().setIcon(R.drawable.tab_ic_list).setText("목록"))
        ViewPagerTab.addTab(ViewPagerTab.newTab().setIcon(R.drawable.tab_ic_setting).setText("설정"))

        ViewPager.adapter = ViewPagerAdapter(supportFragmentManager)

        ViewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(ViewPagerTab))
        ViewPagerTab.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabReselected(p0: TabLayout.Tab?) {
            }
            override fun onTabUnselected(p0: TabLayout.Tab?) {
            }
            override fun onTabSelected(p0: TabLayout.Tab) {
                ViewPager.currentItem = p0.position
            }

        })


    }
}
