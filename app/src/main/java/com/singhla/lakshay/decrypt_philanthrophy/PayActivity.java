package com.singhla.lakshay.decrypt_philanthrophy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Lakshay Singhla on 03-Feb-18.
 */

public class PayActivity extends AppCompatActivity {

    EditText address,amount,des;
    Button pay;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);

        address = (EditText) findViewById(R.id.address);
        amount = (EditText) findViewById(R.id.amount);
        des = (EditText) findViewById(R.id.description);

        pay = (Button) findViewById(R.id.payButton);
        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
