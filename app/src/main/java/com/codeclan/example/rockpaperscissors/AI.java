package com.codeclan.example.rockpaperscissors;

import java.util.Random;

/**
 * Created by user on 01/03/2017.
 */

public class AI {

    public Choice getChoice() {
        Random rand = new Random();
        int choice = rand.nextInt(3);
        return Choice.values()[choice];
    }
}
