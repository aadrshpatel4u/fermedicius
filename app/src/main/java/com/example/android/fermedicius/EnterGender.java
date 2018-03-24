package com.example.android.fermedicius;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class EnterGender extends AppCompatActivity  implements View.OnClickListener{

    RadioGroup radioGender;
    Button next3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_gender);
        radioGender = (RadioGroup)findViewById(R.id.radioGroupGender);
        next3 = (Button) findViewById(R.id.button_next3);
        next3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String gender="";
        if (radioGender.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(this, " Please choose Gender ", Toast.LENGTH_SHORT).show();
            return;
        }
        else
        {
            // one of the radio buttons is checked
            int id=radioGender.getCheckedRadioButtonId();


            if(id == R.id.radio_female)
                gender="female";
            else if (id == R.id.radio_male)
                gender="male";


            SharedPreferences prefs = getSharedPreferences("info", MODE_PRIVATE);
            SharedPreferences.Editor editor = prefs.edit();
            editor.putString("gender", gender);
            editor.commit();


            Intent myIntent3 = new Intent(this, EnterTraining.class);
            //myIntent.putExtra("key", value); //Optional parameters
            startActivity(myIntent3);

        }


    }
}
