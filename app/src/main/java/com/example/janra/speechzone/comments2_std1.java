package com.example.janra.speechzone;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class comments2_std1 extends AppCompatActivity {
    EditText comm1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comments2_std1);
        comm1 = findViewById(R.id.et1);
    }
    public void save(View v){
        SharedPreferences preferences1 = getSharedPreferences("Pref1",MODE_PRIVATE);
        SharedPreferences.Editor editor1 = preferences1.edit();
        editor1.putString("std1com1_ses2",comm1.getText().toString());
        editor1.commit();
        Toast.makeText(this, "SAVE", Toast.LENGTH_SHORT).show();
    }
    public void load(View v){
        SharedPreferences sp1 = getSharedPreferences("Pref1",MODE_PRIVATE);
        String StCom1 = sp1.getString("std1com1_ses2",null);

        comm1.setText(StCom1);
        Toast.makeText(this, "LOAD", Toast.LENGTH_SHORT).show();
    }
    public void backMain(View v){
        Intent i = new Intent(this, MainScreen.class);
        startActivity(i);
    }
}
