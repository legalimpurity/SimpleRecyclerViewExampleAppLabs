package com.legalimpurity.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<String> studentNames = new ArrayList<>();
    ArrayList<String> studentClass = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentNames.add("Rajat");
        studentClass.add("AII");

        studentNames.add("Sahil");
        studentClass.add("AII");

        studentNames.add("Ashish");
        studentClass.add("AII");

        RecyclerView recyclerView = findViewById(R.id.my_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(studentNames,studentClass));
    }
}
