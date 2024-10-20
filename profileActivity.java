package com.myapp.countrydemoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class profileActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        imageView = (ImageView) findViewById(R.id.imageViewId);
        textView = (TextView) findViewById(R.id.textViewId);

        Bundle bundle = getIntent().getExtras();
        if (bundle!=null){
            String countryName = bundle.getString("name");
            showDetails(countryName);
        }

    }
    void showDetails(String countryName){
            if (countryName.equals("bangladesh")){
                imageView.setImageResource(R.drawable.bangladesh);
                textView.setText(R.string.about_bangladesh);
            }
            if (countryName.equals("china")){
                imageView.setImageResource(R.drawable.china);
                textView.setText(R.string.about_china);
            }
            if (countryName.equals("india")){
                imageView.setImageResource(R.drawable.india);
                textView.setText(R.string.about_india);
            }
            if (countryName.equals("pakistan")){
                imageView.setImageResource(R.drawable.pakistan);
                textView.setText(R.string.about_pakistan);
            }

    }
}