package com.codeclan.example.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 01/03/2017.
 */

public class RockPaperScissorsTest {
    AI computer;
    AI spyComputer;

    @Before
    public void before(){
        computer = new AI();
        spyComputer = Mockito.spy(computer);

    }
    @Test
    public void computerCanMakeChoice(){
        Mockito.when(spyComputer.getChoice()).thenReturn(Choice.PAPER);
        assertEquals(spyComputer.getChoice(), Choice.PAPER);
    }
}
