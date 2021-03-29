public class FiftyFifty implements Lifeline {
    String name;
    String value;
    boolean isUsed;

    public FiftyFifty(String name) {
        this.value = "1";
        this.name = name;
        this.isUsed = false;
    }

    public void lifelineResponse(Question question) {
        question.removeTwoIncorrectAnswers();
    }

    public void useLifeline() {
        this.isUsed = true;
    }

    public boolean isUsed() {
        return isUsed;
    }

    @Override
    public String message() {
        return "Lifeline Fifty fifty has already been used renter your answer.";
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return value;
    }
}
