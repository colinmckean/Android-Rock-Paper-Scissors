package com.codeclan.example.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {
    Button playGameBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        playGameBtn = (Button) findViewById(R.id.play_game_Btn);

    }
    public void onClickToGoToGameActivity(View view){
        Intent intent = new Intent(this, PlayGameActivity.class);
        startActivity(intent);
    }
}
