package com.singhla.lakshay.decrypt_philanthrophy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    ListAdapter adapter;
    LinearLayoutManager layoutManager;
    ArrayList<NGO_Detail> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialiseList();
        rv = (RecyclerView) findViewById(R.id.recycler);
        adapter = new ListAdapter(list);
        layoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(adapter);

    }
    void initialiseList(){
        list.clear();
        for(int i=0;i<10;i++){
            NGO_Detail item = new NGO_Detail();
            item.setId(i);
            item.setName("NGO Name "+ i);
            item.setDescription("NGO Description");
            item.setTarget(i*100);
            list.add(item);
        }

    }
}
