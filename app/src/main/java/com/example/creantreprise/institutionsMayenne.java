package com.example.creantreprise;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class institutionsMayenne extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_institutions);
        final Button retourAccueil = (Button) findViewById(R.id.accueilInstitution);
        final Button entreprendreLien = (Button) findViewById(R.id.entreprendreMayenneButton);
        final Button initiativeLien = (Button) findViewById(R.id.initiativeMayenneButton);
        final Button creationRepriseLien = (Button) findViewById(R.id.creationReprisesButton);


        retourAccueil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(institutionsMayenne.this, MainActivity.class);
                startActivity(intent);
            }
        });

        entreprendreLien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.annuaires.justice.gouv.fr/cdad-12163/cdad-de-la-mayenne-25340.html")));
            }

        });

        initiativeLien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.greffe-tc-laval.fr/")));
            }

        });

        creationRepriseLien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.reseau-entreprendre-mayenne.fr/")));
            }

        });
    }


}
