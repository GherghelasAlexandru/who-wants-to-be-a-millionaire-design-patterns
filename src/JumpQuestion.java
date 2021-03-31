public class JumpQuestion implements Lifeline {
    public String value;
    public String name;
    public boolean isUsed;

    public JumpQuestion(String name) {
        this.value = "2";
        this.name = name;
        this.isUsed = false;
    }

    public void lifelineResponse(Question question) {
        question.removeAllIncorrectAnswers();
    }

    public void useLifeline() {
        this.isUsed = true;
    }

    @Override
    public String message() {
        return "Lifeline Jump the question has already been used renter your answer.";
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

