package com.myapp.wte;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Sex extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sex);

        Button sexMaleEditText = findViewById(R.id.sexMaleEditText);
        Button sexFemaleEditText = findViewById(R.id.sexFemaleEditText);
        Button sexInterEditText = findViewById(R.id.sexInterEditText);
        Button sexOkayBtn = findViewById(R.id.sexOkayBtn);

        sexMaleEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent show_data = new Intent(getApplicationContext(), showData.class);
                show_data.putExtra("com.myapp.wte.Sex", "Male");

                Intent goal = new Intent(getApplicationContext(), Goal.class);
                startActivity(goal);

            }
        });

        sexFemaleEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent show_data = new Intent(getApplicationContext(), showData.class);
                show_data.putExtra("com.myapp.wte.Sex", "Female");

                Intent goal = new Intent(getApplicationContext(), Goal.class);
                startActivity(goal);
            }
        });

        sexInterEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent show_data = new Intent(getApplicationContext(), showData.class);
                show_data.putExtra("com.myapp.wte.Sex", "Intermediate");

                Intent goal = new Intent(getApplicationContext(), Goal.class);
                startActivity(goal);
            }
        });

        sexOkayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText sexOtherEditText = findViewById(R.id.sexOtherEditText);
                String otherEditText = sexOtherEditText.getText().toString();

                Intent show_data = new Intent(getApplicationContext(), showData.class);
                show_data.putExtra("com.myapp.wte.Sex", otherEditText);

                Intent goal = new Intent(getApplicationContext(), Goal.class);
                startActivity(goal);
            }
        });
    }
}