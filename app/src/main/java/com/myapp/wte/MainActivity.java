package com.myapp.wte;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entry_screen);

        Button newUserBtn = findViewById(R.id.newuserBtn);
        Button exUserBtn = findViewById(R.id.exuserBtn);

        newUserBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent new_User = new Intent(getApplicationContext(), newUser.class);
                startActivity(new_User);
            }
        });

        exUserBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent act_main = new Intent(getApplicationContext(), main_activity.class);
                startActivity(act_main);
            }
        });
    }
}