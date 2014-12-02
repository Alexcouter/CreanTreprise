package com.example.creantreprise;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

    //	Button quitter;


    @Override
    protected void onCreate(Bundle savedInstanceState)  {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView logo = (ImageView) findViewById(R.id.logoentreprise);
        Button quitter = (Button) findViewById(R.id.quitterbouton);


        Animation fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fadein);
        logo.startAnimation(fadeInAnimation);

        quitter.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction() & MotionEvent.ACTION_MASK) {
                    case MotionEvent.ACTION_DOWN:
                        quitter.setBackgroundColor(0xFF303030); // if you want to handle the touch event
                        return true;
                    case MotionEvent.ACTION_UP:
                        quitter.setBackgroundColor(getResources().getColor(R.color.background_material_light));
                        return true;
                    default:
                        return false;
                }
            }
        });
    }


}

