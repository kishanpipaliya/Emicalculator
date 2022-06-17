package com.example.emicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtAmount, edtInterest, edtPeriodYear;
    String dataLA = "", datainterest = "", datayear = "";
    Button btnReset, btncalculate;
    float loanamount=0,intrest=0,year=0,totalEmi=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initbinding();
        initonclick();
    }

    void initbinding() {
        edtAmount = findViewById(R.id.edtAmount);
        edtInterest = findViewById(R.id.edtInterest);
        edtPeriodYear = findViewById(R.id.edtPeriodYear);
        btncalculate = findViewById(R.id.btnCalculate);
        btnReset = findViewById(R.id.btnReset);


    }

    void initonclick() {

        btncalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dataLA = edtAmount.getText().toString();
                datainterest = edtInterest.getText().toString();
                datayear = edtPeriodYear.getText().toString();



                loanamount = Integer.parseInt(dataLA);
                intrest = Integer.parseInt(datainterest);
                year = Integer.parseInt(datayear);

                totalEmi = (loanamount*intrest*year)/1200;


                Toast.makeText(MainActivity.this, ""+totalEmi, Toast.LENGTH_SHORT).show();


            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtAmount.setText("");
                edtInterest.setText("");
                edtPeriodYear.setText("");

            }
        });


    }
}