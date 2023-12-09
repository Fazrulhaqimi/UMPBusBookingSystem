package com.CB20129.BUS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StdSchedule4 extends AppCompatActivity {

    Button dhuam2, umpsa2, backSchedule;
    EditText UMPSA1, UMPSA2, UMPSA3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_std_schedule4);

        dhuam2 = findViewById(R.id.button2);
        dhuam2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), StdSchedule1.class));
                //finish();
            }
        });

        umpsa2 = findViewById(R.id.button30);
        umpsa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), StdSchedule4.class));
                //finish();
            }
        });

        UMPSA1 = findViewById(R.id.Schedule_6);
        UMPSA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), StdSchedule5.class));
                //finish();
            }
        });

        UMPSA2 = findViewById(R.id.Schedule_7);
        UMPSA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), StdSchedule5.class));
                //finish();
            }
        });

        UMPSA3 = findViewById(R.id.Schedule_8);
        UMPSA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), StdSchedule5.class));
                //finish();
            }
        });

        backSchedule = findViewById(R.id.button7);
        backSchedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), StdSchedule5.class));
                //finish();
            }
        });
    }
}