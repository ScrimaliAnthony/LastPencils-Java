package lastpencil;

import java.util.Objects;
import java.util.Scanner;

public class GameBoard {

    private int howManyPencils;

    public GameBoard(Scanner sc) {
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

    public void setPencils(Scanner sc, Player currentPlayer) {
        int howManyPencilsNow = howManyPencils - currentPlayer.action(sc);
        if(howManyPencilsNow < 0) {
            System.out.println("Too many pencils were taken");
            setPencils(sc, currentPlayer);
        }
        howManyPencils = howManyPencilsNow;
    }

    public int getPencils() {
        return howManyPencils;
    }
}
