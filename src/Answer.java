public class Answer {
    public String answers;
    public boolean isCorrect;

    public Answer(String answers,boolean isCorrect) {
        this.answers = answers;
        this.isCorrect = isCorrect;
    }

    @Override
    public String toString() {
        return answers ;
    }

    public String getAnswers() {
        return answers;
    }


}
