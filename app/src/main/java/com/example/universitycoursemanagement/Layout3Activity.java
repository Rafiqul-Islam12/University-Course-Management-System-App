package com.example.universitycoursemanagement;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Layout3Activity extends AppCompatActivity {
    Button btncse22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout3);

        btncse22 = findViewById(R.id.btn22);

        btncse22.setOnClickListener(v -> {
            Intent intent = new Intent(Layout3Activity.this, Layout4Activity.class);
            startActivity(intent);
        });

    }
}
