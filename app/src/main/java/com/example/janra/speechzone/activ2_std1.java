package com.example.janra.speechzone;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class activ2_std1 extends AppCompatActivity {

    EditText act1,act2,act3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activ2_std1);
        act1 = findViewById(R.id.et1);
        act2 = findViewById(R.id.et2);
        act3 = findViewById(R.id.et3);
    }
    public void save(View v){
        SharedPreferences preferences1 = getSharedPreferences("Pref1",MODE_PRIVATE);
        SharedPreferences.Editor editor1 = preferences1.edit();
        editor1.putString("std1act1_ses2",act1.getText().toString());
        editor1.putString("std1act2_ses2",act2.getText().toString());
        editor1.putString("std1act3_ses2",act3.getText().toString());
        editor1.commit();
        Toast.makeText(this, "SAVE", Toast.LENGTH_SHORT).show();
    }
    public void load(View v){
        SharedPreferences sp1 = getSharedPreferences("Pref1",MODE_PRIVATE);
        String StAct1 = sp1.getString("std1act1_ses2",null);
        String StAct2 = sp1.getString("std1act2_ses2",null);
        String StAct3 = sp1.getString("std1act3_ses2",null);

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
