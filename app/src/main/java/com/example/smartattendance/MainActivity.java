package com.example.smartattendance;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.ListView;

import com.example.smartattendance.Adapters.ClassAdapter;
import com.example.smartattendance.Model.Classes;
import com.example.smartattendance.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Classes> classesArrayList = new ArrayList<>();
    Classes classes;
    ListView listView;

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        classesArrayList.add(new Classes("6CSA", "DIGITAL IMAGE PROCESSING"));
        classesArrayList.add(new Classes("6CSA", "MACHINE LEARNING"));
        classesArrayList.add(new Classes("6CSA", "ARTIFICIAL INTELLIGENCE"));
        classesArrayList.add(new Classes("6CSA", "INFORMATION SECURITY SYSTEM"));
        classesArrayList.add(new Classes("6CSA", "CAO"));
        classesArrayList.add(new Classes("6CSB", "DIGITAL IMAGE PROCESSING"));
        classesArrayList.add(new Classes("6CSB", "MACHINE LEARNING"));
        classesArrayList.add(new Classes("6CSB", "ARTIFICIAL INTELLIGENCE"));
        classesArrayList.add(new Classes("6CSB", "INFORMATION SECURITY SYSTEM"));
        classesArrayList.add(new Classes("6CSB", "CAO"));
        classesArrayList.add(new Classes("6CSC", "DIGITAL IMAGE PROCESSING"));
        classesArrayList.add(new Classes("6CSC", "MACHINE LEARNING"));
        classesArrayList.add(new Classes("6CSC", "ARTIFICIAL INTELLIGENCE"));
        classesArrayList.add(new Classes("6CSC", "INFORMATION SECURITY SYSTEM"));
        classesArrayList.add(new Classes("6CSC", "CAO"));


        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ClassAdapter classAdapter = new ClassAdapter(classesArrayList, MainActivity.this);
        binding.classRecyclerView.setAdapter(classAdapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        binding.classRecyclerView.setLayoutManager(layoutManager);




    }
}