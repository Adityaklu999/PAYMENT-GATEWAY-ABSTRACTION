
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Checkout checkout = new Checkout();
        PaymentMethod payment;

        System.out.println("===== PAYMENT GATEWAY =====");
        System.out.println("1. UPI");
        System.out.println("2. Card");
        System.out.println("3. Wallet");
        System.out.println("4. NetBanking");
        System.out.print("Enter Choice: ");

        int choice = sc.nextInt();
        sc.nextLine();

        switch(choice){
            case 1:
                System.out.print("Enter UPI ID: ");
                payment = new UPIPayment(sc.nextLine());
                break;

            case 2:
                System.out.print("Enter Card Number: ");
                payment = new CardPayment(sc.nextLine());
                break;

            case 3:
                System.out.print("Enter Wallet Name: ");
                payment = new WalletPayment(sc.nextLine());
                break;

            case 4:
                System.out.print("Enter Bank Name: ");
                payment = new NetBankingPayment(sc.nextLine());
                break;

            default:
                System.out.println("Invalid Choice");
                sc.close();
                return;
        }

        System.out.println("\n--- PAYMENT ---");
        checkout.processPayment(payment);

        System.out.println("\n--- REFUND ---");
        checkout.processRefund(payment);

        sc.close();
    }
}
