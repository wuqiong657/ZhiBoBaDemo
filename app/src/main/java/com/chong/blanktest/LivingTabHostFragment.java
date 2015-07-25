package com.chong.blanktest;


import android.content.Context;
import android.os.Bundle;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class LivingTabHostFragment extends Fragment {
    private final String TAG = "LivingTabHostFragment";
    //    @Bind(R.id.viewPager)
    private ViewPager viewPager;
    private FragmentManager fragmentManager;
    private MyPagerAdapter pagerAdapter;

    public LivingTabHostFragment() {
        // Required empty public constructor

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    //和view不相关的，在其它方法中实现
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView");
        View view = inflater.inflate(R.layout.fragment_living_tab_host, container, false);
//        ButterKnife.bind(context, view);
        viewPager = (ViewPager) view.findViewById(R.id.viewPager);
        fragmentManager = getChildFragmentManager();
        pagerAdapter = new MyPagerAdapter(fragmentManager);

        pagerAdapter.addFragment(new ConcernFragment());
        pagerAdapter.addFragment(new ImportantFragment());

        pagerAdapter.addTitle("关注");
        pagerAdapter.addTitle("重要");

        viewPager.setAdapter(pagerAdapter);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
