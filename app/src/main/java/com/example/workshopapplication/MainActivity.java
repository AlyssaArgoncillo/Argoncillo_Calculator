package com.example.workshopapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

   TextView txtInput1;
   TextView txtInput2;
   TextView txtOutput;
   EditText txtOperand1, txtOperand2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtOutput = findViewById(R.id.txtOutput);
        txtInput1 = findViewById(R.id.txtInput1);
        txtInput2 = findViewById(R.id.txtInput2);
        txtOperand1 = findViewById(R.id.txtValue1);
        txtOperand2 = findViewById(R.id.txtValue2);


        Button myAdd = findViewById(R.id.btnAdd);
        Button myClear = findViewById(R.id.btnEnd);
        Button mySubtract = findViewById(R.id.btnSubtract);
        Button myMultiply = findViewById(R.id.btnMultiply);
        Button myDivide = findViewById(R.id.btnDivide);


        myAdd.setOnClickListener(this);
        mySubtract.setOnClickListener(this);
        myMultiply.setOnClickListener(this);
        myDivide.setOnClickListener(this);
        myClear.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnDivide) {
            double in1, in2, out;
            in1 = Double.parseDouble(txtOperand1.getText().toString());
            in2 = Double.parseDouble(txtOperand2.getText().toString());
            out = in1 / in2;
            txtOutput.setText(String.valueOf(out));

        }
        if (v.getId() == R.id.btnMultiply) {
            double in1, in2, out;
            in1 = Double.parseDouble(txtOperand1.getText().toString());
            in2 = Double.parseDouble(txtOperand2.getText().toString());
            out = in1 * in2;
            txtOutput.setText(String.valueOf(out));

        }
        if (v.getId() == R.id.btnSubtract) {
            double in1, in2, out;
            in1 = Double.parseDouble(txtOperand1.getText().toString());
            in2 = Double.parseDouble(txtOperand2.getText().toString());
            out = in1 - in2;
            txtOutput.setText(String.valueOf(out));

        }
        if (v.getId() == R.id.btnAdd){
           double in1, in2, out;
           in1 = Double.parseDouble(txtOperand1.getText().toString());
           in2 = Double.parseDouble(txtOperand2.getText().toString());
           out = in1 + in2;
           txtOutput.setText(String.valueOf(out));

        } else if (v.getId() == R.id.btnEnd){
           txtOutput.setText("Result");
        }
    }
}