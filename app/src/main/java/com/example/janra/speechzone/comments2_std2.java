package com.example.janra.speechzone;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class comments2_std2 extends AppCompatActivity {
    EditText comm1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comments2_std2);
        comm1 = findViewById(R.id.et1);
    }
    public void save(View v){
        SharedPreferences preferences2 = getSharedPreferences("Pref2",MODE_PRIVATE);
        SharedPreferences.Editor editor2 = preferences2.edit();
        editor2.putString("std2com1_ses2",comm1.getText().toString());
        editor2.commit();
        Toast.makeText(this, "SAVE", Toast.LENGTH_SHORT).show();
    }
    public void load(View v){
        SharedPreferences sp2 = getSharedPreferences("Pref2",MODE_PRIVATE);
        String StCom1 = sp2.getString("std2com1_ses2",null);

        comm1.setText(StCom1);
        Toast.makeText(this, "LOAD", Toast.LENGTH_SHORT).show();
    }
    public void backMain(View v){
        Intent i = new Intent(this, MainScreen.class);
        startActivity(i);
    }
}
