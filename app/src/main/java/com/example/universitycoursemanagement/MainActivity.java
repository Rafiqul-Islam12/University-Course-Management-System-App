package com.example.universitycoursemanagement;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText usernameEditText, passwordEditText, idEditText;
    Button signInButton;
    String id = "12", username = "rafiq12", password = "abcd", strid, strusername, strpass;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idEditText = findViewById(R.id.id);
        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);
        signInButton = findViewById(R.id.btncontinue);

        signInButton.setOnClickListener(v -> {
            strid = idEditText.getText().toString().trim();
            strusername = usernameEditText.getText().toString().trim();
            strpass = passwordEditText.getText().toString().trim();

            if (id.equals(strid) && username.equals(strusername) && password.equals(strpass)) {
                Intent intent = new Intent(MainActivity.this, Layout1Activity.class); // move to next layout
                startActivity(intent);
            } else {
                Toast.makeText(MainActivity.this, "Invalid credentials", Toast.LENGTH_SHORT).show();
            }
        });
    }
}