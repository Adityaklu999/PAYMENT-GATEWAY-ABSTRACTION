public class NetBankingPayment implements PaymentMethod {
    private String bankName;
    public NetBankingPayment(String bankName){ this.bankName=bankName; }

    public void pay(){
        System.out.println("Processing NetBanking: " + bankName);
        System.out.println("NetBanking Payment Successful");
    }

    public void refund(){
        System.out.println("NetBanking Refund Successful");
    }
}
