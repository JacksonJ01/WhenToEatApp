package com.myapp.wte;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class forgot_page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgotpage2);

        Button fOkayBtn2 = findViewById(R.id.fokayBtn2);
        Button returnBtn = findViewById(R.id.returnBtn);
        Button changePasswordBtn = findViewById(R.id.changePasswordBtn);

        fOkayBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText fSecQEditText = findViewById(R.id.fsecqEditText);
                EditText answerEditText = findViewById(R.id.answerEditText);

            }
        });

        returnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act_main = new Intent(getApplicationContext(), main_activity.class);
                startActivity(act_main);
            }
        });

        changePasswordBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}