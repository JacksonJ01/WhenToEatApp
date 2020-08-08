package com.myapp.wte;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class BMI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi);

        Button bmiOkayBtn = findViewById(R.id.bmiOkayBtn);
        @SuppressLint("UseSwitchCompatOrMaterialCode")
        Switch bmiKgSwitch = findViewById(R.id.bmiKgSwitch);

        bmiOkayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText bmiWeightEditText = findViewById(R.id.bmiWeightEditText);
                EditText bmiHeightEditText = findViewById(R.id.bmiHeightEditText);

                float weight = Float.parseFloat(bmiWeightEditText.getText().toString());
                float height = Float.parseFloat(bmiHeightEditText.getText().toString());
                float bmi = (weight / (height * height)) * 703 ;

                Intent show_data = new Intent(getApplicationContext(), showData.class);
                show_data.putExtra("com.myapp.wte.Weight", weight);
                show_data.putExtra("com.myapp.wte.Height", height);
                show_data.putExtra("com.myapp.wte.BMI", bmi);
            }
        });

        //
        bmiKgSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean kg) {
                EditText bmiWeightEditText = findViewById(R.id.bmiWeightEditText);
                EditText bmiHeightEditText = findViewById(R.id.bmiHeightEditText);

                float weight = Float.parseFloat(bmiWeightEditText.getText().toString());
                float height = Float.parseFloat(bmiHeightEditText.getText().toString());
                float bmi;

                bmi = (weight / (height * height));


                Intent show_data = new Intent(getApplicationContext(), showData.class);
                show_data.putExtra("com.myapp.wte.Weight", weight);
                show_data.putExtra("com.myapp.wte.Height", height);
                show_data.putExtra("com.myapp.wte.BMI", bmi);
            }
        });
    }
}