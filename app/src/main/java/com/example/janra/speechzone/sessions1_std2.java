package com.example.janra.speechzone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class sessions1_std2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sessions2_std1);
    }
    public void goGoals2(View v){
        Intent i = new Intent(this, goals1_std2.class);
        startActivity(i);

    }
    public void goAct2(View v){
        Intent i = new Intent(this, activ1_std2.class);
        startActivity(i);

    }
    public void goCom2(View v){
        Intent i = new Intent(this, comments1_std2.class);
        startActivity(i);

    }
}
