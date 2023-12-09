package com.CB20129.BUS;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class DriverReport1 extends AppCompatActivity {

    Button Send, History;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_report1);

        Send = findViewById(R.id.SendReport);
        Send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), DriverReport2.class));
                //finish();
            }
        });

        History = findViewById(R.id.HistoryDriver);
        History.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), DriverReport2.class));
                //finish();
            }
        });

    }
}