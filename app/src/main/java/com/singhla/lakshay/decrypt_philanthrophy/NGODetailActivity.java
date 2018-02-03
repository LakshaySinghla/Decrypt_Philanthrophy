package com.singhla.lakshay.decrypt_philanthrophy;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Lakshay Singhla on 03-Feb-18.
 */

public class NGODetailActivity extends AppCompatActivity {

    TextView name,des,tar,currentFunds;
    Button pay;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ngo_details);
        name = (TextView) findViewById(R.id.name);
        des = (TextView) findViewById(R.id.description);
        tar = (TextView) findViewById(R.id.target);
        currentFunds = (TextView) findViewById(R.id.currentfvalue);
        pay = (Button) findViewById(R.id.payButton);
        pay.setBackgroundDrawable(getResources().getDrawable(R.drawable.custom_button_swap));
        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(NGODetailActivity.this, PayActivity.class);
                startActivity(i);
            }
        });

    }
}
