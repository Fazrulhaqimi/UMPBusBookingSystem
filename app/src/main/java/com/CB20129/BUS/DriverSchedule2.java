package com.CB20129.BUS;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class DriverSchedule2 extends AppCompatActivity {

    Button morning2, evening2, BackSchedule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_schedule2);

        morning2 = findViewById(R.id.button2);
        morning2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), DriverSchedule1.class));
                //finish();
            }
        });
        evening2 = findViewById(R.id.button30);
        evening2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), DriverSchedule2.class));
                //finish();
            }
        });

        BackSchedule = findViewById(R.id.button7);
        BackSchedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), DriverSchedule1.class));
                //finish();
            }
        });
    }
}