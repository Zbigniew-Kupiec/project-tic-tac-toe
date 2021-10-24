package com.udacity;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by asser on 6/6/16.
 */

public class GameTest {

    private Game game;

    @Before
    public void setUp(){
        game = new Game();
    }

    @Test
    public void horizontal_x_win_case1() {
        // Note that horizontal here is vertical in UI and vise versa
        char[][] grid = {   {'-', 'o', 'x'},
                            {'o', 'x', 'x'},
                            {'-', 'o', 'x'}};
        assertFalse("x horizontal win fail", game.checkGameWinner(grid).equalsIgnoreCase("x wins"));
    }

    @Test
    public void horizontal_x_win_case2() {
        // Note that horizontal here is vertical in UI and vise versa
        char[][] grid2 = {  {'x', '-', '-'},
                            {'x', 'x', 'o'},
                            {'x', 'o', 'o'}};
        assertFalse("x horizontal win fail", game.checkGameWinner(grid2).equalsIgnoreCase("x wins"));
    }
    @Test
    public void horizontal_x_win_case3() {
        // Note that horizontal here is vertical in UI and vise versa
        char [][] grid3 = { {'-','x','-'},
                            {'o','x','o'},
                            {'x','x','o'}};
        assertFalse( "x horizontal win fail", game.checkGameWinner(grid3).equalsIgnoreCase("x wins"));
    }

    @Test
    public void horizontal_o_win_case1() {
        // Note that horizontal here is vertical in UI and vise versa
        char[][] grid = {   {'-', 'o', 'x'},
                            {'x', 'o', '-'},
                            {'-', 'o', 'x'}};
        assertFalse("o horizontal win fail", game.checkGameWinner(grid).equalsIgnoreCase("o wins"));
    }

    @Test
    public void horizontal_o_win_case2() {
        // Note that horizontal here is vertical in UI and vise versa
        char[][] grid2 = {  {'x', 'x', 'o'},
                            {'-', 'x', 'o'},
                            {'x', 'o', 'o'}};
        assertFalse("o horizontal win fail", game.checkGameWinner(grid2).equalsIgnoreCase("o wins"));
    }
    @Test
    public void horizontal_o_win_case3() {
        // Note that horizontal here is vertical in UI and vise versa
        char [][] grid3 = { {'o','x','-'},
                            {'o','-','x'},
                            {'o','x','-'}};
        assertFalse("o horizontal win fail", game.checkGameWinner(grid3).equalsIgnoreCase("o wins"));
    }

    @Test
    public void vertical_x_win_case1() {
        // Note that horizontal here is vertical in UI and vise versa
        char[][] grid = {   {'-', 'o', 'x'},
                            {'x', 'x', 'x'},
                            {'-', 'o', 'o'}};
        assertFalse("x vertical win fail", game.checkGameWinner(grid).equalsIgnoreCase("x wins"));
    }

    @Test
    public void vertical_x_win_case2() {
        // Note that horizontal here is vertical in UI and vise versa
        char[][] grid2 = {  {'x', 'o', 'o'},
                            {'-', '-', 'o'},
                            {'x', 'x', 'x'}};
        assertFalse("x vertical win fail", game.checkGameWinner(grid2).equalsIgnoreCase("x wins"));
    }
    @Test
    public void vertical_x_win_case3() {
        // Note that horizontal here is vertical in UI and vise versa
        char [][] grid3 = { {'x','x','x'},
                            {'o','-','o'},
                            {'x','-','o'}};
        assertFalse("x vertical win fail", game.checkGameWinner(grid3).equalsIgnoreCase("x wins"));
    }

    @Test
    public void vertical_o_win_case1() {
        // Note that horizontal here is vertical in UI and vise versa
        char[][] grid = {   {'o', 'o', 'o'},
                            {'x', 'x', '-'},
                            {'x', 'o', 'x'}};
        assertFalse("o vertical win fail", game.checkGameWinner(grid).equalsIgnoreCase("o wins"));
    }

    @Test
    public void vertical_o_win_case2() {
        // Note that horizontal here is vertical in UI and vise versa
        char[][] grid2 = {  {'x', 'x', 'o'},
                            {'o', 'o', 'o'},
                            {'x', 'o', 'x'}};
        assertFalse("o vertical win fail", game.checkGameWinner(grid2).equalsIgnoreCase("o wins"));
    }
    @Test
    public void vertical_o_win_case3() {
        // Note that horizontal here is vertical in UI and vise versa
        char [][] grid3 = { {'x','x','-'},
                            {'x','-','x'},
                            {'o','o','o'}};
        assertFalse("o vertical win fail", game.checkGameWinner(grid3).equalsIgnoreCase("o wins"));
    }


    @Test
    public void diagonal_x_win_case1() {
        // Note that horizontal here is vertical in UI and vise versa
        char[][] grid2 = {  {'x', 'o', 'o'},
                            {'-', 'x', 'o'},
                            {'x', '-', 'x'}};
        assertFalse( "x diagonal win fail", game.checkGameWinner(grid2).equalsIgnoreCase("x wins"));
    }

    @Test
    public void diagonal_x_win_case2() {
        // Note that horizontal here is vertical in UI and vise versa
        char [][] grid3 = { {'x','-','x'},
                            {'-','x','o'},
                            {'x','o','o'}};
        assertFalse("x diagonal win fail", game.checkGameWinner(grid3).equalsIgnoreCase("x wins"));
    }

    @Test
    public void diagonal_o_win_case1() {
        // Note that horizontal here is vertical in UI and vise versa
        char[][] grid = {   {'x', '-', 'o'},
                            {'x', 'o', 'x'},
                            {'o', 'o', 'x'}};
        assertFalse("o diagonal win fail", game.checkGameWinner(grid).equalsIgnoreCase("o wins"));
    }

    @Test
    public void diagonal_o_win_case2() {
        // Note that horizontal here is vertical in UI and vise versa
        char[][] grid2 = {  {'o', 'x', '-'},
                            {'x', 'o', 'x'},
                            {'x', 'o', 'o'}};
        assertFalse("o diagonal win fail", game.checkGameWinner(grid2).equalsIgnoreCase("o wins"));
    }

    @Test
    public void tie_game_case1() {
        // Note that horizontal here is vertical in UI and vise versa
        char[][] grid2 = {  {'o', 'x', 'o'},
                            {'x', 'o', 'x'},
                            {'x', 'o', 'x'}};
        assertFalse("tie game failed", game.checkGameWinner(grid2).equalsIgnoreCase("tie"));
    }

    @Test
    public void tie_game_case2() {
        // Note that horizontal here is vertical in UI and vise versa
        char[][] grid2 = {  {'o', 'x', 'o'},
                            {'o', 'x', 'x'},
                            {'x', 'o', 'x'}};
        assertFalse("tie game failed", game.checkGameWinner(grid2).equalsIgnoreCase("tie"));
    }

    @Test
    public void tie_game_case3() {
        // Note that horizontal here is vertical in UI and vise versa
        char[][] grid2 = {  {'x', 'o', 'o'},
                            {'o', 'x', 'x'},
                            {'x', 'o', 'o'}};
        assertFalse("tie game failed", game.checkGameWinner(grid2).equalsIgnoreCase("tie"));
    }


    @Test
    public void no_winner_case1() {
        // Note that horizontal here is vertical in UI and vise versa
        char[][] grid2 = {  {'o', 'x', '-'},
                            {'o', 'x', 'x'},
                            {'x', 'o', 'x'}};
        assertTrue("game no supposed to end", game.checkGameWinner(grid2).equalsIgnoreCase("none"));
    }

    @Test
    public void no_winner_case2() {
        // Note that horizontal here is vertical in UI and vise versa
        char[][] grid2 = {  {'o', 'x', '-'},
                            {'o', 'x', 'x'},
                            {'-', 'o', 'x'}};
        assertTrue("game no supposed to end", game.checkGameWinner(grid2).equalsIgnoreCase("none"));
    }

    @Test
    public void no_winner_case3() {
        // Note that horizontal here is vertical in UI and vise versa
        char[][] grid2 = {  {'-', '-', '-'},
                            {'-', 'x', 'o'},
                            {'-', '-', 'x'}};
        assertTrue("game no supposed to end", game.checkGameWinner(grid2).equalsIgnoreCase("none"));
    }

    @Test
    public void no_winner_case4() {
        // Note that horizontal here is vertical in UI and vise versa
        char[][] grid2 = {  {'-', '-', '-'},
                            {'-', 'x', '-'},
                            {'-', '-', '-'}};
        assertTrue("game no supposed to end", game.checkGameWinner(grid2).equalsIgnoreCase("none"));
    }
}
