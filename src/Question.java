import java.util.LinkedHashSet;

public class Question {
    public String question;
    public LinkedHashSet<Answer> questionAnswers;
    public String correctAnswer;
    private final int questionValue;
    private final Level level;

    public Question(String question, String correctAnswer, int questionValue, Level level) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.questionAnswers = new LinkedHashSet<>();
        this.level = level;
        this.questionValue = questionValue;
    }

    public Level getLevel() {
        return level;
    }

    public int getQuestionValue() {
        return questionValue;
    }

    public String getQuestion() {
        return question;
    }

    public LinkedHashSet<Answer> getQuestionAnswers() {
        return questionAnswers;
    }

    public void addAnswer(Answer QuestionAnswers) {
        this.questionAnswers.add(QuestionAnswers);
    }

    public String getCorrectAnswer(Question question) {
        return correctAnswer;
    }

    /**
     * Method used for the FiftyFifty lifeline.
     * Removes two incorrect answer from the linked hash set .
     */
    public void removeTwoIncorrectAnswers() {
        questionAnswers.removeIf(answer -> !answer.isCorrect && questionAnswers.size() > 2);
    }

    /**
     * Method used for the DoubleDip lifeline.
     * Removes one incorrect answer from the linked hash set.
     */
    public void removeOneIncorrectAnswer() {
        questionAnswers.removeIf(answer -> !answer.isCorrect && questionAnswers.size() > 3);
    }

    /**
     * Method used for the Jump Question lifeline
     * Removes all the incorrect answers from the linked hash set
     */
    public void removeAllIncorrectAnswers() {
        questionAnswers.removeIf(answer -> !answer.isCorrect);
    }

    /**
     * This method returns the answers using a string builder.
     * @return answers
     */
    public String showAnswers() {
        String answers = "";
        for (Answer i : questionAnswers) {
            answers += i.getAnswers();
        }
        return answers;
    }

    @Override
    public String toString() {
        return question;
    }
}
