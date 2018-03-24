package com.example.android.fermedicius;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class EnterSports extends AppCompatActivity implements View.OnClickListener{

    Button next6;
    CheckBox c1;//swimming
    CheckBox c2;//running
    CheckBox c3;//football
    CheckBox c4;//rugby
    CheckBox c5;//dance

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_sports);
        next6 = (Button) findViewById(R.id.button_next6);
        c1  = (CheckBox) findViewById(R.id.checkBox_Swimming);
        c2  = (CheckBox) findViewById(R.id.checkBox_Running);
        c3  = (CheckBox) findViewById(R.id.checkBox_Football);
        c4  = (CheckBox) findViewById(R.id.checkBox_Rugby);
        c5  = (CheckBox) findViewById(R.id.checkBox_Dance);
        next6.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (!c1.isChecked()&&!c2.isChecked()&&!c3.isChecked()&&!c4.isChecked()&&!c5.isChecked())
        {
            Toast.makeText(this, " Please choose at least one ", Toast.LENGTH_SHORT).show();
            return;
        }
        else
        {
            // one of the radio buttons is checked
            SharedPreferences prefs = getSharedPreferences("info", MODE_PRIVATE);
            SharedPreferences.Editor editor = prefs.edit();
            if(c1.isChecked())
                editor.putString("swimming", "yes");
            else
                editor.putString("swimming", "no");

            if(c2.isChecked())
                editor.putString("running", "yes");
            else
                editor.putString("running", "no");

            if(c3.isChecked())
                editor.putString("football", "yes");
            else
                editor.putString("football", "no");

            if(c4.isChecked())
                editor.putString("rugby", "yes");
            else
                editor.putString("rugby", "no");

            if(c5.isChecked())
                editor.putString("dance", "yes");
            else
                editor.putString("dance", "no");
            editor.commit();






            Intent myIntent5 = new Intent(this, Final.class);
            //myIntent.putExtra("key", value); //Optional parameters
            startActivity(myIntent5);

        }

    }
}
