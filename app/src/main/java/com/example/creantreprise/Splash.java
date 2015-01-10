package com.example.creantreprise;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

public class Splash extends Activity {

    private static String TAG = Splash.class.getName();
    private static long SLEEP_TIME = 3;    // Sleep for some time
    private DBHelper bdd ;
    int type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);    // Removes title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);    // Removes notification bar

        setContentView(R.layout.activity_splash);
        bdd = new DBHelper(this);
        // Start timer and launch main activity
        IntentLauncher launcher = new IntentLauncher();
        launcher.start();
    }

    private class IntentLauncher extends Thread {
        @Override
        /**
         * Sleep for some time and than start new activity.
         */
        public void run() {
            try {
                // Sleeping
                Thread.sleep(SLEEP_TIME * 1000);
            } catch (Exception e) {
                Log.e(TAG, e.getMessage());
            }


//            Bundle extras = getIntent().getExtras();
//            type = bdd.getData();
            // Suivant le questionnaire on choisit de rentrer ou non sur la page d'accueil.
//
//            if(type == 2){
//                Intent intent = new Intent(Splash.this, reponseQuestionnaire.class);
//                Splash.this.startActivity(intent);
//                Splash.this.finish();
//            }
//            else if (type == 1){
                Intent intent = new Intent(Splash.this, MainActivity.class);
                Splash.this.startActivity(intent);
                Splash.this.finish();
//            }
//            else {
//                Intent intent = new Intent(Splash.this, QuestionnaireEntree.class);
//                Splash.this.startActivity(intent);
//                Splash.this.finish();
//            }

       }
    }
}
