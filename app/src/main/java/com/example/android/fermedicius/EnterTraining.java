package com.example.android.fermedicius;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class EnterTraining extends AppCompatActivity implements View.OnClickListener{

    RadioGroup radioTraining;
    Button next4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_training);
        radioTraining = (RadioGroup) findViewById(R.id.radioGroupTraining);
        next4 = (Button) findViewById(R.id.button_Next4);
        next4.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        if (radioTraining.getCheckedRadioButtonId() == -1)
        {
            Toast.makeText(this, " Please choose Training Type ", Toast.LENGTH_SHORT).show();
            return;
        }
        else
        {
            // one of the radio buttons is checked
            int id=radioTraining.getCheckedRadioButtonId();
            String training ="";

            if(id == R.id.radioButtonMauiThai)
                training = "Maui Thai";
            else if(id == R.id.radioButtonJujutsu)
                training = "Jujutsu";
            else if(id == R.id.radioButtonKarate)
                training = "Karate";
            else if(id == R.id.radioButtonJudo)
                training = "Judo";


            SharedPreferences prefs = getSharedPreferences("info", MODE_PRIVATE);
            SharedPreferences.Editor editor = prefs.edit();
            editor.putString("training", training);
            editor.commit();

            Intent myIntent4 = new Intent(this, EnterExercise.class);
            //myIntent.putExtra("key", value); //Optional parameters
            startActivity(myIntent4);

        }
    }

}
