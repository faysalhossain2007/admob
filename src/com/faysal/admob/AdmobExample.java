package com.faysal.admob;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

import com.google.ads.AdRequest;
import com.google.ads.AdSize;
import com.google.ads.AdView;

public class AdmobExample extends Activity {
	/** Called when the activity is first created. */
	private AdView adView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		adView = new AdView(this, AdSize.BANNER, "Your ID");

		LinearLayout rootView = (LinearLayout) this
				.findViewById(R.id.rootViewGroup);
		LinearLayout.LayoutParams layoutParams = new LayoutParams(580, 85);
		rootView.addView(adView, 0, layoutParams);

		AdRequest re = new AdRequest();
		re.setGender(AdRequest.Gender.FEMALE);
		adView.loadAd(re);
	}
}