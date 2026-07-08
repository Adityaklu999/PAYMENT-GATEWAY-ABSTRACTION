public class Checkout {
    public void processPayment(PaymentMethod payment){
        payment.pay();
    }

    public void processRefund(PaymentMethod payment){
        payment.refund();
    }
}
