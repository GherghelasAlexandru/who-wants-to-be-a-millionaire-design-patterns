
public class Main {
    public static void main(String[] args) {

        Player player = new Player("Alex", 24);
        Game game = new Game(player);

        FiftyFifty fiftyFifty = new FiftyFifty("\n1.FiftyFifty   ");
        JumpQuestion jumpQuestion = new JumpQuestion("2.JumpQuestion   ");
        DoubleDip doubleDip = new DoubleDip("3.DoubleDip   ");

        game.addLifeline(fiftyFifty);
        game.addLifeline(jumpQuestion);
        game.addLifeline(doubleDip);

        Low low = new Low();
        Easy easy = new Easy();
        Medium medium = new Medium();
        Hard hard = new Hard();

        Context context = new Context();
        ChoosingState choosingState = new ChoosingState();
        PlayingState playingState = new PlayingState();
        GameOverState gameOverState = new GameOverState();

        PaymentStrategy creditCardStrategy = new CreditCardStrategy("Alex", "12345678", "121", "12/12/2023");
        PaymentStrategy checkStrategy = new CheckStrategy("Alex", "12/12/2023");

        Question question1 = new Question("1) Which one of the following is not a fundamental design pattern group?", "d", 100, low);

        Answer answer1 = new Answer("\n a. Creational Patterns", false);
        Answer answer2 = new Answer("\n b. Structural Patterns", false);
        Answer answer3 = new Answer("\n c. Behavioral Patterns", false);
        Answer answer4 = new Answer("\n d. Functional Patterns", true);

        Question question2 = new Question("2) Which pattern defines the skeleton of an algorithm in an operation, deferring some steps to subclasses. It lets subclasses redefine certain steps of an algorithm without changing the algorithm structure.", "b", 200, low);

        Answer answer5 = new Answer("\n a. Chain on responsibility", false);
        Answer answer6 = new Answer("\n b. Template method", true);
        Answer answer7 = new Answer("\n c. Adapter", false);
        Answer answer8 = new Answer("\n d. Prototype", false);

        Question question3 = new Question("3) Which design pattern provides a single class which provides simplified methods required by client and delagates call to those methods?", "c", 300, low);

        Answer answer9 = new Answer("\n a. Adapter pattern", false);
        Answer answer10 = new Answer("\n b. Builder pattern", false);
        Answer answer11 = new Answer("\n c. Facade pattern", true);
        Answer answer12 = new Answer("\n d. Prototype pattern", false);

        Question question4 = new Question("4) In which of the following pattern, a visitor class is used which changes the executing algorithm of an element class?", "a", 500, low);

        Answer answer13 = new Answer("\n a. Visitor Pattern", true);
        Answer answer14 = new Answer("\n b. MVC Pattern", false);
        Answer answer15 = new Answer("\n c. Business Delegate Pattern", false);
        Answer answer16 = new Answer("\n d. Composite Entity Pattern", false);

        Question question5 = new Question("5) Which design pattern attaches additional responsibilities to an object dynamically and it provides a flexible alternative to subclassing for extending functionality.", "c", 1000, easy);

        Answer answer17 = new Answer("\n a. Chain of responsibility", false);
        Answer answer18 = new Answer("\n b. Adapter", false);
        Answer answer19 = new Answer("\n c. Decorator", true);
        Answer answer20 = new Answer("\n d.  Composite", false);

        Question question6 = new Question("6) Which design pattern suggest multiple classes through which request is passed and multiple but only relevant classes carry out operations on the request?", "b", 2000, easy);

        Answer answer21 = new Answer("\n a. Singleton pattern", false);
        Answer answer22 = new Answer("\n b. Chain of responsibility pattern", true);
        Answer answer23 = new Answer("\n c. State pattern", false);
        Answer answer24 = new Answer("\n d. Bridge pattern", false);

        Question question7 = new Question("7) Which design pattern defines one to many dependency between objects so that when one object change state, all its dependent are notified and updated automatically?", "d", 4000, easy);

        Answer answer25 = new Answer("\n a. Chain of responsibility", false);
        Answer answer26 = new Answer("\n b. Event Notification", false);
        Answer answer27 = new Answer("\n c. Mediator", false);
        Answer answer28 = new Answer("\n d. Observer", true);

        Question question8 = new Question("8) Which design pattern defines an interface for creating an object, but let the subclasses decide which class to instantiate?", "a", 8000, easy);

        Answer answer29 = new Answer("\n a. Factory Method", true);
        Answer answer30 = new Answer("\n b. Abstract Factory", false);
        Answer answer31 = new Answer("\n c. Builder", false);
        Answer answer32 = new Answer("\n d. Prototype", false);

        Question question9 = new Question("9) Which design pattern defines a family of algorithms, encapsulate each one, and make them interchangeable? It lets the algorithm vary independently from clients that use it.", "c", 16000, easy);

        Answer answer33 = new Answer("\n a. Template method", false);
        Answer answer34 = new Answer("\n b. Decorator", false);
        Answer answer35 = new Answer("\n c. Strategy", true);
        Answer answer36 = new Answer("\n d. Visitor", false);

        Question question10 = new Question("10) Which design pattern encapsulate a request as an object, there by letting you parametrize clients with different requests, queue or log requests, and support undoable operation?", "b", 32000, medium);

        Answer answer37 = new Answer("\n a. Adapter", false);
        Answer answer38 = new Answer("\n b. Command", true);
        Answer answer39 = new Answer("\n c. Decorator", false);
        Answer answer40 = new Answer("\n d. Composite", false);

        Question question11 = new Question("11) Which of the following describes the Facade pattern correctly?", "c", 64000, medium);

        Answer answer41 = new Answer("\n a. This pattern allows a user to add new functionality to an existing object without altering its structure", false);
        Answer answer42 = new Answer("\n b. This pattern is used where we need to treat a group of objects in similar way as a single object", false);
        Answer answer43 = new Answer("\n c. This pattern hides the complexities of the system and provides an interface to the client using which the client can access the system", true);
        Answer answer44 = new Answer("\n d. This pattern is primarily used to reduce the number of objects created and to decrease memory footprint and increase performance", false);

        Question question12 = new Question("12) Which of the following describes the Structural pattern correctly?", "a", 125000, medium);

        Answer answer45 = new Answer("\n a. This type of patterns concern class and object composition. Concept of inheritance is used to compose interfaces and define ways to compose objects to obtain new functionalities.", true);
        Answer answer46 = new Answer("\n b. This type of patterns provide a way to create objects while hiding the creation logic, rather than instantiating objects directly using new operator.", false);
        Answer answer47 = new Answer("\n c. This type of pattern are specifically concerned with communication between objects.", false);
        Answer answer48 = new Answer("\n d. This type of pattern are specifically concerned with the presentation tier.", false);

        Question question13 = new Question("13) Which of the following describes the Prototype pattern correctly?", "d", 250000, medium);

        Answer answer49 = new Answer("\n a. This pattern builds a complex object using simple objects and using a step by step approach.", false);
        Answer answer50 = new Answer("\n b. This pattern works as a bridge between two incompatible interfaces. ", false);
        Answer answer51 = new Answer("\n c. This pattern is used when we need to decouple an abstraction from its implementation so that the two can vary independently.", false);
        Answer answer52 = new Answer("\n d. This pattern refers to creating duplicate object while keeping performance in mind.", true);

        Question question14 = new Question("14) In MVC pattern, View represents the visualization of the data that model contains.", "b", 500000, medium);

        Answer answer53 = new Answer("\n a. True", false);
        Answer answer54 = new Answer("\n b. False", true);
        Answer answer55 = new Answer("\n c. MVC is not even a pattern", false);
        Answer answer56 = new Answer("\n d. Who's making these questions?", false);

        Question question15 = new Question("15) What is Gang of Four (GOF)?", "a", 1000000, hard);

        Answer answer57 = new Answer("\n a. Four authors of Book 'Design Patterns - Elements of Reusable Object-Oriented Software' are known as Gang of Four (GOF).", true);
        Answer answer58 = new Answer("\n b. Gang of Four (GOF) is a name of a book on Design Patterns.", false);
        Answer answer59 = new Answer("\n c. Gang of Four (GOF) is a Design Pattern.", false);
        Answer answer60 = new Answer("\n d. None of the above.", false);

        question1.addAnswer(answer1);
        question1.addAnswer(answer2);
        question1.addAnswer(answer3);
        question1.addAnswer(answer4);

        question2.addAnswer(answer5);
        question2.addAnswer(answer6);
        question2.addAnswer(answer7);
        question2.addAnswer(answer8);

        question3.addAnswer(answer9);
        question3.addAnswer(answer10);
        question3.addAnswer(answer11);
        question3.addAnswer(answer12);

        question4.addAnswer(answer13);
        question4.addAnswer(answer14);
        question4.addAnswer(answer15);
        question4.addAnswer(answer16);

        question5.addAnswer(answer17);
        question5.addAnswer(answer18);
        question5.addAnswer(answer19);
        question5.addAnswer(answer20);

        question6.addAnswer(answer21);
        question6.addAnswer(answer22);
        question6.addAnswer(answer23);
        question6.addAnswer(answer24);

        question7.addAnswer(answer25);
        question7.addAnswer(answer26);
        question7.addAnswer(answer27);
        question7.addAnswer(answer28);

        question8.addAnswer(answer29);
        question8.addAnswer(answer30);
        question8.addAnswer(answer31);
        question8.addAnswer(answer32);

        question9.addAnswer(answer33);
        question9.addAnswer(answer34);
        question9.addAnswer(answer35);
        question9.addAnswer(answer36);

        question10.addAnswer(answer37);
        question10.addAnswer(answer38);
        question10.addAnswer(answer39);
        question10.addAnswer(answer40);

        question11.addAnswer(answer41);
        question11.addAnswer(answer42);
        question11.addAnswer(answer43);
        question11.addAnswer(answer44);

        question12.addAnswer(answer45);
        question12.addAnswer(answer46);
        question12.addAnswer(answer47);
        question12.addAnswer(answer48);

        question13.addAnswer(answer49);
        question13.addAnswer(answer50);
        question13.addAnswer(answer51);
        question13.addAnswer(answer52);

        question14.addAnswer(answer53);
        question14.addAnswer(answer54);
        question14.addAnswer(answer55);
        question14.addAnswer(answer56);

        question15.addAnswer(answer57);
        question15.addAnswer(answer58);
        question15.addAnswer(answer59);
        question15.addAnswer(answer60);

        game.addQuestion(question1);
        game.addQuestion(question2);
        game.addQuestion(question3);
        game.addQuestion(question4);
        game.addQuestion(question5);
        game.addQuestion(question6);
        game.addQuestion(question7);
        game.addQuestion(question8);
        game.addQuestion(question9);
        game.addQuestion(question10);
        game.addQuestion(question11);
        game.addQuestion(question12);
        game.addQuestion(question13);
        game.addQuestion(question14);
        game.addQuestion(question15);

        System.out.println("***************************************************************");
        System.out.println("**** Welcome to Who wants to be a millionaire!!            ****");
        System.out.println("**** Instructions:                                         ****");
        System.out.println("**** Respond with a, b, c or d for the question            ****");
        System.out.println("**** Respond with 1, 2 or 3 if you want to use a Lifeline  ****");
        System.out.println("**** Let's start with the first question!                  ****");
        System.out.println("***************************************************************");
        int playerStreak = 0; // used to save the player strike
        int attempts;

        choosingState.doAction(context);
        System.out.println("Are you ready to win one million dollars??? (y/n)");
        String playerChoice = game.getPlayerInput().nextLine();
        if(playerChoice.equals("y") ) {

            playingState.doAction(context);

            for (Question i : game.questions) {
                System.out.println(i.getQuestion() + " " + i.getQuestionValue() + "$");
                System.out.println(i.showAnswers());
                System.out.println(game.showLifeline());

                String playerInput = game.getPlayerInput().nextLine(); //user input

                for (Lifeline j : game.lifelines) {
                    //check if the player input is 1 2 or 3 representing a lifeline and check is the lifeline its used
                    if ((playerInput.equals(j.toString()) && !j.isUsed())) {
                        j.useLifeline();
                        System.out.println(game.showLifeline());
                        j.lifelineResponse(i);
                        System.out.println(i.showAnswers());
                        playerInput = game.getPlayerInput().nextLine();
                    }
                    //if the player input is still 1 2 or 3 but he already used the specific lifeline
                    // he gets 3 more attempts to enter a valid answer
                    for (attempts = 2; attempts > 0; attempts--) {
                        if (playerInput.equals(j.toString()) && j.isUsed()) {

                            System.out.println(j.message());
                            System.out.println("You have " + attempts + " attempts to enter a valid answer");
                            playerInput = game.getPlayerInput().nextLine();
                        }
                    }
                }
                //If the player input is the correct answer for the question, increment playerStrike
                if (playerInput.equals(i.getCorrectAnswer(i))) {
                    playerStreak++;
                    //Secure the money from checkpoint 5 for 10
                    if (playerStreak == 5 || playerStreak == 10) {
                        System.out.println("Congrats you've secured a " + i.getLevel().getCheckPointValue() + "$");
                    }
                    //basically you won
                    if (playerStreak == 15) {
                        System.out.println("Congratulations " + player.getPlayerName() + " you are a millionaire!");
                        game.ShowMessage();
                        playerInput = game.getPlayerInput().nextLine();
                        if(playerInput.equals("a"))
                        {
                            game.pay(creditCardStrategy, i.getQuestionValue());
                        }
                        else {
                            game.pay(checkStrategy, i.getQuestionValue());
                        }
                        game.getPlayerInput().close();
                        gameOverState.doAction(context);
                    }
                } else {
                    if (!playerInput.equals(i.getCorrectAnswer(i))) {
                        //If the player input is not the correct answer and value of the level is 0 means that he didnt
                        //reach any checkpoint yet thus he lost everything
                        if (i.getLevel().getCheckPointValue() == 0) {
                            System.out.println("Unfortunately you lost everything..");
                            gameOverState.doAction(context);
                            game.getPlayerInput().close();
                        } else {
                            //Until here if he reached a checkpoint he got to keep it and has the option to choose the payment method
                            System.out.println("You lost! but you get to keep what you secured " + i.getLevel().getCheckPointValue() + "$");
                            game.ShowMessage();
                            playerInput = game.getPlayerInput().nextLine();
                            if(playerInput.equals("a"))
                            {
                                game.pay(creditCardStrategy, i.getQuestionValue());
                            }
                            else {
                                game.pay(checkStrategy, i.getQuestionValue());
                            }
                            game.getPlayerInput().close();
                            gameOverState.doAction(context);
                        }
                        break;
                    }
                }
            }
        } else System.out.println("Well you lost without even trying... :(");
    }
}