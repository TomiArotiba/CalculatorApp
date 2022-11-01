package com.example.calculatorapplab03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText tvMain;
    private boolean isNewOperation = true;
    private String oldNumber="";
    private String operator = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.tvMain = findViewById(R.id.mainScreen);
    }

    public void numberEvent(View view) {
        if(this.isNewOperation)
            this.tvMain.setText("");
        this.isNewOperation = false;
        String number = this.tvMain.getText().toString();
        switch(view.getId()) {
            case R.id.n0:
                number += "0";
                break;
            case R.id.n1:
                number += "1";
                break;
            case R.id.n2:
                number += "2";
                break;
            case R.id.n3:
                number += "3";
                break;
            case R.id.n4:
                number += "4";
                break;
            case R.id.n5:
                number += "5";
                break;
            case R.id.n6:
                number += "6";
                break;
            case R.id.n7:
                number += "7";
                break;
            case R.id.n8:
                number += "8";
                break;
            case R.id.n9:
                number += "9";
                break;
            case R.id.dot:
                number += ".";
                break;
            case R.id.changeSign:
                number = String.valueOf(Double.parseDouble(number)*-1);
                break;
            case R.id.delete:
                if(number.length() > 1) {
                    String newText = number.substring(0, number.length() - 1);
                    number = newText;
                    break;
                }
                else if (number.length() <= 1) {
                    number = "0";
                }
        }
        this.tvMain.setText(number);
    }

    public void operatorEvent(View view) {
        this.isNewOperation = true;
        this.oldNumber = this.tvMain.getText().toString();
        switch(view.getId()) {
            case R.id.addition: operator = "+"; break;
            case R.id.subtraction: operator = "-"; break;
            case R.id.multiplication: operator = "*"; break;
            case R.id.division: operator = "/"; break;
            case R.id.squareRoot: operator = "√"; break;
        }
    }

    public void equalsToEvent(View view) {
        String newNumber = this.tvMain.getText().toString();
        double result = 0.0;
        switch (operator) {
            case "+":
                result = Double.parseDouble(oldNumber) + Double.parseDouble(newNumber);
                break;
            case "-":
                result = Double.parseDouble(oldNumber) - Double.parseDouble(newNumber);
                break;
            case "*":
                result = Double.parseDouble(oldNumber) * Double.parseDouble(newNumber);
                break;
            case "/":
                result = Double.parseDouble(oldNumber) / Double.parseDouble(newNumber);
                break;
            case "√":
                result = Math.sqrt(Double.parseDouble(oldNumber));
                break;
        }
        this.tvMain.setText(result+"");
    }

    public void clearAllEvent(View view) {
        this.tvMain.setText("0");
        this.isNewOperation = true;
    }

    public void percentageEvent(View view) {
        double n = Double.parseDouble(this.tvMain.getText().toString())/100;
        this.tvMain.setText(n+"");
        this.isNewOperation = true;
    }
}
