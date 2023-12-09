package com.CB20129.BUS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminBooking extends AppCompatActivity {

    Button DHUAM, UMPSA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_booking);

        //UMPSA Button
        UMPSA = findViewById(R.id.button20);
        UMPSA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), AdminBooking2.class));
//                finish();
            }
        });

        //DHUAM Button
        DHUAM = findViewById(R.id.button19);
        DHUAM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), AdminBooking.class));
//                finish();
            }
        });
    }
}