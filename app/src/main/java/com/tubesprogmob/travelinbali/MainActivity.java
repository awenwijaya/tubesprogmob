package com.tubesprogmob.travelinbali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pindahEducation(View view) {
        Intent intentEducation = new Intent(MainActivity.this, activityEducation.class);
        startActivity(intentEducation);
    }

    public void pindahEntertainment(View view) {
        Intent intentEntertainment = new Intent(MainActivity.this, activityEntertainment.class);
        startActivity(intentEntertainment);
    }

    public void pindahCulinary(View view) {
        Intent intentCulinary = new Intent(MainActivity.this, activityCulinary.class);
        startActivity(intentCulinary);
    }

    public void pindahSport(View view) {
        Intent intentSport = new Intent(MainActivity.this, activityCulinary.class);
        startActivity(intentSport);
    }
}
