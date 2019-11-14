package com.example.android2ndassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import com.example.android2ndassignment.Model.User;

import java.util.ArrayList;
import java.util.List;

public class RvActivity extends AppCompatActivity {
    List<User> userList;
    private RecyclerView
            recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rv);
        recyclerView=findViewById(R.id.rvuser);



        Intent intent = getIntent();
      userList = (List<User>) intent.getSerializableExtra("userlist");

       MyRvAdapter Adapter = new MyRvAdapter(userList, RvActivity.this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(Adapter);
    }
}