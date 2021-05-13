package com.example.recyclerview20;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> userList;
    Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initRecyclerView();
    }

    private void initData() {

        userList = new ArrayList<>();
        userList.add(new ModelClass(R.drawable.kat,"Katrina","1:00 Am","Love you Pavan","_____________________________________"));
        userList.add(new ModelClass(R.drawable.img3,"Dhoni","5:00 Pm","Teach me helicopter shot","_____________________________________"));
        userList.add(new ModelClass(R.drawable.img4,"Pawan","6:00 Am","Hello Mitrama","_____________________________________"));
        userList.add(new ModelClass(R.drawable.ronaldo,"Ronaldo","8:00 Pm","Lets play again..!","_____________________________________"));
    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}