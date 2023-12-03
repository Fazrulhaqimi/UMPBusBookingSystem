package com.CB20129.BUS;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.firestore.DocumentChange;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.Objects;

public class AdminProfile1 extends AppCompatActivity {

    Button registerBtn, backBtn;
    CardView viewCard;
    RecyclerView recyclerView;
    ArrayList<UserModel> userArrayList;
    AdminDriverAdapter adapter;
    FirebaseFirestore db;
    ProgressDialog progressDialog;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_profile1);

        progressDialog = new ProgressDialog(this);
        progressDialog.setCancelable(false);
        progressDialog.setMessage("Fetch Data....");
        progressDialog.show();

        recyclerView = findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

//      Initialize
        db = FirebaseFirestore.getInstance();
        userArrayList = new ArrayList<UserModel>();
        adapter = new AdminDriverAdapter(AdminProfile1.this, userArrayList);

        recyclerView.setAdapter(adapter);

//      Getting data from FireStore
        EventChangeListener();

// View Card
        viewCard = findViewById(R.id.viewDriverDetail);

        if (viewCard != null) {
            viewCard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Check if there's an item selected in the adapter
                    int selectedPosition = adapter.getSelectedPosition();

                    if (selectedPosition != RecyclerView.NO_POSITION && selectedPosition < userArrayList.size()) {
                        // Get the selected item
                        UserModel selectedUser = userArrayList.get(selectedPosition);

                        // You can pass data to the next activity here if needed
                        Intent intent = new Intent(getApplicationContext(), AdminProfile2.class);

                        // Pass relevant data to AdminProfile2
                        intent.putExtra("DriverID", selectedUser.getDriverID());
                        // Add more data as needed

                        startActivity(intent);
                        finish();
                    } else {
                        // If no item is selected, show a message or handle as needed
                        showToast("Please select a user before clicking the CardView");
                    }
                }
            });
        } else {
            // Handle the case where viewCard is null (e.g., if the ID is incorrect)
            showToast("Error: CardView not found");
        }


//        Register Button
        registerBtn = findViewById(R.id.driverRegisterBtn);
        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), AdminProfile3.class));
            }
        });

//        Back Button
        backBtn = findViewById(R.id.backBtn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), AdminHomepage.class));
                finish();
            }
        });
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void EventChangeListener() {
        db.collection("Users").orderBy("isDriver")
                .addSnapshotListener(new EventListener<QuerySnapshot>() {
                    @SuppressLint("NotifyDataSetChanged")
                    @Override
                    public void onEvent(@Nullable QuerySnapshot value, @Nullable FirebaseFirestoreException error) {
                        if (error != null) {
                            if (progressDialog.isShowing()) {
                                progressDialog.dismiss();
                            }

                            Log.e("FireStore Error", Objects.requireNonNull(error.getMessage()));
                            return;
                        }

                        assert value != null;
                        for (DocumentChange dc : value.getDocumentChanges()) {
                            if (dc.getType() == DocumentChange.Type.ADDED) {
                                userArrayList.add(dc.getDocument().toObject(UserModel.class));
                            }

                            adapter.notifyDataSetChanged();
                            if (progressDialog.isShowing()) {
                                progressDialog.dismiss();
                            }
                        }
                    }
                });

        // Set the selected position when an item is clicked in the adapter
        adapter.setOnItemClickListener(new AdminDriverAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                adapter.setSelectedPosition(position);
            }
        });
    }

}