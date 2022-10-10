package com.example.foodstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;


import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.ColorSpace;
import android.os.Bundle;
import android.view.View;

import com.example.foodstore.databinding.ActivityMainBinding;
import com.example.foodstore.ui.main.SectionsPagerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

public class CartActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private View actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);


    }


}