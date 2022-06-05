package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
MyAdapter myAdapter;
List<Modal> modalList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        modalList = new ArrayList<Modal>();
        recyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        modalList.add(new Modal("Rahul","BCA",R.drawable.one));
        modalList.add(new Modal("Aman","BCA",R.drawable.two));
        modalList.add(new Modal("Gaurav","MCA",R.drawable.three));
        modalList.add(new Modal("Mann","BCA",R.drawable.four));
        modalList.add(new Modal("Chaman","MCA",R.drawable.five));
        modalList.add(new Modal("Daman","BCA",R.drawable.six));
        modalList.add(new Modal("Rahul","BCA",R.drawable.one));
        modalList.add(new Modal("Aman","BCA",R.drawable.two));
        modalList.add(new Modal("Gaurav","MCA",R.drawable.three));
        modalList.add(new Modal("Mann","BCA",R.drawable.four));
        modalList.add(new Modal("Chaman","MCA",R.drawable.five));
        modalList.add(new Modal("Daman","BCA",R.drawable.six));
//        Modal modal = new Modal();
//        modal.setName("Asif");
//        modal.setGrade("MCA");
//        modal.setImageId(R.drawable.six);
        myAdapter = new MyAdapter(modalList);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(myAdapter);
    }
}