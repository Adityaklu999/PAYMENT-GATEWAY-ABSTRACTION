public class UPIPayment implements PaymentMethod {
    private String upiId;
    public UPIPayment(String upiId){ this.upiId=upiId; }

    public void pay(){
        System.out.println("Processing UPI payment using: " + upiId);
        System.out.println("UPI Payment Successful");
    }

    public void refund(){
        System.out.println("UPI Refund Successful");
    }
}
