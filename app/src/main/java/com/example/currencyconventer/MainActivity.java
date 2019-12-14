package com.example.currencyconventer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void Convert(View view){
        EditText editText=findViewById(R.id.Amount);
        String AmountInPounds = editText.getText().toString();
        double AmountInPoundsDouble = Double.parseDouble(AmountInPounds);
        double AmountInDollarsDouble = AmountInPoundsDouble * 1.3;
        String AmountInDollars = String.format("%.2f", AmountInDollarsDouble);
        Toast.makeText(this,   AmountInPounds + "€ is" + AmountInDollars + "$", Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
