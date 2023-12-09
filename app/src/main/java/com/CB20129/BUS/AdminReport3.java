package com.CB20129.BUS;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class AdminReport3 extends AppCompatActivity {

    Button student, driver, backReport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_report3);

        student = findViewById(R.id.button24);
        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), AdminReport1.class));
                //finish();
            }
        });

        driver = findViewById(R.id.button18);
        driver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), AdminReport3.class));
                //finish();
            }
        });

        backReport = findViewById(R.id.button21);
        backReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), AdminHomepage.class));
                //finish();
            }
        });
    }
}