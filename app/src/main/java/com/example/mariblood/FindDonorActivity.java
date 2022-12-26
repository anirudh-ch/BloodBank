package com.example.mariblood;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class FindDonorActivity extends AppCompatActivity {

    ListView listViewDonors;
    DatabaseReference databaseDonors;

    List<Donor> donorList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_donor);
        getSupportActionBar().hide();

        databaseDonors = FirebaseDatabase.getInstance().getReference("Donors");

        listViewDonors = findViewById(R.id.listViewDonors);

        donorList = new ArrayList<>();
    }

    @Override
    protected void onStart() {
        super.onStart();

        databaseDonors.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                for(DataSnapshot donorSnapshot: snapshot.getChildren()){
                    Donor donor =  donorSnapshot.getValue(Donor.class);

                    donorList.add(donor);
                }
                DonorList adapter = new DonorList(FindDonorActivity.this,donorList);
                listViewDonors.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}