package com.myapp.wte;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Answer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        Button answerOkayBtn = findViewById(R.id.answerOkayBtn);
        Button answerBackBtn = findViewById(R.id.answerBackBtn);

        answerOkayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText ans_wer = findViewById(R.id.answerEditText);
                String answer = ans_wer.getText().toString();

                Intent show_data = new Intent(getApplicationContext(), showData.class);
                show_data.putExtra("com.myapp.wte.Answer", answer);

                Intent bmi = new Intent(getApplicationContext(), BMI.class);
                startActivity(bmi);
            }
        });

        answerBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent secQ = new Intent(getApplicationContext(), SecurityQuestion.class);
                startActivity(secQ);
            }
        });
    }
}