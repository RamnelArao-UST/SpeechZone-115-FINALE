package com.example.janra.speechzone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class sessions1_std1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sessions1_std1);
    }
    public void goGoals1(View v){
        Intent i = new Intent(this, goals1_std1.class);
        startActivity(i);

    }
    public void goAct1(View v){
        Intent i = new Intent(this, activ1_std1.class);
        startActivity(i);

    }
    public void goCom1(View v){
        Intent i = new Intent(this, comments1_std1.class);
        startActivity(i);

    }
}
