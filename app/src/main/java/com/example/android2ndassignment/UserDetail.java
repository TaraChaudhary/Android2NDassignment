package com.example.android2ndassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class UserDetail extends AppCompatActivity {
    TextView nametext, dobtext, gendertext, countrytext, emailtext, phonetext;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detail);
        nametext = findViewById(R.id.name);
        dobtext = findViewById(R.id.dob);
        gendertext = findViewById(R.id.gender);
        countrytext = findViewById(R.id.country);
        emailtext = findViewById(R.id.email);
        phonetext = findViewById(R.id.phone);
        imageView = findViewById(R.id.recievedimage);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String dob = intent.getStringExtra("dob");
        String gender = intent.getStringExtra("gender");
        String country = intent.getStringExtra("country");
        String email = intent.getStringExtra("email");
        String phone = intent.getStringExtra("phone");

        String image   = intent.getStringExtra("image");


        int imageID = Integer.valueOf(image);

        nametext.setText("Name:" +name);
        dobtext.setText("Dob:" +dob);
        gendertext.setText("Gender:" +gender);
        countrytext.setText("Country"+country);
        emailtext.setText("Email"+email);
        phonetext.setText("Contact"+phone);

        imageView.setImageResource(imageID);

    }
}
