package oops;
import java.util.*;
public class Payment{
    private int pin;
    private String pwd;
    Scanner s = new Scanner(System.in);
    // upi method
    boolean upi() {

        boolean a = false;

        try {
            String upid = "7070@ybl";
            System.out.println("Enter Your Upi id:");
            String id = s.nextLine();
            if (upid.equals(id)) {
                System.out.println("Enter Your 6 digit UPI pin: ");
                pin = Integer.parseInt(s.nextLine());
                if (pin == 7070){
                    System.out.println("===========================================");
                    System.out.println("Transaction Successfull !.... Thankyou for making Payment\n Have a Good Day");
                    System.out.println("===========================================");
                    a = true;
                } else {
                    System.out.println("Invalid UPI pin Please Try Again");
                    upi();
                }
            } else {
                System.out.println("===========================================");
                System.out.println("Enter Your Correct Upi id");
                System.out.println("===========================================");
                upi();
            }
        } catch (Exception e) {
            System.out.println("Oops... Please Enter Numbers Only");
            upi();
        }
        return a;
    }

    // net banking method
    boolean netBanking() {

        boolean a = false;

        System.out.println("===========================================");
        String user = "ABC1234";
        String pass = "abc@1234";
        System.out.println("Enter Your User id: ");
        String userid = s.nextLine();

        if (user.equals(userid)) {
            System.out.println("Hello Dear ! " + userid + " Enter Your Password : ");
            pwd = s.nextLine();
            if (pass.equals(pwd)) {
                System.out.println("===========================================");
                System.out.println("Transaction Successfull !.... Thankyou for making Payment\n Have a Good Day");
                System.out.println("===========================================");
                a = true;
            } else {
                System.out.println("Invalid Password");
                netBanking();
            }
        } else {
            System.out.println("Enter Valid User Id");
            netBanking();
        }
        return a;
    }

    // debit credit card method
    boolean debtcredCard() {

        boolean a = false;

        System.out.println("Enter Your 16 digit Card Number: ");
        Long cno = Long.parseLong(s.nextLine());
        int c = isDebtok(cno);
        System.out.println(c);
        if (c == 16) {
            try {
                System.out.println("Enter Your 4 digit Pin Number:");
                int atmpin = Integer.parseInt(s.nextLine());
                if (atmpin == 1234) {
                    System.out.println("===========================================");
                    System.out.println("Transaction Successfull !.... Thankyou for making Payment\n Have a Good Day");
                    System.out.println("===========================================");
                    a = true;
                } else {
                    System.out.println("Pin Mismatched from Bank Database");
                    debtcredCard();
                }
            } catch (Exception e) {
                System.out.println("Please Enter You Numerical Pin Only");
                debtcredCard();
            }
        } else {
            System.out.println("===========================================");
            System.out.println("Invalid Card Number......\n\t Please Try Again");
            System.out.println("\tShould be 16 digit card Number Present");
            System.out.println("===========================================");
            debtcredCard();
        }

        return a;
    }

    // checking debit is of 16 digit or not
    int isDebtok(long cardno) {
        int count = 0;
        long num = cardno;

        while (num != 0) {
            // num = num/10
            num /= 10;
            ++count;
        }
        return count;
    }
}
