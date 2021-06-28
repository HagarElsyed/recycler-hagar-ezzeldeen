package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Adapter adapter;
    ArrayList<String> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        names = new ArrayList<>();
        names.add("first product name");
        names.add("secound product name");
        names.add("third product name");
        names.add("fourth product name");
        names.add("fifth product name");
        names.add("sixth product name");
        names.add("seventh product name");
        names.add("eightth product name");
        names.add("nineth product name");

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager( Context  : this   )    );
        adapter =new Adapter(Context  :this,names  );
        recyclerView.setAdapter(adapter);
    }
}
