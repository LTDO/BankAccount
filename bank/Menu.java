package bank;

public class Menu {
    public Menu(){
        printMenu();
    }

    public static void printMenu(){
        StringBuilder buildMenu = new StringBuilder("=====Menu=====\n");
        System.out.println("Please select transaction option below\n");
        buildMenu.append("\n");
        buildMenu.append("1. Deposit\n");
        buildMenu.append("2. Withdraw\n");
        buildMenu.append("3. Show Balance\n");
        buildMenu.append("4. Exit\n");
        System.out.println(buildMenu);
    }
}
