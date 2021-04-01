public class CreditCardStrategy implements PaymentStrategy {
        private String name;
        private String cardNumber;
        private String cvv;
        private String dateOfExpiry;

        public CreditCardStrategy(String nm, String ccNum, String cvv, String expiryDate){
            this.name=nm;
            this.cardNumber=ccNum;
            this.cvv=cvv;
            this.dateOfExpiry=expiryDate;
        }
    // The payment will be made via credit/debit card
    @Override
    public void pay(int amount) {
        System.out.println(amount + "$ paid with credit/debit card");
        System.out.println("Account name: " + name);
        System.out.println("Card number: " + cardNumber);
        System.out.println("CVV: " + cvv);
        System.out.println("Date of expiration: " + dateOfExpiry);
        System.out.println("The transfer will be made in 24h");
    }
}

