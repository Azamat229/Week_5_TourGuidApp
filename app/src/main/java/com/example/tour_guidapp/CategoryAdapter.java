
package com.example.tour_guidapp;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;



public class CategoryAdapter extends FragmentPagerAdapter {


    private Context mContext;


    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {


        if (position == 0) {
            return new MonumentsFragment();
        } else if (position == 1) {
            return new ShopsFragment();
        } else {
            return new RestaurantsFragment();
        }


    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.monuments);
        } else if (position == 1) {
            return mContext.getString(R.string.shops);
        } else {
            return mContext.getString(R.string.restaurants);
        }
    }
}
