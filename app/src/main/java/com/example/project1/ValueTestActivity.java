package com.example.project1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ValueTestActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_value);

        // 이전 화면으로부터 전달된 Intent 가져오기
        Intent intent = getIntent();

        // Intent로부터 'text'라는 이름의 문자열 추출
        String text = intent.getStringExtra("text");

        // 레이아웃에서 TextView 참조
        TextView textView = findViewById(R.id.textView);

        // TextView에 전달받은 문자열 설정
        textView.setText(text);
    }
}