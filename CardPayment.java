public class CardPayment implements PaymentMethod {
    private String cardNumber;
    public CardPayment(String cardNumber){ this.cardNumber=cardNumber; }

    public void pay(){
        System.out.println("Processing Card Payment: " + cardNumber);
        System.out.println("Card Payment Successful");
    }

    public void refund(){
        System.out.println("Card Refund Successful");
    }
}
