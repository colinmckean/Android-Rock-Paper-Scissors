package com.codeclan.example.rockpaperscissors;

import android.content.Intent;
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
    Choice computerChoice;
    AI computer;
    Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_game);
        rockButton = (Button) findViewById(R.id.rock_Btn);
        paperButton = (Button) findViewById(R.id.paper_Btn);
        scissors = (Button) findViewById(R.id.scissors_Btn);
        game = new Game();
        computer = new AI();
    }

    public void choiceButtonPressed(View view) {

        switch (view.getId()) {
            case R.id.rock_Btn:
                choice = Choice.ROCK;
                doTheTing(choice);
                break;
            case R.id.paper_Btn:
                choice = Choice.PAPER;
                doTheTing(choice);
                break;
            case R.id.scissors_Btn:
                choice = Choice.SCISSORS;
                doTheTing(choice);
                break;
        }
    }
    public void doTheTing(Choice playerChoice){
  Choice computerChoice = computer.getChoice();
        String result = game.getResults(playerChoice, computerChoice);
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", result);
        intent.putExtra("playerChoice", playerChoice.toString());
        intent.putExtra("ComputerChoice", computerChoice.toString());
        startActivity(intent);

    }

}
