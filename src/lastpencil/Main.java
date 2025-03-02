package lastpencil;

public class Main {
    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();

        Player player1 = new Player("John");
        Player player2 = new Player("Jack");

        gameBoard.whoWillBeTheFirstPlayer(player1, player2);

        while(gameBoard.getPencils() > 0) {
            Player currentPlayer = gameBoard.whoIsTurn(player1, player2);

            System.out.println(Display.getPencils(gameBoard));
            System.out.println(Display.whoIsTurn(currentPlayer));
            gameBoard.setPencils(currentPlayer);

            gameBoard.switchTurn(player1, player2);
        }

        System.out.println(Display.whoWin(gameBoard.whoIsTurn(player1, player2)));
    }
}
