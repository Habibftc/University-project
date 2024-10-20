package com.myapp.mydatepickerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private DatePicker datePicker;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datePicker = (DatePicker) findViewById(R.id.datePickerId);
        textView = (TextView) findViewById(R.id.textViewId);
        button = (Button) findViewById(R.id.buttonId);

        textView.setText(currentDate());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(currentDate());
            }
        });
    }
    String currentDate(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Current Date : "+datePicker.getDayOfMonth()+"/"+(datePicker.getMonth()+1)+"/"+datePicker.getYear());
        return stringBuilder.toString();
    }
}