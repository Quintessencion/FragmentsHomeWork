package com.example.fragmenthomework;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;
import com.example.fragmenthomework.fragments.FragmentData;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    //Fields
    static final int PAGE_COUNT = 3;

    //Constructor
    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    //Functions
    @Override
    public Fragment getItem(int position) {
        Log.d("myLogs", "Adapter getItem: " + position);
        return FragmentData.newInstance(position);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Time";
            case 1:
                return "Date";
            case 2:
                return "Пиктуре";
        }
        return super.getPageTitle(position);
    }
}
