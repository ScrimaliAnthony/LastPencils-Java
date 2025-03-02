package lastpencil;

import java.util.Scanner;

public class Player2 {

    private final String name;
    private boolean isMyTurn;

    public Player2(String name) {
        this.name = name;
    }

    public int action(Scanner sc) {
        if(sc.hasNextInt()) {
            int action = sc.nextInt();
            sc.nextLine();

            if(action >= 1 && action <= 3) {
                return action;
            } else {
                System.out.println("Possible values: '1', '2' or '3'");
                return action(sc);
            }
        } else {
            System.out.println("Possible values: '1', '2' or '3'");
            sc.nextLine();
            return action(sc);
        }
    }

    public String getName() {
        return name;
    }

    public boolean getIsMyTurn() {
        return isMyTurn;
    }

    public void setIsMyTurn(boolean isMyTurn) {
        this.isMyTurn = isMyTurn;
    }
}
