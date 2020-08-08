package com.myapp.wte;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class BMI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi);

        Button bmiOkayBtn = findViewById(R.id.bmiOkayBtn);

        bmiOkayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText bmiWeightEditText = findViewById(R.id.bmiWeightEditText);
                EditText bmiHeightEditText = findViewById(R.id.bmiHeightEditText);

                String weight = bmiWeightEditText.getText().toString();
                String height = bmiHeightEditText.getText().toString();

                Intent show_data = new Intent(getApplicationContext(), showData.class);
                show_data.putExtra("com.myapp.wte.Weight", weight);
                show_data.putExtra("com.myapp.wte.Height", height);

            }
        });
    }
}