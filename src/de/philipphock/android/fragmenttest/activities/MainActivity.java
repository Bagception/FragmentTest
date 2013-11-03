package de.philipphock.android.fragmenttest.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import de.philipphock.android.fragmenttest.DetailActivity;
import de.philipphock.android.fragmenttest.R;
import de.philipphock.android.fragmenttest.fragments.DetailsFragment;
import de.philipphock.android.fragmenttest.fragments.MyListFragment.OnItemSelectedListener;

public class MainActivity extends Activity implements OnItemSelectedListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}

	@Override
	public void onRssItemSelected(String link) {
		DetailsFragment fragment = (DetailsFragment) getFragmentManager()
				.findFragmentById(R.id.detailsFragment);
		if (fragment != null && fragment.isInLayout()) {
			fragment.setText(link);
		} else {
			Intent intent = new Intent(getApplicationContext(),
					DetailActivity.class);
			intent.putExtra(DetailActivity.EXTRA_URL, link);
			startActivity(intent);

		}
	}

}
