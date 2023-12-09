package com.CB20129.BUS;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class StdSchedule3 extends AppCompatActivity {

    Button OkayButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_std_schedule3);

        OkayButton = findViewById(R.id.button32);
        OkayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), StdHomepage.class));
                //finish();
            }
        });
    }
}