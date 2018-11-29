package com.example.janra.speechzone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class sessions2_std2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sessions2_std2);
    }
    public void goGoals2(View v){
        Intent i = new Intent(this, goals2_std2.class);
        startActivity(i);

    }
    public void goAct2(View v){
        Intent i = new Intent(this, activ2_std2.class);
        startActivity(i);

    }
    public void goCom2(View v){
        Intent i = new Intent(this, comments2_std2.class);
        startActivity(i);

    }
}
