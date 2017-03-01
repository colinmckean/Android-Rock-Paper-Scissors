package com.codeclan.example.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class PlayGameActivity extends AppCompatActivity {
    Button rockButton;
    Button paperButton;
    Button scissors;
    Choice choice;
    AI computer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_game);
        rockButton = (Button) findViewById(R.id.rock_Btn);
        paperButton = (Button) findViewById(R.id.paper_Btn);
        scissors = (Button) findViewById(R.id.scissors_Btn);
    }

    public void choiceButtonPressed(View view) {

        switch (view.getId()) {
            case R.id.rock_Btn:
                choice = Choice.ROCK;
                Log.i("Button EVent", "ROCK pressed.");
                break;
            case R.id.paper_Btn:
                choice = Choice.PAPER;
                Log.i("Button Event", "PAPER pressed.");
                break;
            case R.id.scissors_Btn:
                choice = Choice.SCISSORS;
                Log.i("Button Event", "SCISSORS pressed.");
                break;
        }
        Log.i("Choice is..", choice.toString());
    }

}
