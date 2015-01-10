package com.example.creantreprise;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

//import android.view.animation.AnimationSet;


public class QuestionnaireEntree extends Activity {
    int duration = Toast.LENGTH_SHORT;
    int fonctionnaire, entrepreneur, salarie = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnaire_entree);

        TextView questionnaireentree = (TextView)findViewById(R.id.questionnaireentree);
        final Intent i1 = new Intent(QuestionnaireEntree.this, MainActivity.class);
        final Intent i2 = new Intent(QuestionnaireEntree.this, reponseQuestionnaire.class);
        Animation fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fadein);

        questionnaireentree.startAnimation(fadeInAnimation);

        final RadioButton q1r1 = (RadioButton) findViewById(R.id.q1r1);
        final RadioButton q1r2 = (RadioButton) findViewById(R.id.q1r2);
        final RadioButton q1r3 = (RadioButton) findViewById(R.id.q1r3);
        final RadioButton q2r1 = (RadioButton) findViewById(R.id.q2r1);
        final RadioButton q2r2 = (RadioButton) findViewById(R.id.q2r2);
        final RadioButton q2r3 = (RadioButton) findViewById(R.id.q2r3);
        final RadioButton q3r1 = (RadioButton) findViewById(R.id.q3r1);
        final RadioButton q3r2 = (RadioButton) findViewById(R.id.q3r2);
        final RadioButton q3r3 = (RadioButton) findViewById(R.id.q3r3);
        final RadioButton q4r1 = (RadioButton) findViewById(R.id.q4r1);
        final RadioButton q4r2 = (RadioButton) findViewById(R.id.q4r2);
        final RadioButton q4r3 = (RadioButton) findViewById(R.id.q4r3);
        final Button boutonSuivant = (Button) findViewById(R.id.Questionnaire);

        //Réponses au questionnaire

        boutonSuivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.i("Ca passe ici", "MyClass.getView() — get item number ");
                if(((q1r1.isChecked() || q1r2.isChecked() || q1r3.isChecked())
                        &&
                        (q2r1.isChecked() || q2r2.isChecked() || q2r3.isChecked())
                        &&
                        (q3r1.isChecked() || q3r2.isChecked() || q3r3.isChecked())
                        &&
                        (q4r1.isChecked() || q4r2.isChecked() || q4r3.isChecked())))
                {

                                    if(q1r1.isChecked()) {
                    salarie++;
                }
                if(q1r2.isChecked()) {
                    fonctionnaire++;
                }
                if(q1r3.isChecked()) {
                    entrepreneur++;
                }
                if(q2r1.isChecked()) {
                    salarie++;
                }
                if(q2r2.isChecked()) {
                    fonctionnaire++;
                }
                if(q2r3.isChecked()) {
                    entrepreneur++;
                }
                if(q3r1.isChecked()) {
salarie++;
                }
                if(q3r2.isChecked()) {
                    fonctionnaire++;
                }
                if(q3r3.isChecked()) {
                    entrepreneur++;
                }
                if(q4r1.isChecked()) {
                    salarie++;
                }
                if(q4r2.isChecked()) {
                    fonctionnaire++;
                }
                if(q4r3.isChecked()) {
                    entrepreneur++;
                }
                    Log.i("Ca passe la", "");
                    //Le problème est ici
                    if (entrepreneur >= 2) {
                        Log.i("Lance accueil", "");
                        QuestionnaireEntree.this.startActivity(i1);
                    }
                    else {
                        Log.i("Lance le reste", "");
                        QuestionnaireEntree.this.startActivity(i2);
                        finish();
                    }
                }
                else {
                    Log.i("Ca passe toast", "MyClass.getView() — get item number ");
                    Toast.makeText(getApplicationContext(),"Pensez à cocher toutes les cases", duration).show();

                }
            }



//        boutonSuivant.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                if(q1r1.isChecked()) {
//                    button1 = true;
//                }
//                if(q1r2.isChecked()) {
//                    button2 = true;
//                }
//                if(q1r3.isChecked()) {
//                    button3 = true;
//                }
//                if(q2r1.isChecked()) {
//                    button4 = true;
//                }
//                if(q2r2.isChecked()) {
//                    button5 = true;
//                }
//                if(q2r3.isChecked()) {
//                    button6 = true;
//                }
//                if(q3r1.isChecked()) {
//                    button7 = true;
//                }
//                if(q3r2.isChecked()) {
//                    button8 = true;
//                }
//                if(q3r3.isChecked()) {
//                    button9 = true;
//                }
//                if(q4r1.isChecked()) {
//                    button10 = true;
//                }
//                if(q4r2.isChecked()) {
//                    button11 = true;
//                }
//                if(q4r3.isChecked()) {
//                    button12 = true;
//                }
//
//                boutonsCoches = salarie1 + entrepreneur1 + fonctionnaire1;
//                if (((button1 || button2 || button3) && (button4 || button5 || button6) && (button7 || button8 || button9) && (button10 || button11 || button12)) == true) {
//                    if (((button3 && button6) || (button3 && button9) || (button3 && button12) || (button6 && button9) || (button6 && button12) || (button9 && button12)) == true) {
//                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
//                        startActivity(i);
//                    }
//                    else if(((button3 && button6) || (button3 && button9) || (button3 && button12) || (button6 && button9) || (button6 && button12) || (button9 && button12))== false ){
//                        Intent i = new Intent(getApplicationContext(), reponseQuestionnaire.class);
//                        startActivity(i);
//                    }
//                }
//
//                else {
//                    Toast.makeText(getApplicationContext(), boutonsCoches + "Pensez à cocher toutes les cases", duration).show();
//                }
//
//            }
//
//
//
//


        });

    }



}
