package com.example.unitconverter.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.unitconverter.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.currency, R.string.length, R.string.weight, R.string.temperature};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        Fragment unitFragment = null;
        switch (position) {
            case 0:
                unitFragment = CurrencyFragment.newInstance();
                break;
            case 1:
                unitFragment = LengthFragment.newInstance();
                break;
            case 2:
                unitFragment = WeightFragment.newInstance();
                break;
            case 3:
                unitFragment = TempFragment.newInstance();
                break;
            default:
                unitFragment = PlaceholderFragment.newInstance(position + 1);
        }
        return unitFragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 4 total pages.
        return 4;
    }
}