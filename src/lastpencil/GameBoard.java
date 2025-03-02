package lastpencil;

import java.util.Objects;
import java.util.Scanner;

public class GameBoard {
    Scanner sc = new Scanner(System.in);

    int howManyPencils;

    public GameBoard() {
        boolean continueAsking = true;
        System.out.println(Display.howManyPencils());
        while (continueAsking) {
            String input = sc.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("The number of pencils should be numeric");
                continue;
            }

            try {
                howManyPencils = Integer.parseInt(input);

                if (howManyPencils <= 0) {
                    System.out.println("The number of pencils should be positive");
                } else {
                    continueAsking = false;
                }

            } catch (NumberFormatException e) {
                System.out.println("The number of pencils should be numeric");
            }
        }

    }

    public void whoWillBeTheFirstPlayer(Player2 player1, Player2 player2) {
        System.out.println(Display.whoWillBeTheFirstPlayer(player1, player2));
        String firstPlayer = sc.nextLine();
        if(Objects.equals(firstPlayer, player1.getName())) {
            player1.setIsMyTurn(true);
            player2.setIsMyTurn(false);
        } else if(Objects.equals(firstPlayer, player2.getName())) {
            player2.setIsMyTurn(true);
            player1.setIsMyTurn(false);
        } else {
            System.out.println("Choose between " + player1.getName() + " and " + player2.getName());
            whoWillBeTheFirstPlayer(player1, player2);
        }
    }

    public Player2 whoIsTurn(Player2 player1, Player2 player2) {
        if(player1.getIsMyTurn()) {
            return player1;
        } else {
            return player2;
        }
    }

    public void setPencils(Player2 currentPlayer) {
        int howManyPencilsNow = howManyPencils - currentPlayer.action(sc);
        if(howManyPencilsNow < 0) {
            System.out.println("Too many pencils were taken");
            setPencils(currentPlayer);
        }
        howManyPencils = howManyPencilsNow;
    }

    public void switchTurn(Player2 player1, Player2 player2) {
        player1.setIsMyTurn(!player1.getIsMyTurn());
        player2.setIsMyTurn(!player2.getIsMyTurn());
    }

    public int getPencils() {
        return howManyPencils;
    }
}
