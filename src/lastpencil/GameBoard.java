package lastpencil;

import java.util.Objects;
import java.util.Scanner;

public class GameBoard {
    Scanner sc = new Scanner(System.in);

    int howManyPencils;

    public GameBoard() {
        boolean continueAsking = true;
        System.out.println(Display.howManyPencils());
        while(continueAsking) {

            if(sc.hasNextInt()) {
                howManyPencils = sc.nextInt();

                if(howManyPencils == 0) {
                    System.out.println("The number of pencils should be positive");
                    continue;
                }

                if(howManyPencils < 0) {
                    System.out.println("The number of pencils should be numeric");
                    continue;
                }

                continueAsking = false;
            } else {
                System.out.println("The number of pencils should be numeric");
            }
        }
    }

    public void whoWillBeTheFirstPlayer(Player2 player1, Player2 player2) {
        System.out.println(Display.whoWillBeTheFirstPlayer());
        String firstPlayer = sc.nextLine();
        if(Objects.equals(firstPlayer, player1.getName())) {
            player1.setIsFirstPlayer(true);
            player2.setIsFirstPlayer(false);
        } else if(Objects.equals(firstPlayer, player2.getName())) {
            player2.setIsFirstPlayer(true);
            player1.setIsFirstPlayer(false);
        } else {
            System.out.println("Choose between " + player1.getName() + " and " + player2.getName());
            whoWillBeTheFirstPlayer(player1, player2);
        }
    }

    public int getPencils() {
        return howManyPencils;
    }

//    public void setPencils(Player player) {
//        int action = -1;
//        boolean continueAsking = true;
//        while(continueAsking) {
//            action = player.action();
//
//            if(howManyPencils - action < 0) {
//                System.out.println("Too many pencils were taken");
//                continue;
//            } else {
//                continueAsking = false;
//            }
//        }
//        howManyPencils = howManyPencils - action;
//    }
}
