package com.example.android.fermedicius;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EnterName extends AppCompatActivity implements View.OnClickListener  {

    EditText name;
    Button   next1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_name);
        name = (EditText) findViewById(R.id.editText_Name);
        next1 = (Button) findViewById(R.id.button_next1);
        next1.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if(TextUtils.isEmpty(name.getText().toString()))
        {
            Toast.makeText(this, " Name is required ! ", Toast.LENGTH_SHORT).show();
            return;
        }
        if(name.getText().length()<2)
        {
            Toast.makeText(this, " Name too short ", Toast.LENGTH_SHORT).show();
            return;
        }
        SharedPreferences prefs = getSharedPreferences("info", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("name", name.getText().toString());
        editor.commit();
        Intent myIntent = new Intent(this, EnterAge.class);
        //myIntent.putExtra("key", value); //Optional parameters
        startActivity(myIntent);


    }
}
