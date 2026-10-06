// From the previous exercise. Feel free to post yours in here, if you like.
package com.bptn.course.GameOfFours;

import com.bptn.course.GameOfFours.Exceptions.ColumnFullException;
import com.bptn.course.GameOfFours.Exceptions.InvalidMoveException;

import java.util.Scanner;

/**
 The player class is concerned with descibing a player and things that relate to it. It keeps track of the name of a player, the order of the player in relation to other players in the game, and the move the player may want to make (which is just as simple as the user picking which column of the board they want their token to be dropped in). This class could also have logic to create only valid users. E.g. the playerNumber should not be greater than 4 based on the specification we've received.
 */
public class Player {

    private String name;
    private String playerNumber;
// Add other instance variable(s)

    // Question: should scanner be static or not?
    private static Scanner scanner = new Scanner(System.in); // complete line

    public Player(String name, String playerNumber) {
        // complete constructor
        this.name = name;
        this.playerNumber = playerNumber;
    }

// create getter methods

    public int makeMove(Board board) {
        // keep asking until the player picks a column a token can go in
        while (true) {
            try {
                System.out.println("Make your move. What column do you want to put a token in?");
                int column = scanner.nextInt();// receive user input

                if (column < 0 || column >= board.getColumns()) {
                    throw new InvalidMoveException("Invalid move: column " + column
                            + " is not on the board. Pick a column from 0 to " + (board.getColumns() - 1) + ".");
                }
                if (board.columnFull(column)) {
                    throw new ColumnFullException("Column " + column + " is full. Pick another column.");
                }
                return column;
            } catch (InvalidMoveException | ColumnFullException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(String playerNumber) {
        this.playerNumber = playerNumber;
    }

    public String toString() {
        return ("Player " + playerNumber + " is " + name);
    }
}