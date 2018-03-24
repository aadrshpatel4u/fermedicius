package com.example.android.fermedicius;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class EnterAge extends AppCompatActivity implements View.OnClickListener{


    RadioGroup radioage;
    Button next2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_age);
        radioage = (RadioGroup)findViewById(R.id.radioGroupAge);
        next2 = (Button) findViewById(R.id.button_next2);
        next2.setOnClickListener(this);
    }



    @Override
    public void onClick(View view) {
        String ageCategory="";

        if (radioage.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(this, " Please select your age ", Toast.LENGTH_SHORT).show();
            return;
        }
        else
        {
            // one of the radio buttons is checked
            int id=radioage.getCheckedRadioButtonId();

            if(id == R.id.radio_age1 || id == R.id.radio_age2)
                ageCategory="1";
            else if(id == R.id.radio_age3 || id == R.id.radio_age4)
                ageCategory="2";
        }

            SharedPreferences prefs = getSharedPreferences("info", MODE_PRIVATE);
            SharedPreferences.Editor editor = prefs.edit();
            editor.putString("age", ageCategory);
            editor.commit();

            Intent myIntent2 = new Intent(this, EnterGender.class);
            //myIntent.putExtra("key", value); //Optional parameters
            startActivity(myIntent2);

    }

}

