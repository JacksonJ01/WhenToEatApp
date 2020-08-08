package com.myapp.wte;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Goal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goal);

        Button goalLean = findViewById(R.id.goalLeanBtn);
        Button goalMaintain = findViewById(R.id.goalMaintainBtn);
        Button goalBulk = findViewById(R.id.goalBulkBtn);

        goalLean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent show_data = new Intent(getApplicationContext(), showData.class);
                show_data.putExtra("com.myapp.wte.Goal", "Get Lean");

                Intent show_Data = new Intent(getApplicationContext(), showData.class);
                startActivity(show_Data);
            }
        });

        goalMaintain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent show_data = new Intent(getApplicationContext(), showData.class);
                show_data.putExtra("com.myapp.wte.Goal", "Maintain Weight");

                Intent show_Data = new Intent(getApplicationContext(), showData.class);
                startActivity(show_Data);
            }
        });

        goalBulk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent show_data = new Intent(getApplicationContext(), showData.class);
                show_data.putExtra("com.myapp.wte.Goal", "Bulk Up");

                Intent show_Data = new Intent(getApplicationContext(), showData.class);
                startActivity(show_Data);
            }
        });
    }
}