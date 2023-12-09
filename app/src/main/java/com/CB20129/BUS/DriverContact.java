package com.CB20129.BUS;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;

public class DriverContact extends AppCompatActivity {

    private Button phone,email,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_contact);

        phone = (Button) findViewById(R.id.button4);
        email = (Button) findViewById(R.id.button5);
        back  = (Button) findViewById(R.id.button26);

        phone.setOnClickListener(v -> {
            Intent telefon = new Intent(Intent.ACTION_DIAL);
            telefon.setData(Uri.parse("tel:094315044"));
            startActivity(telefon);
        });
        email.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:")); // only email apps should handle this
            intent.putExtra(Intent.EXTRA_EMAIL, "ppph@ump.edu.my");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Asking for information");
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        });

        //Back Button
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), DriverHomepage.class));
//                finish();
            }
        });

    }
}