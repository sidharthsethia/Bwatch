package com.Bwatch;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HeartBeatFragment extends Fragment {
	
	private TextView mAnswerLabel1;
	private TextView mAnswerLabel2;
	String data;
	NumberGenerator num = new NumberGenerator();
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_heartbeat, container,
				false);
		mAnswerLabel1 = (TextView)rootView.findViewById(R.id.textView1);
		data = Integer.toString(num.NGen(80));
		mAnswerLabel1.setText(data);
		mAnswerLabel2 = (TextView)rootView.findViewById(R.id.textView2);
		mAnswerLabel2.setText(R.string.default_hr);
		return rootView;
	}
	
}
