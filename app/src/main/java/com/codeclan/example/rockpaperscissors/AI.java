package com.codeclan.example.rockpaperscissors;

import java.util.Random;

/**
 * Created by user on 01/03/2017.
 */

public class AI {

    public Choice getChoice() {
        Random rand = new Random();
        int Low = 0;
        int High = 2;
        int choise = rand.nextInt(High-Low) + Low;
        return Choice.values()[choise];
    }
}
