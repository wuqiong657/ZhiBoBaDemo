package com.chong.blanktest;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.ViewGroup;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuwuqiong on 7/23/15.
 */
public class MyPagerAdapter extends FragmentStatePagerAdapter {
    //    private FragmentManager fm;
    private List<Fragment> list;
    private List<String> titleList;

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
        list = new ArrayList<Fragment>();
        titleList = new ArrayList<String>();
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }


    public void addFragment(Fragment fragment) {
        list.add(fragment);
        notifyDataSetChanged();     //what's the meaning?
    }

    //please add by sequence
    public void addTitle(String title)
    {
        titleList.add(title);
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return titleList.get(position);
    }


}
