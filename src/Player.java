public class Player {
    private final String playerName;
    private final int age;

    public Player(String playerName, int age) {
        this.playerName = playerName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getPlayerName() {
        return playerName;
    }
}
