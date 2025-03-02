package lastpencil;

public class Player2 {

    private final String name;
    private boolean isFirstPlayer;

    public Player2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setIsFirstPlayer(boolean isFirstPlayer) {
        this.isFirstPlayer = isFirstPlayer;
    }
}
