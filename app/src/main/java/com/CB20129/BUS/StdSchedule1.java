package com.CB20129.BUS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StdSchedule1 extends AppCompatActivity {

    Button dhuam1, umpsa1, backSchedule;

    EditText DHUAM1, DHUAM2, DHUAM3, DHUAM4, DHUAM5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_std_schedule1);

    dhuam1 = findViewById(R.id.button2);
    dhuam1.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View view) {
            startActivity(new Intent(getApplicationContext(), StdSchedule1.class));
            //finish();
            }
        });
    umpsa1 = findViewById(R.id.button30);
    umpsa1.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View view) {
            startActivity(new Intent(getApplicationContext(), StdSchedule4.class));
            //finish();
            }
        });

    DHUAM1 = findViewById(R.id.Schedule_1);
    DHUAM1.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View view) {
            startActivity(new Intent(getApplicationContext(), StdsSchedule2.class));
            //finish();
            }
        });

    DHUAM2 = findViewById(R.id.Schedule_2);
    DHUAM2.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View view) {
            startActivity(new Intent(getApplicationContext(), StdsSchedule2.class));
            //finish();
            }
        });

    DHUAM3 = findViewById(R.id.Schedule_3);
    DHUAM3.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View view) {
            startActivity(new Intent(getApplicationContext(), StdsSchedule2.class));
            //finish();
            }
        });

    DHUAM4 = findViewById(R.id.Schedule_4);
    DHUAM4.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View view) {
            startActivity(new Intent(getApplicationContext(), StdsSchedule2.class));
            //finish();
            }
        });

    DHUAM5 = findViewById(R.id.Schedule_5);
    DHUAM5.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View view) {
            startActivity(new Intent(getApplicationContext(), StdsSchedule2.class));
            //finish();
            }
        });

    backSchedule = findViewById(R.id.button7);
    backSchedule.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View view) {
            startActivity(new Intent(getApplicationContext(), StdHomepage.class));
            //finish();
            }
        });
    }
}