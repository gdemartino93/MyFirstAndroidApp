package com.gianluca.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText numberOne, numberTwo;
    TextView subtractionResult, sumResult, divisionResult, multiplicationResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberOne = findViewById(R.id.numberOne);
        numberTwo = findViewById(R.id.numberTwo);
        subtractionResult = findViewById(R.id.subtractionResult);
        sumResult = findViewById(R.id.sumResult);
        divisionResult = findViewById(R.id.divisionResult);
        multiplicationResult = findViewById(R.id.multiplicationResult);
    }
    public void showConfirm(View view){
        String firstNumber = numberOne.getText().toString();
        String secondNumber = numberTwo.getText().toString();
        int resultSumNumber = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
        int resultSubNumber = Integer.parseInt(firstNumber) - Integer.parseInt(secondNumber);
        int resultMulNumber = Integer.parseInt(firstNumber) * Integer.parseInt(secondNumber);
        int resultDivNumber = Integer.parseInt(firstNumber) / Integer.parseInt(secondNumber);
        sumResult.setText(String.valueOf(resultSumNumber));
        subtractionResult.setText(String.valueOf(resultSubNumber));
        divisionResult.setText(String.valueOf(resultDivNumber));
        multiplicationResult.setText(String.valueOf(resultMulNumber));
        Toast.makeText(MainActivity.this,"Calcolato!",Toast.LENGTH_LONG).show();
    }
}