package com.singhla.lakshay.decrypt_philanthrophy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Lakshay Singhla on 04-Feb-18.
 */

public class FormActivity extends AppCompatActivity {

    EditText name, target, location,purpose;
    Button done;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activty_ngo_details_form);

        name  = (EditText) findViewById(R.id.ngoName);
        location = (EditText) findViewById(R.id.location);
        target = (EditText) findViewById(R.id.target);
        purpose = (EditText) findViewById(R.id.purpose);
        done  = (Button) findViewById(R.id.done);
        done.setBackgroundDrawable(getResources().getDrawable(R.drawable.custom_button_swap));


        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}
