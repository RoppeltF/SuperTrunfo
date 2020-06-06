package com.example.supertrunfo.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.supertrunfo.R;
import com.example.supertrunfo.batman;
import com.example.supertrunfo.ironman;
import com.example.supertrunfo.spiderman;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {


    @StringRes

    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2,R.string.tab_text_3,
                                                      R.string.tab_text_4,R.string.tab_text_5,R.string.tab_text_6,
                                                      R.string.tab_text_7,R.string.tab_text_8};

   /* private static final int[] TAB_TITLES = new int[]{R.drawable.ic_batman, R.drawable.ic_spider, R.drawable.ic_ironman,R.drawable.ic_superman};*/

    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        //return PlaceholderFragment.newInstance(position + 1);
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new batman();
                break;
            case 1:
                fragment = new spiderman();
                break;
            case 2:
                fragment = new ironman();
                break;
        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 3;
        //return TAB_TITLES.length;
    }
}