package com.Bwatch;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BloodPressureFragment extends Fragment {
	private TextView mAnswerLabel1;
	private TextView mAnswerLabel2;
	NumberGenerator num = new NumberGenerator();
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_bloodpressure, container,
				false);
		mAnswerLabel1 = (TextView)rootView.findViewById(R.id.textView1);
		String data1 = Integer.toString(num.NGen(120));
		String data2 = data1 + "/" + Integer.toString(num.NGen(80));
		
		mAnswerLabel1.setText(data2);
		mAnswerLabel2 = (TextView)rootView.findViewById(R.id.textView2);
		mAnswerLabel2.setText(R.string.default_bp);
		return rootView;
	}
	
	
}
