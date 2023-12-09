package com.CB20129.BUS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class DriverHomepage extends AppCompatActivity {

    Button logoutBtn;
    EditText profileBtn, ScheduleBtn, ReportBtn, ContactBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_homepage);

//      Profile Button
        profileBtn = findViewById(R.id.driverProfile);
        profileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), DriverProfile1.class));
                finish();
            }
        });

        //Schedule Button
        ScheduleBtn = findViewById(R.id.driverSchedule);
        ScheduleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), DriverSchedule1.class));
//                finish();
            }
        });

        //Report Button
        ReportBtn = findViewById(R.id.driverReport);
        ReportBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), DriverReport1.class));
//                finish();
            }
        });

        //Contact Button
        ContactBtn = findViewById(R.id.driverContact);
        ContactBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), DriverContact.class));
//                finish();
            }
        });

//        Logout Button
        logoutBtn = findViewById(R.id.signoutBtn);
        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        });
    }
}