public class WalletPayment implements PaymentMethod {
    private String walletName;
    public WalletPayment(String walletName){ this.walletName=walletName; }

    public void pay(){
        System.out.println("Processing Wallet Payment: " + walletName);
        System.out.println("Wallet Payment Successful");
    }

    public void refund(){
        System.out.println("Wallet Refund Successful");
    }
}
