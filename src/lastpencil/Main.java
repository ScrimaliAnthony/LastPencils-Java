package lastpencil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GameBoard gameBoard = new GameBoard(sc);

        Player player1 = new Player("John");
        Computer player2 = new Computer("Jack", gameBoard);

        Game.whoWillBeTheFirstPlayer(sc, player1, player2);

        while(gameBoard.getPencils() > 0) {
            Player currentPlayer = Game.whoIsTurn(player1, player2);

            System.out.println(Display.getPencils(gameBoard));
            System.out.println(Display.whoIsTurn(currentPlayer));
            gameBoard.setPencils(sc, currentPlayer);

            Game.switchTurn(player1, player2);
        }

        System.out.println(Display.whoWin(Game.whoIsTurn(player1, player2)));
        sc.close();
    }
}
