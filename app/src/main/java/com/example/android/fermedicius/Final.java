package com.example.android.fermedicius;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class Final extends AppCompatActivity {

    TextView showID;
    String stringID;
    String name;
    String age;
    String gender;
    String trainigType;
    String exerciseType;
    String swimming;
    String running;
    String football;
    String rugby;
    String dance;

    ImageView myImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        showID = (TextView) findViewById(R.id.StringID);
        SharedPreferences prefs = getSharedPreferences("info", MODE_PRIVATE);
        name = prefs.getString("name", null);
        age = prefs.getString("age", null);
        gender = prefs.getString("gender", null);
        trainigType = prefs.getString("training", null);
        exerciseType = prefs.getString("exercise", null);

        swimming = prefs.getString("swimming", null);
        running = prefs.getString("running", null);
        football = prefs.getString("football", null);
        rugby = prefs.getString("rugby", null);
        dance = prefs.getString("dance", null);

        myImage = (ImageView) findViewById(R.id.imageView);

    }

    @Override
    protected  void onResume() {
        //stringID=name+"\n"+age+"\n"+gender+"\n"+trainigType+"\n"+exerciseType+"\n"+swimming+"\n"+running+"\n"+football+"\n"+rugby+"\n"+dance;

        //showID.setText(stringID);
        super.onResume();
        stringID="";

        String unique = "XXXXX";
        int trainingHour = 1;

        if (gender == "male" && age == "2")
            trainingHour = 2;

        //building ID
        stringID += unique;

        stringID += " A:";
        if (trainigType.equals("Maui Thai"))
            stringID += String.valueOf(trainingHour);
        else
            stringID += "0";

        stringID += " B:";
        if (trainigType.equals("Jujutsu"))
            stringID += String.valueOf(trainingHour);
        else
            stringID += "0";

        stringID += " C:";
        if (trainigType.equals("Karate"))
            stringID += String.valueOf(trainingHour);
        else
            stringID += "0";

        stringID += " D:";
        if (trainigType.equals("Judo"))
            stringID += String.valueOf(trainingHour);
        else
            stringID += "0";

        stringID += " P:";
        if (exerciseType.equals("cardio"))
            stringID += "1";
        else
            stringID += "0";

        stringID += " Q:";
        if (exerciseType.equals("strength"))
            stringID += "1";
        else
            stringID += "0";

        stringID += " R:";
        if (exerciseType.equals("stamina"))
            stringID += "1";
        else
            stringID += "0";

        stringID += " S:";
        if (exerciseType.equals("muscle"))
            stringID += "1";
        else
            stringID += "0";

        stringID += " V:";
        if (swimming.equals("yes"))
            stringID += "1";
        else
            stringID += "0";

        stringID += " W:";
        if (running.equals("yes"))
            stringID += "1";
        else
            stringID += "0";

        stringID += " X:";
        if (football.equals("yes"))
            stringID += "1";
        else
            stringID += "0";

        stringID += " Y:";
        if (rugby.equals("yes"))
            stringID += "1";
        else
            stringID += "0";

        stringID += " Z:";
        if (dance.equals("yes"))
            stringID += "1";
        else
            stringID += "0";



        showID.setText(stringID);


        //Bitmap myBitmap = QRCode.from(stringID).bitmap();
        //myImage.setImageBitmap(myBitmap);

    }


}
