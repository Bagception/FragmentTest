package de.philipphock.android.fragmenttest.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import de.philipphock.android.fragmenttest.R;

public class MyListFragment extends Fragment{
	
	private OnItemSelectedListener listener;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_list_overview, container,false);
		Button button = (Button) v.findViewById(R.id.button1);
		button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				updateDetail();
				
			}
		});
		
		return v;
	}
	
	public interface OnItemSelectedListener{
		public void onRssItemSelected(String link);
	}
	
	@Override
	public void onAttach(Activity activity) {
	
		super.onAttach(activity);
		if (activity instanceof OnItemSelectedListener){
			listener = (OnItemSelectedListener) activity;
		}else{
			throw new ClassCastException(activity.toString()+" must impleent MyListFragment.OnItemSelectedListener");
		}
	}
	
	public void updateDetail(){
		String newTime = System.currentTimeMillis()+"";
		listener.onRssItemSelected(newTime);
	}
}
