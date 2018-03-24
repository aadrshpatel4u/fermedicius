package com.example.android.fermedicius;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class EnterExercise extends AppCompatActivity implements View.OnClickListener{

    RadioGroup radioExercise;
    Button next5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_exercise);
        radioExercise = (RadioGroup) findViewById(R.id.radioGroupExercise);
        next5 =(Button) findViewById(R.id.button_next5);
        next5.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (radioExercise.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(this, " Please choose Exercise type ", Toast.LENGTH_SHORT).show();
            return;
        }
        else
        {
            // one of the radio buttons is checked
            int id=radioExercise.getCheckedRadioButtonId();
            String exercise ="";

            if( id == R.id.radioButton_cardio)
                exercise = "cardio";
            else if(id == R.id.radioButton_muscle)
                exercise = "muscle";
            else if(id == R.id.radioButton_stamina)
                exercise = "stamina";
            else if(id ==R.id.radioButton_strength)
                exercise = "strength";


            SharedPreferences prefs = getSharedPreferences("info", MODE_PRIVATE);
            SharedPreferences.Editor editor = prefs.edit();
            editor.putString("exercise", exercise);
            editor.commit();



            Intent myIntent5 = new Intent(this, EnterSports.class);
            //myIntent.putExtra("key", value); //Optional parameters
            startActivity(myIntent5);

        }
    }
}
