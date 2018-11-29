package com.example.janra.speechzone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class sessions_std1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sessions_std1);
    }

    public void goSes1(View v){
        Intent i = new Intent(this, sessions1_std1.class);
        startActivity(i);
    }
    public void goSes2(View v){
        Intent i = new Intent(this, sessions2_std1.class);
        startActivity(i);
    }
    public void back(View v){
        Intent i = new Intent(this, MonitoringList.class);
        startActivity(i);
    }
}
