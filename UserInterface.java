package atm;

import java.util.Scanner;

public class UserInterface {
    private static int status;
    public static void main(String[] args) {
        AtmOperationImpl impl = new AtmOperationImpl();
        Scanner scan = new Scanner(System.in);
        int atmnumber = 123456;
        int atmpin = 123;
        System.out.println("WELCOM TO ATM MACHINE");
        System.out.println("ENTER THE ATM NUMBER:");
        int atmnum2 = scan.nextInt();
        System.out.println("ENTER THE ATM PIN:");
        int atmpin2 = scan.nextInt();

        if(atmnumber==atmnum2 && atmpin==atmpin2){
            while(true){
                System.out.println("1.View available balance\n 2.Withdraw amount\n 3.Deposit amount\n 4.View ministatement\n 5.Exit\n");
                System.out.println("Enter the choice");
                int ch=scan.nextInt();
                if(ch==1){
                    impl.viewBalance();
                }
                else if(ch==2){
                    System.out.println("Enter the amount to withdraw");
                    double withdrawamount = scan.nextDouble();
                    impl.withdrawAmount(withdrawamount);
                }
                else if(ch==3){
                    System.out.println("Enter the amount to deposit");
                    double depositAmount = scan.nextDouble();
                    impl.depositAmount(depositAmount);
                }
                else if(ch==4){
                    impl.viewMiniStatement();
                }
                else if(ch==5){
                    System.out.println("Collect your ATM card\n Thank you");
                    System.exit(status);
                }
            }
        }

        else{
            System.out.println("INCORRECT ATM NUMBER OR PIN");
        }
        scan.close();;
    }
}
