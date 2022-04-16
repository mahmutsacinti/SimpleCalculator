package com.sacinti.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     EditText enternumber1;
     EditText enternumber2;
     TextView Results;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enternumber1 = findViewById(R.id.enternumber1);
        enternumber2= findViewById(R.id.enternumber2);
        Results = findViewById(R.id.textView);
    }
     public void  Toplam(View view){
        if(enternumber1.getText().toString().matches("")|| enternumber2.getText().toString().matches("")) {

            Results.setText("Please Number");

         } else {
            int number1 = Integer.parseInt(enternumber1.getText().toString());
            int number2 = Integer.parseInt(enternumber2.getText().toString());

            int res = number1 + number2;
            Results.setText("Toplam: " + res);

        }





     }
     public void Cıkarma(View view){
         if(enternumber1.getText().toString().matches("")|| enternumber2.getText().toString().matches("")) {

             Results.setText("Please Number");

         } else {
             int number1 = Integer.parseInt(enternumber1.getText().toString());
             int number2 = Integer.parseInt(enternumber2.getText().toString());

             int res = number1 - number2;
             Results.setText("Toplam: " + res);

         }

     }
     public void  Bolme(View view){
         if(enternumber1.getText().toString().matches("")|| enternumber2.getText().toString().matches("")) {

             Results.setText("Please Number");

         } else {
             int number1 = Integer.parseInt(enternumber1.getText().toString());
             int number2 = Integer.parseInt(enternumber2.getText().toString());

             int res = number1 / number2;
             Results.setText("Toplam: " + res);

         }

     }

     public void Carp(View view){
         if(enternumber1.getText().toString().matches("")|| enternumber2.getText().toString().matches("")) {

             Results.setText("Please Number");

         } else {
             int number1 = Integer.parseInt(enternumber1.getText().toString());
             int number2 = Integer.parseInt(enternumber2.getText().toString());

             int res = number1 * number2;
             Results.setText("Toplam: " + res);

         }

     }





}