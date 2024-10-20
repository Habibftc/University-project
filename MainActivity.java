package com.myapp.countrydemoproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button bangladeshButton, chinaButton, indiabutton, pakistanButton;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bangladeshButton = (Button) findViewById(R.id.bangladeshId);
        chinaButton = (Button) findViewById(R.id.chinaId);
        indiabutton = (Button) findViewById(R.id.indiaId);
        pakistanButton = (Button) findViewById(R.id.pakistanId);

        bangladeshButton.setOnClickListener(this);
        chinaButton.setOnClickListener(this);
        indiabutton.setOnClickListener(this);
        pakistanButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.bangladeshId){
            intent = new Intent(MainActivity.this, profileActivity.class);
            intent.putExtra("name","bangladesh");
            startActivity(intent);
        }
        if (view.getId()==R.id.chinaId){
            intent = new Intent(MainActivity.this, profileActivity.class);
            intent.putExtra("name","china");
            startActivity(intent);
        }
        if (view.getId()==R.id.indiaId){
            intent = new Intent(MainActivity.this, profileActivity.class);
            intent.putExtra("name","india");
            startActivity(intent);
        }
        if (view.getId()==R.id.pakistanId){
            intent = new Intent(MainActivity.this, profileActivity.class);
            intent.putExtra("name","pakistan");
            startActivity(intent);
        }

    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder alertDialogBuilder;
        alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setIcon(R.drawable.question);
        alertDialogBuilder.setTitle(R.string.title);
        alertDialogBuilder.setMessage(R.string.massage);
        alertDialogBuilder.setCancelable(false);
        alertDialogBuilder.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                finish();
            }
        });
        alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}