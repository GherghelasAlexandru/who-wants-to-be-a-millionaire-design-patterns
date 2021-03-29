public abstract class Level {
    protected String levelName;
    protected int checkPointValue;

    /**
     * Returns the checkpoint value of the level.
     * The checkpoint of a level is the amount of money that the player can secure
     * depending on the question that he is on
     * @return checkpointValue
     */
    public int getCheckPointValue() {
        return checkPointValue;
    }

    public String getLevelName() {
        return levelName;
    }
}
