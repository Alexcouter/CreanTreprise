package com.example.creantreprise;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

//import android.view.animation.AnimationSet;


public class QuestionnaireEntree extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnaire_entree);

        TextView questionnaireentree = (TextView)findViewById(R.id.questionnaireentree);

        Animation fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fadein);

        questionnaireentree.startAnimation(fadeInAnimation);
    }

}
