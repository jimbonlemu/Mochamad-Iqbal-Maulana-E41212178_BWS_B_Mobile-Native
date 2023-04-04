package com.e41212178.acara23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    TextView txHello;
    private  String name;
    private String KEY_NAME = "NAMA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txHello = (TextView) findViewById(R.id.txtHello);

        Bundle extras = getIntent().getExtras();
        name = extras.getString(KEY_NAME);
        txHello.setText("Hello, " + name+ " !");
    }
}