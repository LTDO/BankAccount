package bank;

import javax.swing.*;
import java.util.Scanner;

public class CommandProcessor  {
    static Scanner input = new Scanner(System.in);
    BankAccount account = new BankAccount();
    public CommandProcessor() {
        super();
    }

    public String commander(String command){

            if(command.equalsIgnoreCase("1")){
                System.out.println("Enter Deposit amount: ");
                long amount = input.nextLong();
                account.deposit(amount);
                System.out.println("Deposit of " + amount + " to " + account.getAccountNumber() + " successful");
            }else if (command.equalsIgnoreCase("2")){
                System.out.println("Enter amount to withdraw: ");
                double widraw = input.nextLong();
                account.withdraw(widraw);
                System.out.println("***Please take your cash***");
            }else if (command.equalsIgnoreCase("3")){
               account.showBalance();
            }else if (command.equalsIgnoreCase("4")){
                System.exit(0);
            }
            else {
              return "Invalid Input, please try again.";
            }
            return  "";
    }

    public void getUserData(){
            try{
                System.out.println("Please type in your name: ");
                String name = input.nextLine();
                account.setAccountHolder(name);

                System.out.println("Please type in your Account number: ");
                long accountNumber = input.nextLong();
                account.setAccountNumber(accountNumber);
            }catch (Exception e){
                System.out.println("OOPS! SOME ERROR OCCURED TRY AGAIN");
            }
        }
}
