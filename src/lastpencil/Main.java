package lastpencil;

public class Main {
    public static void main(String[] args) {
//        int numberTurn = 1;
//
//        GameBoard gameBoard = new GameBoard();
//        Player player = new Player();
//        player.whoWillBeTheFirstPlayer();
//
//        while(gameBoard.getPencils() > 0) {
//            System.out.println(Display.getPencils(gameBoard));
//            System.out.println(player.whoIsTurn(numberTurn) + "'s turn:");
//            gameBoard.setPencils(player);
//            numberTurn += 1;
//        }

        GameBoard gameBoard = new GameBoard();

        Player2 player1 = new Player2("John");
        Player2 player2 = new Player2("Jack");

        gameBoard.whoWillBeTheFirstPlayer(player1, player2);

    }
}
