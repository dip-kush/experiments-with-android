package com.hacknight.expensebot.slidingmenu;

import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.app.ActionBar.Tab;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hacknight.expensebot.R;
import com.hacknight.expensebot.activity.FragmentAdapter;

public class HomeFragment extends Fragment {

	View rootView;
	
	public HomeFragment(){}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		getActivity().getActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		
		rootView = inflater.inflate(R.layout.fragment_home, container, false);
		
		getActivity().setTitle("New tabbel layout inside Fragment :-)");
		
		
		
		
		ActionBar.TabListener tabListener = new ActionBar.TabListener() {
			
			@Override
			public void onTabUnselected(Tab tab, FragmentTransaction ft) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onTabSelected(Tab tab, FragmentTransaction ft) {
				// TODO Auto-generated method stub
//				mPager.setCurrentItem(tab.getPosition());

			}
			
			@Override
			public void onTabReselected(Tab tab, FragmentTransaction ft) {
				// TODO Auto-generated method stub
				
			}
		};
		
		// Add 3 tabs, specifying the tab's text and TabListener
		for (int i1 = 0; i1 < 3; i1++) {
		    getActivity().getActionBar().addTab(
		            getActivity().getActionBar().newTab()
		            .setText("Tab " + (i1 + 1))
		            .setTabListener(tabListener));
		}
		
		return rootView;
	}
	
	
	
}