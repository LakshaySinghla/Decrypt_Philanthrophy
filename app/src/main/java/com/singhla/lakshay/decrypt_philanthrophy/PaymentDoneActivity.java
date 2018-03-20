package com.singhla.lakshay.decrypt_philanthrophy;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Lakshay Singhla on 20-Mar-18.
 */

public class PaymentDoneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_done);
        ImageView checkAnim = (ImageView) findViewById(R.id.checkAnimation);
        ((Animatable) checkAnim.getDrawable()).start();

        TextView textView = (TextView) findViewById(R.id.bookingConfirmText);
        textView.setText("Donation made successfully !");

    }
}
