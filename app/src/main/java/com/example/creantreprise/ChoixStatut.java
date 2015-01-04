package com.example.creantreprise;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class ChoixStatut extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix_statut);
        final Button entrInd = (Button) findViewById(R.id.Button1);
        final Button eurl = (Button) findViewById(R.id.Button2);
        final Button sarl = (Button) findViewById(R.id.Button3);
        final Button sas = (Button) findViewById(R.id.Button4);

        entrInd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(),EntrepriseInd.class);
                startActivity(i);
            }
        });

        eurl.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(),Eurl.class);
                startActivity(i);
            }
        });

        sarl.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(),Sarl.class);
                startActivity(i);
            }
        });

        sas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(),Sas.class);
                startActivity(i);
            }
        });



    }


}
