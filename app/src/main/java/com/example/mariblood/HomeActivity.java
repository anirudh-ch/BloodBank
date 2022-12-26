package com.example.mariblood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {
    CardView donateBloodCard,findDonorCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();


        donateBloodCard = findViewById(R.id.donateBloodCard);
        findDonorCard = findViewById(R.id.findDonorCard);


        donateBloodCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this,AddDonorActivity.class);
                startActivity(i);
            }
        });


        findDonorCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this,FindDonorActivity.class);
                startActivity(i);
            }
        });
    }
}