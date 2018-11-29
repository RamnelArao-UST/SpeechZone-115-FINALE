package com.example.janra.speechzone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class sessions_std2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sessions_std2);
    }
    public void goSes1(View v){
        Intent i = new Intent(this, sessions1_std2.class);
        startActivity(i);
    }
    public void goSes2(View v){
        Intent i = new Intent(this, sessions2_std2.class);
        startActivity(i);
    }
    public void back(View v){
        Intent i = new Intent(this, MonitoringList.class);
        startActivity(i);
    }
}
