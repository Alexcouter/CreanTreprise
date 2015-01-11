package com.example.creantreprise;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;


public class reponseQuestionnaire2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reponse_questionnaire2);

        final Intent i1 = new Intent(reponseQuestionnaire2.this, reponse1.class);
        final Intent i2 = new Intent(reponseQuestionnaire2.this, reponse2.class);
        final Intent i3 = new Intent(reponseQuestionnaire2.this, reponse3.class);
        final Intent i4 = new Intent(reponseQuestionnaire2.this, reponse4.class);
        final Intent i5 = new Intent(reponseQuestionnaire2.this, reponse5.class);

        final RadioButton q1r1 = (RadioButton) findViewById(R.id.bq1r1);
        final RadioButton q1r2 = (RadioButton) findViewById(R.id.bq1r2);

        final RadioButton q2r1 = (RadioButton) findViewById(R.id.bq2r1);
        final RadioButton q2r2 = (RadioButton) findViewById(R.id.bq2r2);

        final RadioButton q3r1 = (RadioButton) findViewById(R.id.bq3r1);
        final RadioButton q3r2 = (RadioButton) findViewById(R.id.bq3r2);

        final RadioButton q4r1 = (RadioButton) findViewById(R.id.bq4r1);
        final RadioButton q4r2 = (RadioButton) findViewById(R.id.bq4r2);

        final Button boutonSuivant = (Button) findViewById(R.id.Questionnaire2);

        boutonSuivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (q2r2.isChecked()) {
                    reponseQuestionnaire2.this.startActivity(i1);
                } else if (q1r1.isChecked() && q3r2.isNotChecked) {
                    reponseQuestionnaire2.this.startActivity(i2);
                } else if (q1r1.isChecked() && q3r2.isChecked()) {
                    reponseQuestionnaire2.this.startActivity(i3);
                } else if (q1r2.isChecked() && q3r2.isNotChecked) {
                    reponseQuestionnaire2.this.startActivity(i4);
                } else if (q1r2.isChecked() && q3r2.isChecked()) {
                    reponseQuestionnaire2.this.startActivity(i5);
                }


            }
        }
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_reponse_questionnaire2, menu);
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
