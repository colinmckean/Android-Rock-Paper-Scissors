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
    Choice playerChoice;
    Game game;


    @Before
    public void before(){
        computer = new AI();
        spyComputer = Mockito.spy(computer);
        game = new Game();
    }

    @Test
    public void computerCanMakeChoice(){
        Mockito.when(spyComputer.getChoice()).thenReturn(Choice.PAPER);
        assertEquals(spyComputer.getChoice(), Choice.PAPER);
    }
    @Test
    public void testCanGetPlayerChoice(){
        playerChoice = Choice.ROCK;
        assertEquals("ROCK", playerChoice.toString());
    }
    @Test
    public void testCanGetComputerChoice(){
        Mockito.when(spyComputer.getChoice()).thenReturn(Choice.PAPER);
        assertEquals("PAPER", spyComputer.getChoice().toString());
    }
    @Test
    public void testGetResultsWithPaperVsPaper(){
        playerChoice = Choice.PAPER;
        Mockito.when(spyComputer.getChoice()).thenReturn(Choice.PAPER);
        assertEquals("It's a draw.",game.getResults(playerChoice,spyComputer.getChoice()));
    }

    @Test
    public void testGetResultsWithPaperVsScissors(){
        playerChoice = Choice.PAPER;
        Mockito.when(spyComputer.getChoice()).thenReturn(Choice.SCISSORS);
        assertEquals("Computer wins.",game.getResults(playerChoice,spyComputer.getChoice()));
    }

    @Test
    public void testGetResultsWithPaperVsRock(){
        playerChoice = Choice.PAPER;
        Mockito.when(spyComputer.getChoice()).thenReturn(Choice.ROCK);
        assertEquals("Player 1 wins.",game.getResults(playerChoice,spyComputer.getChoice()));
    }

    @Test
    public void testGetResultsScissorsVsScissors(){
        playerChoice = Choice.SCISSORS;
        Mockito.when(spyComputer.getChoice()).thenReturn(Choice.SCISSORS);
        assertEquals("It's a draw.",game.getResults(playerChoice,spyComputer.getChoice()));
    }
    @Test
    public void testGetResultsScissorsVsRock(){
        playerChoice = Choice.SCISSORS;
        Mockito.when(spyComputer.getChoice()).thenReturn(Choice.ROCK);
        assertEquals("Computer wins.",game.getResults(playerChoice,spyComputer.getChoice()));
    }
    @Test
    public void testGetResultsScissorsVsPaper(){
        playerChoice = Choice.SCISSORS;
        Mockito.when(spyComputer.getChoice()).thenReturn(Choice.PAPER);
        assertEquals("Player 1 wins.",game.getResults(playerChoice,spyComputer.getChoice()));
    }
    @Test
    public void testGetResultsRockVsRock(){
        playerChoice = Choice.ROCK;
        Mockito.when(spyComputer.getChoice()).thenReturn(Choice.ROCK);
        assertEquals("It's a draw.",game.getResults(playerChoice,spyComputer.getChoice()));
    }
    @Test
    public void testGetResultsRockVsPaper(){
        playerChoice = Choice.ROCK;
        Mockito.when(spyComputer.getChoice()).thenReturn(Choice.PAPER);
        assertEquals("Computer wins.",game.getResults(playerChoice,spyComputer.getChoice()));
    }
    @Test
    public void testGetResultsRockVsScissors(){
        playerChoice = Choice.ROCK;
        Mockito.when(spyComputer.getChoice()).thenReturn(Choice.SCISSORS);
        assertEquals("Player 1 wins.",game.getResults(playerChoice,spyComputer.getChoice()));
    }


}
