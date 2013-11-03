package de.philipphock.android.fragmenttest.fragments;

import de.philipphock.android.fragmenttest.R;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailsFragment extends Fragment{
	
		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			
			return  inflater.inflate(R.layout.fragment_item_detail, container,false);
			
			
		}
		
		public void setText(String text) {
			TextView v = (TextView) getView().findViewById(R.id.detailsText);
			v.setText(text);

		}
	
}
