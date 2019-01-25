package com.example.tabviewpagerexample.Adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.example.tabviewpagerexample.TabFragment.FirstFragment
import com.example.tabviewpagerexample.TabFragment.SecondFragment
import com.example.tabviewpagerexample.TabFragment.ThirdFragment

class ViewPagerAdapter (FM: FragmentManager) : FragmentPagerAdapter(FM) {
    override fun getItem(position: Int): Fragment? {
        return when (position) {
            0 -> FirstFragment()

            1 -> SecondFragment()

            2 -> ThirdFragment()

            else -> null
        }
    }

    override fun getCount(): Int {
        return 3
    }


}