package com.fju.member;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nickname;
    private EditText age;
    private EditText gender;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nickname = findViewById(R.id.ed_name);
        age = findViewById(R.id.ed_age);
        gender = findViewById(R.id.ed_gender);
        button = findViewById(R.id.button);
        nickname.setText(" ");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,NicknameActivity.class);
                startActivityForResult(intent,10);
            }
        });



    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode==10){
            if(resultCode != RESULT_OK){
                finish();
            }else{
                String nickId = getSharedPreferences("text", MODE_PRIVATE)
                        .getString("nickname" , "nickname");
                nickname.setText(nickId);
                String ageId = getSharedPreferences("text", MODE_PRIVATE)
                        .getString("age", "dataAge");
                age.setText(ageId);
                String genderId = getSharedPreferences("text", MODE_PRIVATE)
                        .getString("gender", "dataGender");
                gender.setText(genderId);
            }
            }
        }

    }

