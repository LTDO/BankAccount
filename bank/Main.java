package bank;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CommandProcessor processor = new CommandProcessor();
        BankAccount account = new BankAccount();
        Scanner console = new Scanner(System.in);
        Menu menu = new Menu();
        processor.getUserData();
        while (true){
            System.out.println("Choose option from the Menu: ");
            String command = console.nextLine();
            System.out.println(processor.commander(command));
        }
    }
}
