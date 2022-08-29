package com.example.diagnosis;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

public class Diagnosis55 extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    VPAdapter vpAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosis);

        GlobalClass.f1 = false;
        GlobalClass.f2 = false;
        GlobalClass.f3 = false;
        GlobalClass.f4 = false;
        GlobalClass.f5 = false;
        GlobalClass.f6 = false;
        GlobalClass.f7 = false;
        GlobalClass.f8 = false;
        GlobalClass.f9 = false;
        GlobalClass.f10 = false;
        GlobalClass.f11 = false;
        GlobalClass.f12 = false;
        GlobalClass.f13 = false;
        GlobalClass.f14 = false;
        GlobalClass.f15 = false;
        GlobalClass.f16 = false;
        GlobalClass.f17 = false;
        GlobalClass.f18 = false;
        GlobalClass.f19 = false;
        GlobalClass.f20 = false;
        GlobalClass.f21 = false;
        GlobalClass.f22 = false;
        GlobalClass.f23 = false;
        GlobalClass.f24 = false;
        GlobalClass.f25 = false;
        GlobalClass.f26 = false;
        GlobalClass.f27 = false;
        GlobalClass.f28 = false;
        GlobalClass.f29 = false;


        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tabs);


        vpAdapter = new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vpAdapter.addFragment(new Fragment1(), "List 1");
        vpAdapter.addFragment(new Fragment2(), "List 2");
        vpAdapter.addFragment(new Fragment3(), "List 3");


        viewPager.setAdapter(vpAdapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                tabLayout.getTabAt(position).select();
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }



}