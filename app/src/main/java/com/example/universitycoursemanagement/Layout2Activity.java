package com.example.universitycoursemanagement;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Layout2Activity extends AppCompatActivity {
    Button btn12, btn13, btn14, btn15, btn16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);

        btn12 = findViewById(R.id.btn12);
        btn13 = findViewById(R.id.btn13);
        btn14 = findViewById(R.id.btn14);
        btn15 = findViewById(R.id.btn15);
        btn16 = findViewById(R.id.btn16);

        btn12.setOnClickListener(v ->
                Toast.makeText(Layout2Activity.this, "Invalid batch", Toast.LENGTH_SHORT).show());

        btn13.setOnClickListener(v ->
                Toast.makeText(Layout2Activity.this, "Invalid batch", Toast.LENGTH_SHORT).show());

        btn15.setOnClickListener(v ->
                Toast.makeText(Layout2Activity.this, "Invalid batch", Toast.LENGTH_SHORT).show());

        btn16.setOnClickListener(v ->
                Toast.makeText(Layout2Activity.this, "Invalid batch", Toast.LENGTH_SHORT).show());

        btn14.setOnClickListener(v -> {
            Intent intent = new Intent(Layout2Activity.this, Layout3Activity.class);
            startActivity(intent);
        });
    }
}