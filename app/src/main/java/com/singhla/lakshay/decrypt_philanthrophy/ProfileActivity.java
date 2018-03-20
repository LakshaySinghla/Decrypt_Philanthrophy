package com.singhla.lakshay.decrypt_philanthrophy;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Lakshay Singhla on 03-Feb-18.
 */

public class ProfileActivity extends AppCompatActivity {

    ImageView img;
    TextView name, email, location;
    Button getMoney;
    RecyclerView rvDonated, rvRecieved;
    LinearLayoutManager layoutManager1, layoutManager2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        img = (ImageView) findViewById(R.id.prf_img);
        name = (TextView) findViewById(R.id.name);
        email = (TextView) findViewById(R.id.email);
        location = (TextView) findViewById(R.id.location);

        rvDonated = (RecyclerView) findViewById(R.id.donated_list);
        rvRecieved = (RecyclerView) findViewById(R.id.recieved_list);

        getMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ProfileActivity.this, FormActivity.class);
                startActivity(i);
            }
        });

        layoutManager1 = new LinearLayoutManager(this);
        layoutManager2 = new LinearLayoutManager(this);
        rvRecieved.setLayoutManager(layoutManager1);
        rvDonated.setLayoutManager(layoutManager2);

    }
}
