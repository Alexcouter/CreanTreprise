package com.example.creantreprise;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

	//	Button quitter;


	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ImageView logo = (ImageView)findViewById(R.id.logoentreprise);
		

		Animation fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fadein);
		logo.startAnimation(fadeInAnimation);

	}

}
