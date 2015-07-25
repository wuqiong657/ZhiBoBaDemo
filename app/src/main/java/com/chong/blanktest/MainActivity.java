package com.chong.blanktest;











import android.os.Bundle;


import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;


import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;


import butterknife.Bind;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {

//    @Bind(R.id.main_frameLayout)
//    FrameLayout frameLayout;
//    @Bind(R.id.main_listview)
//    ListView listView;
//    @Bind(R.id.drawerLayout)
//    DrawerLayout drawerLayout;

    @Bind(R.id.fragmentTabHost)
    FragmentTabHost tabHost;



    private ActionBar actionBar;

    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        actionBar = getSupportActionBar();


//        actionBar.setHomeButtonEnabled(true);   //enable
//        actionBar.setDisplayHomeAsUpEnabled(false);  //add back arrow
//        actionBar.setLogo(R.drawable.ic_menu_white_18dp);
//        actionBar.setTitle("lwq");
//        actionBar.setDisplayUseLogoEnabled(true);
//        actionBar.setDisplayShowHomeEnabled(true);


        fragmentManager = getSupportFragmentManager();
//        FragmentTransaction transaction = fragmentManager.beginTransaction();
//        transaction.add(new NewsFragment(), null);
//        transaction.add(new VideoFragment(), null);
//        transaction.commit();

        //add the
//        fragmentManager.saveFragmentInstanceState(new NewsFragment());
//        fragmentManager.saveFragmentInstanceState(new VideoFragment());

//        MyPagerAdapter adapter = new MyPagerAdapter(fragmentManager);
//        adapter.add(new NewsFragment());
//        adapter.add(new VideoFragment());
//        adapter.addTitle("news");
//        adapter.addTitle("video");
//        viewPager.setAdapter(adapter);

        tabHost.setup(this, fragmentManager, R.id.main_frameLayout_content);
        tabHost.addTab(tabHost.newTabSpec("Living").setIndicator("直播"), LivingTabHostFragment.class, null);
        tabHost.addTab(tabHost.newTabSpec("Video").setIndicator("视频"), VideoTabHostFragment.class, null);
    }



}
