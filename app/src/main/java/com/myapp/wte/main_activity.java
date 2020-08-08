package com.myapp.wte;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class main_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button okayBtn = findViewById(R.id.okayBtn);
        Button forgotBtn = findViewById(R.id.forgotBtn);
        Button backToNewUserBtn = findViewById(R.id.backToNewUserBtn);

        okayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText loginPasswordEditText = findViewById(R.id.loginPasswordEditText);
                EditText firstNameEditText = findViewById(R.id.firstNameEditText);
                EditText lastNameEditText = findViewById(R.id.lastNameTextEdit);

                String pinNumber = loginPasswordEditText.getText().toString();
                String firstName = firstNameEditText.getText().toString();
                String lastName = lastNameEditText.getText().toString();

            }
        });

        forgotBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forgotPage = new Intent(getApplicationContext(), forgot_page.class);
                startActivity(forgotPage);
            }
        });

        backToNewUserBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent new_User = new Intent(getApplicationContext(), newUser.class);
                startActivity(new_User);
            }
        });
    }
}