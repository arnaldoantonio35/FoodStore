package com.example.foodstore.ui.main;

import android.content.Context;
import android.graphics.pdf.PdfDocument;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

import com.example.foodstore.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return PlaceholderFragment.newInstance(position + 1);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // number of pages
        return 3;
    }
    //////////////////////////
    class CustomPagerAdapter extends PagerAdapter {

        Context mContext;
        LayoutInflater mLayoutInflater;
        ArrayList<PdfDocument.Page> pages = new ArrayList<>();

        public CustomPagerAdapter(Context context) {
            mContext = context;
            mLayoutInflater = LayoutInflater.from(mContext);
        }

        // Returns the number of pages to be displayed in the ViewPager.
        @Override
        public int getCount() {
            return pages.size();
        }

        // Returns true if a particular object (page) is from a particular page
        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        // This method should create the page for the given position passed to it as an argument.
        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            // Inflate the layout for the page
            View itemView = mLayoutInflater.inflate(R.layout.pager_item, container, false);
            // Find and populate data into the page (i.e set the image)
            ImageView imageView = (ImageView) itemView.findViewById(R.id.imageView);

            // Add the page to the container
            container.addView(itemView);
            // Return the page
            return itemView;
        }

        // Removes the page from the container for the given position.
        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }
    }
}