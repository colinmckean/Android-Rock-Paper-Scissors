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
    public void testCanGetPlayerChoice(){
        Mockito.when(spyPlayer.getChoice()).thenReturn(Choice.ROCK);
        assertEquals("ROCK", spyPlayer.getChoice().toString());
    }
    @Test
    public void testCanGetComputerChoice(){
        Mockito.when(spyComputer.getChoice()).thenReturn(Choice.PAPER);
        assertEquals("PAPER", spyComputer.getChoice().toString());
    }
    @Test
    public void testGetResultsWithPaperVsPaper(){
        Mockito.when(spyComputer.getChoice()).thenReturn(Choice.PAPER);
        Mockito.when(spyPlayer.getChoice()).thenReturn(Choice.PAPER);
        assertEquals("It's a draw.",game.getResults(spyPlayer.getChoice(),spyComputer.getChoice()));
    }
    @Test
    public void testGetResultsWithPaperVsRock(){
        Mockito.when(spyComputer.getChoice()).thenReturn(Choice.PAPER);
        Mockito.when(spyPlayer.getChoice()).thenReturn(Choice.ROCK);
        assertEquals("Computer wins.",game.getResults(spyPlayer.getChoice(),spyComputer.getChoice()));
    }
    @Test
    public void testGetResultsWithPaperVsScissors(){
        Mockito.when(spyComputer.getChoice()).thenReturn(Choice.PAPER);
        Mockito.when(spyPlayer.getChoice()).thenReturn(Choice.SCISSORS);
        assertEquals("Player 1 wins.",game.getResults(spyPlayer.getChoice(),spyComputer.getChoice()));
    }
    @Test
    public void testGetResultsScissorsVsScissors(){
        Mockito.when(spyComputer.getChoice()).thenReturn(Choice.SCISSORS);
        Mockito.when(spyPlayer.getChoice()).thenReturn(Choice.SCISSORS);
        assertEquals("It's a draw.",game.getResults(spyPlayer.getChoice(),spyComputer.getChoice()));
    }
    @Test
    public void testGetResultsScissorsVsRock(){
        Mockito.when(spyComputer.getChoice()).thenReturn(Choice.SCISSORS);
        Mockito.when(spyPlayer.getChoice()).thenReturn(Choice.ROCK);
        assertEquals("Player 1 wins.",game.getResults(spyPlayer.getChoice(),spyComputer.getChoice()));
    }
    @Test
    public void testGetResultsScissorsVsPaper(){
        Mockito.when(spyComputer.getChoice()).thenReturn(Choice.SCISSORS);
        Mockito.when(spyPlayer.getChoice()).thenReturn(Choice.PAPER);
        assertEquals("Computer wins.",game.getResults(spyPlayer.getChoice(),spyComputer.getChoice()));
    }
    @Test
    public void testGetResultsRockVsRock(){
        Mockito.when(spyComputer.getChoice()).thenReturn(Choice.ROCK);
        Mockito.when(spyPlayer.getChoice()).thenReturn(Choice.ROCK);
        assertEquals("It's a draw.",game.getResults(spyPlayer.getChoice(),spyComputer.getChoice()));
    }
    @Test
    public void testGetResultsRockVsPaper(){
        Mockito.when(spyComputer.getChoice()).thenReturn(Choice.ROCK);
        Mockito.when(spyPlayer.getChoice()).thenReturn(Choice.PAPER);
        assertEquals("Player 1 wins.",game.getResults(spyPlayer.getChoice(),spyComputer.getChoice()));
    }
    @Test
    public void testGetResultsRockVsScissors(){
        Mockito.when(spyComputer.getChoice()).thenReturn(Choice.ROCK);
        Mockito.when(spyPlayer.getChoice()).thenReturn(Choice.SCISSORS);
        assertEquals("Computer wins.",game.getResults(spyPlayer.getChoice(),spyComputer.getChoice()));
    }


}
