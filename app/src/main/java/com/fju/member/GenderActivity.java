package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class GenderActivity extends AppCompatActivity {

    private EditText gender;
    private EditText genderin;
    public String gender2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);
        genderin = findViewById(R.id.genderin);
        gender2 = genderin.getText().toString();

    }
    public void Next(View view) {
        gender2 = genderin.getText().toString();
        SharedPreferences sp =getSharedPreferences("text",MODE_PRIVATE);
        sp.edit()
                .putString("gender",gender2)
                .commit();
        Intent intent=new Intent(GenderActivity.this,MainActivity.class);
        startActivity(intent);
        setResult(RESULT_OK);
        finish();
    }
}
