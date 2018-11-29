package com.example.janra.speechzone;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class activ1_std2 extends AppCompatActivity {
    EditText act1,act2,act3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activ1_std2);
        act1 = findViewById(R.id.et1);
        act2 = findViewById(R.id.et2);
        act3 = findViewById(R.id.et3);
    }
    public void save(View v){
        SharedPreferences preferences2 = getSharedPreferences("Pref2",MODE_PRIVATE);
        SharedPreferences.Editor editor2 = preferences2.edit();
        editor2.putString("std2act1",act1.getText().toString());
        editor2.putString("std2act2",act2.getText().toString());
        editor2.putString("std2act3",act3.getText().toString());
        editor2.commit();
        Toast.makeText(this, "SAVE", Toast.LENGTH_SHORT).show();
    }
    public void load(View v){
        SharedPreferences sp2 = getSharedPreferences("Pref2",MODE_PRIVATE);
        String StAct1 = sp2.getString("std2act1",null);
        String StAct2 = sp2.getString("std2act2",null);
        String StAct3 = sp2.getString("std2act3",null);

        act1.setText(StAct1);
        act2.setText(StAct2);
        act3.setText(StAct3);
        Toast.makeText(this, "LOAD", Toast.LENGTH_SHORT).show();
    }
    public void backMain(View v){
        Intent i = new Intent(this, MainScreen.class);
        startActivity(i);
    }
}
