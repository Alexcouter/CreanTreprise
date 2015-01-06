package com.example.creantreprise;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;


public class affichageBilan extends Activity{

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_affichagebilan);
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }


    }

