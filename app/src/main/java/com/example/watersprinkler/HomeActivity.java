package com.example.watersprinkler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void sprinklerData1(View view) {
        Intent i = new Intent(getApplicationContext(), TempHumActivity.class);
        startActivity(i);
    }
    public void sprinklerData2(View view) {
        Intent i = new Intent(getApplicationContext(), TempHumActivity.class);
        startActivity(i);
    }
    public void sprinklerData3(View view) {
        Intent i = new Intent(getApplicationContext(), TempHumActivity.class);
        startActivity(i);
    }
    public void sprinklerData4(View view) {
        Intent i = new Intent(getApplicationContext(), TempHumActivity.class);
        startActivity(i);
    }
    public void sprinklerData5(View view) {
        Intent i = new Intent(getApplicationContext(), TempHumActivity.class);
        startActivity(i);
    }
    public void sprinklerData6(View view) {
        Intent i = new Intent(getApplicationContext(), TempHumActivity.class);
        startActivity(i);
    }
    public void sprinklerData7(View view) {
        Intent i = new Intent(getApplicationContext(), TempHumActivity.class);
        startActivity(i);
    }
    public void sprinklerData8(View view) {
        Intent i = new Intent(getApplicationContext(), TempHumActivity.class);
        startActivity(i);
    }
}