package com.example.smsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText et1,et2;
Button b;
Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        b=findViewById(R.id.btn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(MainActivity.this,MainActivity.class);
                SmsManager s=SmsManager.getDefault();
                s.sendTextMessage(et1.getText().toString(),null,et2.getText().toString(),null,null);
                Toast.makeText(MainActivity.this,"Message successfully sent",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
