package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText; // 사용자의 입력을 받는 EditText
    Button button; // 클릭을 처리하는 Button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 레이아웃으로부터 EditText 및 Button 참조
        editText = findViewById(R.id.editTextText);
        button = findViewById(R.id.button);

        // 버튼에 클릭 리스너 추가
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // EditText로부터 입력된 문자열 가져오기
                String input = editText.getText().toString();

                // 새로운 액티비티로 전환하기 위한 Intent 생성
                Intent intent = new Intent(MainActivity.this, ValueTestActivity.class);

                // 입력된 텍스트를 Intent에 추가
                intent.putExtra("text", input);

                // 새로운 액티비티 시작
                startActivity(intent);
            }
        });
    }
}