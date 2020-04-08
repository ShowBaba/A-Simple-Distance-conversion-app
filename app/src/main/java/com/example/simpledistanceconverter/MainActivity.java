package com.example.simpledistanceconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

import static java.lang.Double.valueOf;
import static java.lang.String.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        create a button variable to save the inputs from a button
        Button buttonMilesToKm = (Button) findViewById(R.id.buttonMilesToKm);
//        create a listener to listen for button clicks
        buttonMilesToKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                get text from text boxes and store in variable
                EditText  TextBoxKm = (EditText) findViewById(R.id.editTextKm);
                EditText TextBoxMiles = (EditText) findViewById(R.id.editTextMiles);
//                convert the value to double
                double vMiles = Double.valueOf(TextBoxMiles.getText().toString());
//                do the calculations and store in a variable
                double vKm = vMiles / 0.62137;
//                format the result to give 2 decimal place
                DecimalFormat formatVal = new DecimalFormat("##.##");
//                display the results to the edit text view
                TextBoxKm.setText(formatVal.format(vKm));
//                the above block of code converts miles to km


            }
        });
        //        create a button variable to save the inputs from a button
        Button buttonKmToMiles = (Button) findViewById(R.id.buttonKmToMiles);
//        create a listener to listen for button clicks
        buttonKmToMiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                get text from text boxes and store in variable
                EditText TextBoxMiles = (EditText) findViewById(R.id.editTextMiles);
                EditText TextBoxKm = (EditText) findViewById(R.id.editTextKm);
//                convert the value to double
                double vKm = Double.valueOf(TextBoxKm.getText().toString());
//                do the calculations and store in a variable
                double vMiles = vKm * 0.62137;
//                format the result to give 2 decimal place
                DecimalFormat formatval = new DecimalFormat("##.##");
//                display the results to the edit text view
                TextBoxMiles.setText(formatval.format(vMiles));
//                the above block of code converts miles to km

            }
        });

    }
}
