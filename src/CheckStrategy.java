public class CheckStrategy implements PaymentStrategy{

    private String name;
    private String description;
    private String dateOfExpiry;

    public CheckStrategy(String name, String dateOfExpiry){
        this.name = name;
        this.dateOfExpiry = dateOfExpiry;
        this.description = "Money got from Who want to be a millionaire game";
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + "$ paid using check");
        System.out.println("The check will expire on " + dateOfExpiry);
    }
}
