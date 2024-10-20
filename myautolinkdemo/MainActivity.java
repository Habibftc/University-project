package com.myapp.myautolinkdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button call,web,map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        call = (Button) findViewById(R.id.callId);
        web = (Button) findViewById(R.id.websiteId);
        map = (Button) findViewById(R.id.mapId);
        call.setOnClickListener(this);
        web.setOnClickListener(this);
        map.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.callId){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:+8801643805670"));
            startActivity(intent);
        } else if (view.getId()==R.id.websiteId) {
            Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=NeSdSY96REM&list=PLgH5QX0i9K3p9xzYLFGdfYliIRBLVDRV5&index=147"));
            startActivity(intent);
        }else if (view.getId()==R.id.mapId){
            Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("geo:22.895445,91.533592"));
            startActivity(intent);
        }
    }
}