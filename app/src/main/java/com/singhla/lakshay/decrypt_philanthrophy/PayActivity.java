package com.singhla.lakshay.decrypt_philanthrophy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.Web3jFactory;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.Transfer;
import org.web3j.utils.Convert;

import java.math.BigDecimal;

/**
 * Created by Lakshay Singhla on 03-Feb-18.
 */

public class PayActivity extends AppCompatActivity {

    EditText address,amount,des;
    Button pay;
    private static final String INTENT_EXTRA_PAYMENTREQUEST = "paymentrequest";
    private static final String INTENT_EXTRA_PAYMENT = "payment";
    private static final String INTENT_EXTRA_TRANSACTION_HASH = "transaction_hash";
    private static final String MIMETYPE_PAYMENTREQUEST = "application/bitcoin-paymentrequest";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);

        address = (EditText) findViewById(R.id.address);
        amount = (EditText) findViewById(R.id.amount);
        des = (EditText) findViewById(R.id.description);

        pay = (Button) findViewById(R.id.payButton);
        pay.setBackgroundDrawable(getResources().getDrawable(R.drawable.custom_button_swap));

        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Web3j web3 = Web3jFactory.build(new HttpService("http://localhost:8545"));
                Credentials credentials;
                // defaults to http://localhost:8545/
                try {
                    Web3ClientVersion web3ClientVersion = web3.web3ClientVersion().sendAsync().get();
                    String clientVersion = web3ClientVersion.getWeb3ClientVersion();
                    credentials = WalletUtils.loadCredentials("", "C:\\Windows\\System32\\node1\\keystore");
                    TransactionReceipt transactionReceipt = Transfer.sendFunds(
                            web3, credentials, "0x<address>|<ensName>",
                            BigDecimal.valueOf(1.0), Convert.Unit.ETHER)
                            .send();
                    Log.d("Transaction Reciept",TransactionReceipt.class.getName());
                }catch (Exception e1)
                {
                    Toast.makeText(PayActivity.this, "Connect Failed", Toast.LENGTH_SHORT).show();
                    Log.e("Error","");
                }



            }
        });

    }
}
