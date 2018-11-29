package com.example.janra.speechzone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class sessions2_std1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sessions2_std1);
    }

    public void goGoals2(View v){
        Intent i = new Intent(this, goals2_std1.class);
        startActivity(i);

    }
    public void goAct2(View v){
        Intent i = new Intent(this,activ2_std1.class);
        startActivity(i);

    }
    public void goCom2(View v){
        Intent i = new Intent(this, comments2_std1.class);
        startActivity(i);
    }
}
