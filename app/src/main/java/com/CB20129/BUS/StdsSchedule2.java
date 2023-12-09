package com.CB20129.BUS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StdsSchedule2 extends AppCompatActivity {

    Button bookSlot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stds_schedule2);

    bookSlot = findViewById(R.id.button5);

    bookSlot.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View view) {
            startActivity(new Intent(getApplicationContext(), StdSchedule3.class));
            //finish();
            }
        });

    }
}