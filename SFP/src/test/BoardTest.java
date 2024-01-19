package test;

import game.Board;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class BoardTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void testBoardHasNineSpots() {
        Board board = new Board();
        board.initialiseBoard();
        assertEquals(9, board.spots.size());
    }

    @Test
    public void testBoardReturnsFirstRow() {
        Board board = new Board();
        List<String> rowOne = new ArrayList<>();
        rowOne.add("0");
        rowOne.add("1");
        rowOne.add("2");
        board.initialiseBoard();
        assertEquals(rowOne, board.firstRow());
    }

    @Test
    public void testBoardReturnsSecondRow() {
        Board board = new Board();
        List<String> rowTwo = new ArrayList<>();
        rowTwo.add("3");
        rowTwo.add("4");
        rowTwo.add("5");
        board.initialiseBoard();
        assertEquals(rowTwo, board.secondRow());
    }

    @Test
    public void testBoardReturnsThirdRow() {
        Board board = new Board();
        List<String> rowThree = new ArrayList<>();
        rowThree.add("6");
        rowThree.add("7");
        rowThree.add("8");
        board.initialiseBoard();
        assertEquals(rowThree, board.thirdRow());
    }

    @Test
    public void testPrintsBoardToConsole() {
        Board board = new Board();
        System.setOut(new PrintStream(outContent));
        board.initialiseBoard();
        board.display();
        assertEquals("0 | 1 | 2\n3 | 4 | 5\n6 | 7 | 8", outContent.toString());
    }
}
