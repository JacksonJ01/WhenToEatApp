package com.myapp.wte;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class forgot_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgotpage);

        Button fOkayBtn2 = findViewById(R.id.fokayBtn2);
        Button fBackBtn = findViewById(R.id.fbackBtn);

        fOkayBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forgotPage2 = new Intent(getApplicationContext(), forgot_page2.class);
                startActivity(forgotPage2);
            }
        });

        fBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act_main = new Intent(getApplicationContext(), main_activity.class);
                startActivity(act_main);
            }
        });
    }
}