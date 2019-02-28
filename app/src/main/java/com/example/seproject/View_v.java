package com.example.seproject;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.ActionBar.TabListener;


public class View_v extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewPager viewPager;
    private  viewPagerAdapter adapter;
    private TabLayout tableLayout;

    /////////

    //////////

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_v);

        toolbar = findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        toolbar.getNavigationContentDescription();

        tableLayout = (TabLayout) findViewById(R.id.tabs);

        viewPager = findViewById(R.id.pager);
        adapter = new viewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tableLayout));
        tableLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPager));

        //////
//        viewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
//
//            @Override
//            public void onPageSelected(int position){
//                actionBar.setSelectedNavigationItem(position);
//            }
//        });

//        for(int i=0;i<adapter.getCount();i++) {
//            actionBar.addTab(actionBar.newTab().setText(adapter.getPageTitle(i)).setTabListener(new TabListener() {
//                @Override
//                public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
//                    int id = tab.getPosition();
//                    if(id==1){
//
//                    }
//                }
//
//                @Override
//                public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
//
//

}}


