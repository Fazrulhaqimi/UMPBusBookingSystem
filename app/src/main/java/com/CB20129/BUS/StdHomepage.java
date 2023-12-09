package com.CB20129.BUS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class StdHomepage extends AppCompatActivity {

    Button signoutBtn;

    EditText profileBtn, BookingBtn, ScheduleBtn, ReportBtn, ContactBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_std_homepage);



//      Profile Button
        profileBtn = findViewById(R.id.student_profile);
        profileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), StdProfile1.class));
                finish();
            }
        });

        //Booking Button
        BookingBtn = findViewById(R.id.student_booking);
        BookingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), StdBooking1.class));
//                finish();
            }
        });

        //Schedule Button
        ScheduleBtn = findViewById(R.id.student_schedule);
        ScheduleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), StdSchedule1.class));
//                finish();
            }
        });

        //Report Button
        ReportBtn = findViewById(R.id.student_report);
        ReportBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), StdReport1.class));
//                finish();
            }
        });

        //Contact Button
        ContactBtn = findViewById(R.id.student_contact);
        ContactBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), StdContact.class));
//                finish();
            }
        });

//      Logout Button
        signoutBtn = findViewById(R.id.signoutBtn);
        signoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        });
    }
}