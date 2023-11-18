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

public class StdRegister extends AppCompatActivity {

    EditText full_name, matric_id, email, password, phone;

    Button registerBtn;
    FirebaseAuth fAuth;
    FirebaseFirestore fStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_std_register);

        fAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();

        full_name = findViewById(R.id.full_name);
        matric_id = findViewById(R.id.matric_id);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        phone = findViewById(R.id.phoneNum);
        registerBtn = findViewById(R.id.registerBtn);


        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fAuth.createUserWithEmailAndPassword(email.getText().toString(),password.getText().toString()).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                    @Override
                    public void onSuccess(AuthResult authResult) {
//              Getting email and password Current User
                        FirebaseUser user = fAuth.getCurrentUser();
                        Toast.makeText(StdRegister.this, "Account Created", Toast.LENGTH_SHORT).show();
//              Create on FireStore
                        DocumentReference df = fStore.collection("Users").document(user.getUid());
                        Map<String, Object> userInfo = new HashMap<>();
                        userInfo.put("FullName", full_name.getText().toString());
                        userInfo.put("MatricID", matric_id.getText().toString());
                        userInfo.put("EmailAddress", email.getText().toString());
                        userInfo.put("Password", password.getText().toString());
                        userInfo.put("PhoneNumber", phone.getText().toString());
                        userInfo.put("isUser", "1");

//              Store to FireStore
                        df.set(userInfo);

                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        finish();
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(StdRegister.this, "Failed to Create Account", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}