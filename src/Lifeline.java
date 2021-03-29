public interface Lifeline {

    /**
     * A lifeline can only be used once. After that will not be available again.
     * isUsed = true;
     */
    void useLifeline();

    /**
     * Call the specific method form question when a lifeline has been used
     * @param question
     */
    void lifelineResponse(Question question);

    /**
     * Used if the player tries to use the lifeline fifty fifty again.
     * @return "Lifeline x has already been used renter your answer."
     */
    String message();

    boolean isUsed();

    String getName();

    String toString();

}