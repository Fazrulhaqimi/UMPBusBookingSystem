package com.CB20129.BUS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class AdminProfile2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_profile2);

        // Retrieve data from Intent
        Intent intent = getIntent();
        if (intent != null) {
            String driverID = intent.getStringExtra("DriverID");

            // Now you can use driverId to display the user details in AdminProfile2
            displayUserDetails(driverID);
        }
    }

    private void displayUserDetails(String driverID) {
        // Example: Display user details in your UI
        EditText driverIdTextView = findViewById(R.id.fullName);
        driverIdTextView.setText(driverID);

        // Add more TextViews or UI components to display other user details
    }
}