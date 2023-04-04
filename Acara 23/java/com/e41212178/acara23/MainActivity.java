package com.e41212178.acara23;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name;
    Button btnSend;

    private String KEY_NAME = "NAMA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.edit_nama);
        btnSend = (Button) findViewById(R.id.btn_send);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String name = MainActivity.this.name.getText().toString();
                    if (!name.isEmpty()){
                        Intent i = new Intent(MainActivity.this, MainActivity2.class);
                        i.putExtra(KEY_NAME, name);
                        startActivity(i);
                    }
                    else{
                        Toast.makeText(getApplication(), "You Need to Fill The Name Column !", Toast.LENGTH_SHORT).show();
                    }
                } catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplication(), "Error Try Again Later",Toast.LENGTH_SHORT).show();


                }
            }
        });
    }
}