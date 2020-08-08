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
                Intent show_data = new Intent(getApplicationContext(), showData.class);

                String secQ = "What was the name you gave yourself growing up?";
                show_data.putExtra("com.myapp.wte.SecurityQuestion", secQ);

                startActivity(answer);
            }
        });

        secQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent answer = new Intent(getApplicationContext(), Answer.class);
                Intent show_data = new Intent(getApplicationContext(), showData.class);

                String secQ = "What was your favorite game as a child?";
                show_data.putExtra("com.myapp.wte.SecurityQuestion", secQ);

                startActivity(answer);
            }
        });

        secQ3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent answer = new Intent(getApplicationContext(), Answer.class);
                Intent show_data = new Intent(getApplicationContext(), showData.class);

                String secQ = "Where were you when you had your first kiss?";
                show_data.putExtra("com.myapp.wte.SecurityQuestion", secQ);

                startActivity(answer);
            }
        });

        secQ4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent answer = new Intent(getApplicationContext(), Answer.class);
                Intent show_data = new Intent(getApplicationContext(), showData.class);

                String secQ = "What the name of a college you got accepted to but did not attend?";
                show_data.putExtra("com.myapp.wte.SecurityQuestion", secQ);

                startActivity(answer);
            }
        });

        secQ5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent answer = new Intent(getApplicationContext(), Answer.class);
                Intent show_data = new Intent(getApplicationContext(), showData.class);

                String secQ = "What planet would you like to live on?";
                show_data.putExtra("com.myapp.wte.SecurityQuestion", secQ);

                startActivity(answer);
            }
        });


    }
}