package com.myapp.mybuttondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int count = 0;
    private Button loginbutton, logoutbutton;

    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginbutton = (Button) findViewById(R.id.loginButton);
        logoutbutton = (Button) findViewById(R.id.logoutButton);
        textView = (TextView) findViewById(R.id.textView);

    }
    public void showMassage(View v){
        if (v.getId()==R.id.loginButton){
            Toast.makeText(MainActivity.this,"Login button is clicked!",Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(MainActivity.this,"Logout button is clicked!",Toast.LENGTH_SHORT).show();
        }
    }
}
