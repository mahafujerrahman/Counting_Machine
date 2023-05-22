package com.inspirecareerit.digitalcountingmachine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView tvDisplay;
    ImageView addbtn, subbtn, resetbtn;

    int count = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//==============find===============================
        tvDisplay = findViewById(R.id.tvDisplay);
        addbtn = findViewById(R.id.addbtn);
        subbtn = findViewById(R.id.subbtn);
        resetbtn = findViewById(R.id.resetbtn);




        //==============Onclick code================================


        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                count ++;
                tvDisplay.setText(""+count);



            }
        });




        subbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                count --;
                tvDisplay.setText(""+count);

            }
        });




        resetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                count = 0;
                tvDisplay.setText(""+count);

            }
        });








    }
}