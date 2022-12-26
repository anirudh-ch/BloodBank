package com.example.mariblood;


import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddDonorActivity extends AppCompatActivity {

    EditText hospitalName,hospitalNumber,donorName,donorAge,donorDate;
    Spinner bloodType;
    Button btnSubmit;

    DatabaseReference databaseDonors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_donor);
        getSupportActionBar().hide();

        databaseDonors = FirebaseDatabase.getInstance().getReference("Donors");

        hospitalName = findViewById(R.id.hospitallName);
        hospitalNumber = findViewById(R.id.hospitallNumber);
        donorName = findViewById(R.id.donorName);
        donorAge = findViewById(R.id.donorAge);
        donorDate = findViewById(R.id.donorDate);

        bloodType = findViewById(R.id.bloodType);

        btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit();
            }
        });

    }
    private void submit(){
        String hName = hospitalName.getText().toString().trim();
        String hNumber = hospitalNumber.getText().toString().trim();
        String dName = donorName.getText().toString().trim();
        String dAge = donorAge.getText().toString().trim();
        String dDate = donorDate.getText().toString().trim();

        String bType = bloodType.getSelectedItem().toString();

        if(!TextUtils.isEmpty(hName)){
               String id = databaseDonors.push().getKey();
               Donor donor = new Donor(hName,hNumber,dName,dAge,dDate,id,bType);
               databaseDonors.child(id).setValue(donor);
            Toast.makeText(this,"donor added",Toast.LENGTH_SHORT).show();
            finish();

        }else{
            hospitalName.setError("enter hospital name");

        }
    }


}