package com.e41212178.lesson_2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    DatePickerDialog picker;
    EditText eText;
    Button btnGet;
    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtView = (TextView) findViewById(R.id.textView1);
        eText = (EditText) findViewById(R.id.editText1);
        eText.setInputType(InputType.TYPE_NULL);
        eText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Calendar kalender = Calendar.getInstance();
                int hari = kalender.get(Calendar.DAY_OF_MONTH);
                int bulan = kalender.get(Calendar.MONTH);
                int tahun = kalender.get(Calendar.YEAR);
                picker = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int tahun, int bulan, int hari) {
        eText.setText(hari + "/"+ (bulan + 1) +"/" + tahun);
                    }
                }, hari, bulan, tahun);
                picker.show();
            }

        });
        btnGet = (Button) findViewById(R.id.button1);
    txtView.setText("Tanggal yang dipilih :" + eText.getText());
    }
}