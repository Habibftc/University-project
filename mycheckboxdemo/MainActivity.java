package com.myapp.mycheckboxdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CheckBox ansText,ansText2,ansText3;
    private Button showText;
    private TextView resutlTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ansText =(CheckBox) findViewById(R.id.ansTextId);
        ansText2 = (CheckBox) findViewById(R.id.ansText2Id);
        ansText3 = (CheckBox) findViewById(R.id.ansText3Id);
        showText = (Button) findViewById(R.id.showButtonId);
        resutlTextview=(TextView) findViewById(R.id.resultTextViewId);

        showText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder stringBuilder = new StringBuilder();
                if(ansText.isChecked()){
                    String value = ansText.getText().toString();
                    stringBuilder.append(value+" is ordered "+"\n");
                }
                if(ansText2.isChecked()){
                    String value = ansText2.getText().toString();
                    stringBuilder.append(value+" is ordered "+"\n");
                }
                if(ansText3.isChecked()){
                    String value = ansText3.getText().toString();
                    stringBuilder.append(value+" is ordered "+"\n");
                }
                resutlTextview.setText(stringBuilder);

            }
        });
    }
}