package com.CB20129.BUS;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class AdminProfile3 extends AppCompatActivity {

    FirebaseAuth fAuth;

    FirebaseFirestore fStore;

    EditText fullName, driverId, email, password, phone;

    Button registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_profile3);

        fullName = findViewById(R.id.driver_fullName);
        driverId = findViewById(R.id.driverId);
        email = findViewById(R.id.driver_email);
        password = findViewById(R.id.driver_password);
        phone = findViewById(R.id.driver_phoneNum);

        fAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();

        registerBtn = findViewById(R.id.registerDriverBtn);

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fAuth.createUserWithEmailAndPassword(email.getText().toString(), password.getText().toString()).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                    @Override
                    public void onSuccess(AuthResult authResult) {
//                      Getting email and password Current User
                        FirebaseUser user = fAuth.getCurrentUser();
                        Toast.makeText(AdminProfile3.this, "Account Created", Toast.LENGTH_SHORT).show();
//                      Create on FireStore
                        DocumentReference df = fStore.collection("Users").document(user.getUid());
                        Map<String, Object> userInfo = new HashMap<>();
                        userInfo.put("FullName", fullName.getText().toString());
                        userInfo.put("DriverID", driverId.getText().toString());
                        userInfo.put("EmailAddress", email.getText().toString());
                        userInfo.put("Password", password.getText().toString());
                        userInfo.put("PhoneNumber", phone.getText().toString());
                        userInfo.put("isDriver", "1");

//                      Store to FireStore
                        df.set(userInfo);

                        startActivity(new Intent(getApplicationContext(), AdminProfile1.class));
                        finish();
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(AdminProfile3.this, "Failed to Create Account", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}