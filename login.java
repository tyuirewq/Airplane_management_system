package oops;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class login {

 public void adminlog() {
     String username , password;
     Scanner scn = new Scanner(System.in);
     System.out.println("Enter your username");
     username = scn.next();
     System.out.println("Enter your password");
     password = scn.next();

    if (username.equalsIgnoreCase("hardik") && password.equalsIgnoreCase("12345")) {
        System.out.println("Login successfull");
        System.out.println("\nWelcome "+username);

    } else {
        System.out.println("Invalid Username or Password \n Try Again");
        adminlog();

    }
}


    public static void main(String[] args) {
        login obj = new login();
        obj.adminlog();
    }
}

