package com.myapp.wte;

import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class showData extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showdata);

        if (getIntent().hasExtra("com.myapp.wte.PinNumber")) {
            TextView sdPinNumberEditText = findViewById(R.id.sdPinNumberTv);
            String pin = Objects.requireNonNull(getIntent().getExtras()).getString("com.myapp.wte.PinNumber");
            sdPinNumberEditText.setText(pin);
        }
    }
}