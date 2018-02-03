package com.singhla.lakshay.decrypt_philanthrophy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    NgoListAdapter adapter;
    LinearLayoutManager layoutManager;
    ArrayList<NGO_Detail> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialiseList();
        rv = (RecyclerView) findViewById(R.id.recycler);
        adapter = new NgoListAdapter(list, this);
        layoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.hiw:
                Intent i1 = new Intent(this, HIWActivty.class);
                startActivity(i1);
                return true;
            case R.id.profile:
                Intent i2 = new Intent(this, ProfileActivity.class);
                startActivity(i2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
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
