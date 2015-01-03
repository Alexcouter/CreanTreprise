package com.example.creantreprise;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class institutionsMayenne extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_institutions);
        final Button retourAccueil = (Button) findViewById(R.id.accueilInstitution);

        retourAccueil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(institutionsMayenne.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }


}
