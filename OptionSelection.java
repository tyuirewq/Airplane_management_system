package oops;
import java.util.*;

class OptionSelection extends Payment
{
    void option(){
        System.out.println("===========================================");
        System.out.println("***** P A Y M E N T   G A T E W A Y ******");
        System.out.println("===========================================");
        System.out.println("\t1. UPI\n\t2. NetBanking\n\t3. Debit/Credit Card\n\t4. Cancel Payment");
        System.out.println("===========================================");
    }

    Scanner s = new Scanner(System.in);
    int op;

    void readOpt() {
        System.out.print("Please Enter Your Option: ");
        try {
            op = Integer.parseInt(s.nextLine());
        } catch (Exception e) {
            System.out.println("Please Enter Numerical Value Only!");
        }
    }

    boolean sel() {
        boolean q = false;

        switch (op) {
            case 1:
                q = upi();
                break;
            case 2:
                q = netBanking();
                break;
            case 3:
                q = debtcredCard();
                break;
            case 4:
                System.exit(1);
            default:
                System.out.println("Invalid Selection Please Try Again! .. Sorry for Inconvinience!");
        }
        return q;
    }
}
