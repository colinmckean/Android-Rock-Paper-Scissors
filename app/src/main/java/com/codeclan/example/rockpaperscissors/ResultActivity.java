package com.codeclan.example.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView results;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        results = (TextView) findViewById(R.id.game_Rslt_TextView);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String result = extras.getString("result");
      String playerChoice = extras.getString("playerChoice");
        String computerChoice = extras.getString("computerChoice");
        results.append(result);
        results.append(playerChoice);
        results.append(computerChoice);
    }
}
