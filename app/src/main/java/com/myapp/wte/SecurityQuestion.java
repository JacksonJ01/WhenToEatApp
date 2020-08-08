package com.myapp.wte;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecurityQuestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.security);

        Button secQ1 = findViewById(R.id.sec1Btn);
        Button secQ2 = findViewById(R.id.secq2Btn);
        Button secQ3 = findViewById(R.id.secq3Btn);
        Button secQ4 = findViewById(R.id.secq4Btn);
        Button secQ5 = findViewById(R.id.secq5Btn);

        secQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent answer = new Intent(getApplicationContext(), Answer.class);
                startActivity(answer);
            }
        });

    }

    public static String Security_Question_String (int secQ){
        Intent show_data = new Intent(get)
    };
}