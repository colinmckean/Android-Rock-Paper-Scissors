package com.codeclan.example.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView results;
    TextView playerChoiceTextView;
    TextView computerChoiceTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        results = (TextView) findViewById(R.id.game_Rslt_TextView);
        playerChoiceTextView = (TextView) findViewById(R.id.player_choice_TextView);
        computerChoiceTextView = (TextView) findViewById(R.id.computer_choice_TextView);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String result = extras.getString("result");
        String playerChoice = extras.getString("playerChoice");
        String computerChoice = extras.getString("computerChoice");
        results.append(result);
        playerChoiceTextView.append(playerChoice);
        computerChoiceTextView.append(computerChoice);
    }
}
