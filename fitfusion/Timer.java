package com.myapp.fitfusion;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Timer extends AppCompatActivity {

    // Declaring all variables.
    private Button Back, Start, Reset;
    private int userMilliseconds;
    private String userInput;
    private TextView timerView;
    private EditText timerInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);

        // Assign variables to XML ID's
        Back = (Button)findViewById(R.id.backButton);
        Start = (Button)findViewById(R.id.timerStart);
        Reset = (Button)findViewById(R.id.timerReset);
        timerView = (TextView)findViewById(R.id.timerView);
        timerInput = (EditText)findViewById(R.id.timerInput);

        // Setting onClickListener to start the timer.
        Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userInput = timerInput.getText().toString();
                userMilliseconds = 1000 * (Integer.parseInt(userInput));
                CountDownTimer myTimer = new CountDownTimer(userMilliseconds, 1000){
                    public void onTick(long millisUntilFinished){
                        timerView.setText("" + millisUntilFinished/1000 );
                    }
                    @Override
                    public void onFinish() {
                        timerView.setText("TIMES UP");
                    }
                }.start();
            }
        });

        // Setting onClickListener for the reset button so it resets the timer.
        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //just refreshing the activity
                finish();
                overridePendingTransition(0, 0);
                startActivity(getIntent());
            }
        });

        // Setting onClickListener for the Back button so it goes back to the home page.
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent basically used to go from one activity to another
                //source and destination parameters, .this for source and .class for destination
                Intent backIntent = new Intent(Timer.this, SecondActivity.class);
                startActivity(backIntent);
            }
        });

    }
}