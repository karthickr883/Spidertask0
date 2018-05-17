package com.example.karthik.pay;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity { public int k=0; public int n,flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {flag=0;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button re1 = (Button) findViewById(R.id.button);
        Button rs2 = (Button) findViewById(R.id.button2);
        Button rs5 = (Button) findViewById(R.id.button3);
        Button rs10 = (Button) findViewById(R.id.button4);
        final RelativeLayout r = (RelativeLayout)findViewById(R.id.rLayout);
        final TextView t = (TextView)findViewById(R.id.textView2);
        re1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k = k + 1;
            }
        });
        rs2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k = k + 2;
            }
        });

        rs5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k = k + 5;
            }
        });
        rs10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k=k+10;
            }
        });
        Button reset = (Button)findViewById(R.id.button5);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {flag++;
                k=0;
                Random rand = new Random();
                    n = rand.nextInt(40);
                t.setText("           "+String.valueOf(n));
            }
        });
        Button pay = (Button)findViewById(R.id.button6);
        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag!=0) {
                    if (k == n){
                        r.setBackgroundColor(Color.GREEN);
                        Toast.makeText(MainActivity.this,"Congrats click RESET to try again :)",Toast.LENGTH_SHORT).show();}
                    else {
Toast.makeText(MainActivity.this,"You have paid wrongly :(",Toast.LENGTH_SHORT).show();
                        r.setBackgroundColor(Color.BLUE);
                    }
                } else if(flag==0){
                    if (k == 10)
                    {r.setBackgroundColor(Color.GREEN);
                    Toast.makeText(MainActivity.this,"Congrats click RESET to try again :)",Toast.LENGTH_SHORT).show();}
                    else {
                        Toast.makeText(MainActivity.this, "U paid wrongly", Toast.LENGTH_SHORT).show();
                        r.setBackgroundColor(Color.BLUE);
                    }
                }


            }
        });

    }
}