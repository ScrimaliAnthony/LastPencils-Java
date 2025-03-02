package lastpencil;

public class Display {

    private Display() {}

    public static String howManyPencils() {
        return "How many pencils would you like to use:";
    }

    public static String whoWillBeTheFirstPlayer() {
        return "Who will be the first (John, Jack):";
    }

    public static String firstPlayer(Player player) {
        return player.getFirstPlayer();
    }

    public static String getPencils(GameBoard gameBoard) {
        int nbPencils = gameBoard.getPencils();
        String pencil = "|";

        return pencil.repeat(nbPencils);
    }
}
