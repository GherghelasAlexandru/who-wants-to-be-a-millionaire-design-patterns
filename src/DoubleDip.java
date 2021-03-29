public class DoubleDip implements Lifeline {

    private String value;
    private String name;
    private boolean isUsed;

    public DoubleDip(String name) {
        this.value = "3";
        this.name = name;
        this.isUsed = false;
    }

    public void lifelineResponse(Question question) {
        question.removeOneIncorrectAnswer();
    }

    public void useLifeline() {
        this.isUsed = true;
    }

    @Override
    public String message() {
        return "Lifeline Double dip has already been used renter your answer.";
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return value;
    }

    public boolean isUsed() {
        return isUsed;
    }
}
