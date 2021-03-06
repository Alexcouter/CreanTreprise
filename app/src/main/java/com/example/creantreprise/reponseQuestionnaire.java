package com.example.creantreprise;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class reponseQuestionnaire extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reponse_questionnaire);
        //Desinstallation
        final Button ok = (Button) findViewById(R.id.okreponse);
        final TextView triste = (TextView) findViewById(R.id.nonconcerné);

        SharedPreferences settings = getApplicationContext().getSharedPreferences("Donnees_User", 0);
        int type = settings.getInt("TypeUtilisateur", 0);
        if(type == 1){
            triste.setText("Désolé, votre profil (salarié) ne correspond pas aux critères d'utilisation de l'application");
        }
        if(type == 2){
            triste.setText("Désolé, votre profil (fonctionnaire) ne correspond pas aux critères d'utilisation de l'application");
        }

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri packageURI = Uri.parse("package:com.android.creantreprise");
                Intent uninstallIntent = new Intent(Intent.ACTION_DELETE, packageURI);
                startActivity(uninstallIntent);
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_reponse_questionnaire, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
