package com.myapp.wte;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class newUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user);

        Button nUOkayBtn = findViewById(R.id.nUokayBtn);
        nUOkayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText nUPinNumberEditText = findViewById(R.id.nUPinNumberEditText);
                EditText nUFirstNameEditText = findViewById(R.id.nUfirstNameEditText);
                EditText nULastNameEditText = findViewById(R.id.nUlastNameEditText);
                EditText nUEmailEditText = findViewById(R.id.nUEmailEditText);

                String pinNumber = nUPinNumberEditText.getText().toString();
                String firstName = nUFirstNameEditText.getText().toString();
                String lastName = nULastNameEditText.getText().toString();
                String email = nUEmailEditText.getText().toString();

                Intent secQ = new Intent(getApplicationContext(), SecurityQuestion.class);

                Intent show_data = new Intent(getApplicationContext(), showData.class);
                show_data.putExtra("com.myapp.wte.PinNumber", pinNumber);
                show_data.putExtra("com.myapp.wte.FirstName", firstName);
                show_data.putExtra("com.myapp.wte.LastName", lastName);
                show_data.putExtra("com.myapp.wte.Email", email);

                startActivity(secQ);
            }
        });
    }
}