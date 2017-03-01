package com.codeclan.example.rockpaperscissors;

/**
 * Created by user on 01/03/2017.
 */
public class Game {
    public String getResults(Choice playerChoice, Choice aiChoice) {
        if (aiChoice.equals(playerChoice)) {
            return "It's a draw.";
        }else if((playerChoice.equals(Choice.ROCK) && aiChoice.equals(Choice.SCISSORS)) ||
                ((playerChoice.equals(Choice.SCISSORS) && aiChoice.equals(Choice.PAPER)) ||
                        (playerChoice.equals(Choice.PAPER)) && aiChoice.equals(Choice.ROCK))){
            return "Player 1 wins.";
        }else{
            return "Computer wins.";
        }
    }

//
//    (@player_1 == "rock" && @player_2 == "scissors") ||
// (@player_1 == "scissors" && @player_2 == "paper") ||
// (@player_1 == "paper" && @player_2 == "rock")
//            "Player 1 wins with #{@player_1}"
}
