package lastpencil;

public class Display {

    private Display() {}

    public static String howManyPencils() {
        return "How many pencils would you like to use:";
    }

    public static String whoWillBeTheFirstPlayer(Player2 player1, Player2 player2) {
        return "Who will be the first (" + player1.getName() + ", " + player2.getName() + "):";
    }

    public static String firstPlayer(Player2 player) {
        return player.getName();
    }

    public static String whoIsTurn(Player2 player) {
        return player.getName() +"'s turn!";
    }

    public static String getPencils(GameBoard gameBoard) {
        int nbPencils = gameBoard.getPencils();
        String pencil = "|";

        return pencil.repeat(nbPencils);
    }

    public static String whoWin(Player2 currentPlayer) {
        return currentPlayer.getName() + " won!";
    }
}
