package ru.jotoo.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.digit_comparator);
        setContentView(R.layout.activity_main);

        /*EditText firstDigit = findViewById(R.id.first_digit);
        EditText secondDigit = findViewById(R.id.second_digit);

        Button compare = findViewById(R.id.compare);

        TextView result = findViewById(R.id.result);

        compare.setOnClickListener(v -> {
            String txtFirstDigitValue = firstDigit.getText().toString();
            String txtSecondDigitValue = secondDigit.getText().toString();

            try {
                Integer firstValue = Integer.valueOf(txtFirstDigitValue);
                Integer secondValue = Integer.valueOf(txtSecondDigitValue);


                if (firstValue.equals(secondValue)) {
                    result.setText("Ecuals");
                } else {
                    result.setText("Not Ecual");
                }
            } catch (NumberFormatException e) {
                result.setText("Error");
            }

        });*/
    }
}