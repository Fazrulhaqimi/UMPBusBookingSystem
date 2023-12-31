package com.CB20129.BUS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StdBooking1 extends AppCompatActivity {

    private Button dhuamBtn, umpsaBtn, backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_std_booking1);

        //UMPSA Button
        umpsaBtn = findViewById(R.id.button11);
        umpsaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), StdBooking4.class));
//                finish();
            }
        });

        //DHUAM Button
        dhuamBtn = findViewById(R.id.button10);
        dhuamBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), StdBooking1.class));
//                finish();
            }
        });

        //BACK Button
        backBtn = findViewById(R.id.button33);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), StdHomepage.class));
//                finish();
            }
        });
    }
}