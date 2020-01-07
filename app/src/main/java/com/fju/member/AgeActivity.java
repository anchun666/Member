package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AgeActivity extends AppCompatActivity {
    public String age2;
    private EditText agein;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);
        agein = findViewById(R.id.agein);
        age2 = agein.getText().toString();

    }
    public void Next(View view) {
        age2 = agein.getText().toString();
        SharedPreferences sp =getSharedPreferences("text",MODE_PRIVATE);
        sp.edit()
                .putString("age",age2)
                .commit();
        Intent intent=new Intent(AgeActivity.this,GenderActivity.class);
        startActivity(intent);
        setResult(RESULT_OK);
        finish();
    }
}
