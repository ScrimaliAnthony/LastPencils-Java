package lastpencil;

import java.util.Objects;
import java.util.Scanner;

public class Game {

    private Game() {}

    public static void whoWillBeTheFirstPlayer(Scanner sc, Player player1, Player player2) {
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
            whoWillBeTheFirstPlayer(sc, player1, player2);
        }
    }

    public static Player whoIsTurn(Player player1, Player player2) {
        if(player1.getIsMyTurn()) {
            return player1;
        } else {
            return player2;
        }
    }

    public static void switchTurn(Player player1, Player player2) {
        player1.setIsMyTurn(!player1.getIsMyTurn());
        player2.setIsMyTurn(!player2.getIsMyTurn());
    }
}
