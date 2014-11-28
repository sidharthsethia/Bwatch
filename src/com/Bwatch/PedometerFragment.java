package com.Bwatch;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class PedometerFragment extends Fragment {
	
	MainActivity mObject = new MainActivity();
	int n1;
	public TextView mAnswerLabel1;
	private TextView mAnswerLabel2;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_pedometer, container,
				false);
		//getFragmentManager().beginTransaction().add(new PedometerFragment(), "PD").commit();
		mAnswerLabel1 = (TextView)rootView.findViewById(R.id.textView1);
		if(mObject==null)
			Toast.makeText(getActivity(), "Null", Toast.LENGTH_LONG).show();
		else
		n1 = mObject.n;
		String data = Integer.toString(n1);
		mAnswerLabel1.setText(data);
		mAnswerLabel2 = (TextView)rootView.findViewById(R.id.textView2);
		mAnswerLabel2.setText(R.string.default_pd);
		return rootView;
		
		
	}
	public void Disp(int n){
		String data = Integer.toString(n);
		mAnswerLabel1.setText(data);
	}
	
}
