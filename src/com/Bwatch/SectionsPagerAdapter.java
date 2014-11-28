package com.Bwatch;

import java.util.Locale;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

	Context mContext;
	public SectionsPagerAdapter(Context context, android.support.v4.app.FragmentManager fragmentManager) {
		super(fragmentManager);
		mContext = context;
	}

	@Override
	public Fragment getItem(int position) {
		// getItem is called to instantiate the fragment for the given page.
		// Return a PlaceholderFragment (defined as a static inner class
		// below).
		switch(position)
		{
		case 0:
			return new HeartBeatFragment();
		case 1:
			return new PedometerFragment();
		case 2:
			return new BloodPressureFragment();
			
		}
		return null;
	}

	@Override
	public int getCount() {
		// Show 3 total pages.
		return 3;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		Locale l = Locale.getDefault();
		switch (position) {
		case 0:
			return mContext.getString(R.string.title_section1).toUpperCase(l);
		case 1:
			return mContext.getString(R.string.title_section2).toUpperCase(l);
		case 2:
			return mContext.getString(R.string.title_section3).toUpperCase(l);
		}
		return null;
	}
}
