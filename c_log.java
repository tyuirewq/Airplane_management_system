package oops;
import java.util.*;
public class c_log{
    public static boolean clog() {
        boolean bool = false;
        String username , password;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your username");
        username = scn.next();
        System.out.println("Enter your password");
        password = scn.next();

        if (username.equalsIgnoreCase("hariom") && password.equalsIgnoreCase("12345")) {
            System.out.println("Login successfull");
            System.out.println("Welcome " +username);
            bool = true;
        } else {
            System.out.println("Invalid Username or Password");
        }
        return bool;
    }
    public static void main(String[] args) {
        login obj = new login();
      clog();
    }
}
