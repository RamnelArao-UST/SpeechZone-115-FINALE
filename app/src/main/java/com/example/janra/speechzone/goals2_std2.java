package com.example.janra.speechzone;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class goals2_std2 extends AppCompatActivity {
    EditText goals1,goals2,goals3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goals2_std2);
        goals1 = findViewById(R.id.et1);
        goals2 = findViewById(R.id.et2);
        goals3 = findViewById(R.id.et3);
    }
    public void save(View v){
        SharedPreferences preferences2 = getSharedPreferences("Pref2",MODE_PRIVATE);
        SharedPreferences.Editor editor2 = preferences2.edit();
        editor2.putString("std2goal1_ses2",goals1.getText().toString());
        editor2.putString("std2goal2_ses2",goals2.getText().toString());
        editor2.putString("std2goal3_ses2",goals3.getText().toString());
        editor2.commit();
        Toast.makeText(this, "SAVE", Toast.LENGTH_SHORT).show();
    }
    public void load(View v){
        SharedPreferences sp2 = getSharedPreferences("Pref2",MODE_PRIVATE);
        String gl1 = sp2.getString("std2goal1_ses2",null);
        String gl2 = sp2.getString("std2goal2_ses2",null);
        String gl3 = sp2.getString("std2goal3_ses2",null);

        goals1.setText(gl1);
        goals2.setText(gl2);
        goals3.setText(gl3);
        Toast.makeText(this, "LOAD", Toast.LENGTH_SHORT).show();
    }
    public void backMain(View v){
        Intent i = new Intent(this, MainScreen.class);
        startActivity(i);
    }
}
