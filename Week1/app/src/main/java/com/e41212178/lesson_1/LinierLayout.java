package com.e41212178.lesson_1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class LinierLayout extends AppCompatActivity {
    EditText to,subject,message;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.linier_layout);

    to = findViewById(R.id.to);
    subject = findViewById(R.id.subject);
    message = findViewById(R.id.messages);
    send = findViewById(R.id.send);

    }
}
