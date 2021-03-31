import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Game {

    Player player;
    public final Scanner playerInput;
    public LinkedHashSet<Question> questions;
    public ArrayList<Lifeline> lifelines;

    public Game(Player player) {
        this.player = player;
        this.questions = new LinkedHashSet<>();
        this.lifelines = new ArrayList<>();
        this.playerInput = new Scanner(System.in);
    }

    /**
     * Method used to add the questions to the LinkedHashSet
     * @param questions
     */
    public void addQuestion(Question questions) {
        this.questions.add(questions);
    }

    /**
     * Method used to add the lifelines to the array
     * @param lifelines
     */
    public void addLifeline(Lifeline lifelines) {
        this.lifelines.add(lifelines);
    }

    /**
     * Method used to get the player input using scanner
     * @return playerInput
     */
    public Scanner getPlayerInput() {
        return playerInput;
    }

    /**
     * This method returns the lifelines using a string builder.
     * @return lifelines
     */
    public String showLifeline() {
        StringBuilder lifeline = new StringBuilder();
        for (Lifeline i : lifelines) {
            if (!i.isUsed()) {
                lifeline.append(i.getName());
            }
        }
        return lifeline.toString();
    }

    public void pay(PaymentStrategy paymentMethod, int amount)
    {
        paymentMethod.pay(amount);
    }

    public void ShowMessage() {
        System.out.println("Would you prefer bank transfer or check?");
        System.out.println("a. Bank transfer");
        System.out.println("b. Check");
    }
}
