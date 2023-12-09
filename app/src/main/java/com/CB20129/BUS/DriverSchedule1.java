package com.CB20129.BUS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class DriverSchedule1 extends AppCompatActivity {

    Button morning1, evening1, OkaySchedule;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_schedule1);

        morning1 = findViewById(R.id.button2);
        morning1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), DriverSchedule1.class));
                //finish();
            }
        });
        evening1 = findViewById(R.id.button30);
        evening1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), DriverSchedule2.class));
                //finish();
            }
        });

        OkaySchedule = findViewById(R.id.button7);
        OkaySchedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), DriverHomepage.class));
                //finish();
            }
        });
    }
}