package com.example.universitycoursemanagement;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Layout1Activity extends AppCompatActivity {
    Button cse;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);

        cse = findViewById(R.id.btnCSE);

        cse.setOnClickListener(v -> {
            Intent intent = new Intent(Layout1Activity.this, Layout2Activity.class);
            startActivity(intent);
        });
    }
}
