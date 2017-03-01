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
    Player player;
    Player spyPlayer;
    Game game;

    @Before
    public void before(){
        computer = new AI();
        spyComputer = Mockito.spy(computer);
        game = new Game();
        player = new Player();
        spyPlayer = Mockito.spy(player);

    }
    @Test
    public void computerCanMakeChoice(){
        Mockito.when(spyComputer.getChoice()).thenReturn(Choice.PAPER);
        assertEquals(spyComputer.getChoice(), Choice.PAPER);
    }
    @Test
    public void testGetResultsWithPaper(){
        Mockito.when(spyComputer.getChoice()).thenReturn(Choice.PAPER);
        Mockito.when(spyPlayer.getChoice()).thenReturn(Choice.ROCK);
        assertEquals("Computer wins.",game.getResults(spyPlayer.getChoice(),spyComputer.getChoice()));
    }

    @Test
    public void testGetResultsRock(){
        Mockito.when(spyComputer.getChoice()).thenReturn(Choice.ROCK);
        Mockito.when(spyPlayer.getChoice()).thenReturn(Choice.ROCK);
        assertEquals("It's a draw.",game.getResults(spyPlayer.getChoice(),spyComputer.getChoice()));
    }
    @Test
    public void testGetResultsScissors(){
        Mockito.when(spyComputer.getChoice()).thenReturn(Choice.SCISSORS);
        Mockito.when(spyPlayer.getChoice()).thenReturn(Choice.ROCK);
        assertEquals("Player 1 wins.",game.getResults(spyPlayer.getChoice(),spyComputer.getChoice()));
    }
}
