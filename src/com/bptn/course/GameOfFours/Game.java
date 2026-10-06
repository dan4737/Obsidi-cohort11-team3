package com.bptn.course.GameOfFours;

import java.util.Scanner;

public class Game {

    private Player[] players;
    private Board board;
    private static Scanner scanner = new Scanner(System.in);

    public Game() {
        // Let's default it two players for now. Later, you can improve upon this to allow the game creator to choose how many players are involved.
        this.players = new Player[2];
        this.board = new Board();
    }

    public void setUpGame() {
        System.out.println("Enter player 1's name: ");
        String playerOneName = scanner.nextLine().trim();
        System.out.println("Enter player 2's name: ");
        String playerTwoName = scanner.nextLine().trim();


        while (playerOneName.equalsIgnoreCase(playerTwoName)) {
            System.out.println("Choose a different name: ");
            playerOneName = scanner.nextLine().trim();
        }

        players[0] = new Player(playerOneName, "1");
        players[1] = new Player(playerTwoName, "2");


        board.boardSetUp();
        board.printBoard();

    }

    public void printWinner(Player player) {
        System.out.println(player.getName() + " is the winner");
    }

    public void playerTurn(Player currentPlayer) {
        int col = currentPlayer.makeMove(board);
        while (!board.addToken(col, currentPlayer.getPlayerNumber())) {
            // call board method to add token.
            board.addToken(col, currentPlayer.getPlayerNumber());
        }
        board.printBoard();
    }

    public void play() {
        boolean noWinner = true;
        this.setUpGame();
        int currentPlayerIndex = 0;

        while (noWinner) {
            if (board.boardFull()) {
            System.out.println("Board is now full. Game Ends.");
            return;
        }

        Player currentPlayer = players[currentPlayerIndex];
        // Override default tostring for Player class
        System.out.println("It is player " + currentPlayer.getPlayerNumber() + "'s turn. " + currentPlayer);
        playerTurn(currentPlayer);
        if (board.checkIfPlayerIsTheWinner(currentPlayer.getPlayerNumber())) {
            printWinner(currentPlayer);
            noWinner = false;
        } else {
            currentPlayerIndex = (currentPlayerIndex + 1) % players.length; // reassign the variable to allow the game to continue. Note the index would wrap back to the first player if we are at the end. Think of using modulus (%).
        }
    }
}

}


