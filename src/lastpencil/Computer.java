package lastpencil;

import java.util.Scanner;

public class Computer extends Player {

    private final GameBoard gameBoard;

    public Computer(String name, GameBoard gameBoard) {
        super(name);
        this.gameBoard = gameBoard;
    }

    @Override
    @SuppressWarnings("unused")
    public int action(Scanner sc) {
        int pencilsLeft = gameBoard.getPencils();
        int coup = (pencilsLeft - 1) % 4;
        if (coup == 0) {
            coup = 1;
        }
        System.out.println(coup);
        return coup;
    }

}
