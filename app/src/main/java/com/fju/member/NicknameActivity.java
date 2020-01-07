package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NicknameActivity extends AppCompatActivity {

    private EditText ed_name;
    public String nickname ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nickname);
        ed_name = findViewById(R.id.nickname);
        nickname =  ed_name.getText().toString();

    }

    public void Next(View view) {
        nickname = ed_name.getText().toString();
        SharedPreferences sp =getSharedPreferences("text",MODE_PRIVATE);
        sp.edit()
                .putString("nickname",nickname)
                .commit();
        Intent intent=new Intent(NicknameActivity.this,AgeActivity.class);
        startActivity(intent);
        setResult(RESULT_OK);
        finish();
    }
}
