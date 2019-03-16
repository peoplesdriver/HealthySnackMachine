package org.TenThousandsSteps;
import java.util.Scanner;

class Menu {

    private static final String GREEN = "\u001B[32m";
    private static final String BLUE = "\u001B[34m";
    private static final String PASS ="java123";   // this is the password for the admin submenu
    private static final double initialPrice = 0.45;

    static Product crisps = new Product("Crisps", 4.80, 10);
    static Product mars = new Product("Mars Bar", 4.75, 10);
    static Product coca = new Product("Coca Cola", 5.00, 10);
    static Product eugenia = new Product("Eugenia", 4.55, 10);
    static Product water = new Product("Water", 4.90, 10);
// here I create the products

    static Coin onePound = new Coin(1.00, 10);
    static Coin halfPound = new Coin(0.50, 20);
    static Coin twentyPence = new Coin(0.20, 20);
    static Coin tenPence = new Coin(0.10, 20);
    static Coin fivePence = new Coin(0.05, 20);
 // here i create the coins and the initial quantity of coins in the pool

// I have created a class Menu that will display the menu and submenus and perform all the transactions of the other classes

    static void mainMenu() {
        System.out.println(BLUE + "\t_______________________________________________________________\n");
        System.out.println(GREEN + "\t**************** 10000 Steps Healthy Snacks ******************");
        System.out.println(BLUE + "\t_______________________________________________________________\n");
        System.out.printf(GREEN + "\t\t%-20s%20s%20s", "PRODUCT", "PRICE", "QTY\n");
        System.out.println(BLUE + "\t_______________________________________________________________\n");
        if (crisps.qty == 0) {
            System.out.printf("\t1. %-20s%20.2f%20s\n", crisps.name, crisps.price, "*** Out Of Stock ***");
        } else {
            System.out.printf("\t1. %-20s%20.2f%20d\n", crisps.name, crisps.price, crisps.qty);
        }
        if (mars.qty == 0) {
            System.out.printf("\t2. %-20s%20.2f%20s\n", mars.name, mars.price, "*** Out Of Stock ***");
        } else {
            System.out.printf("\t2. %-20s%20.2f%20d\n", mars.name, mars.price, mars.qty);
        }
        if (coca.qty == 0) {
            System.out.printf("\t3. %-20s%20.2f%20s\n", coca.name, coca.price, "*** Out Of Stock ***");
        } else {
            System.out.printf("\t3. %-20s%20.2f%20d\n", coca.name, coca.price, coca.qty);
        }
        if (eugenia.qty == 0) {
            System.out.printf("\t4. %-20s%20.2f%20s\n", eugenia.name, eugenia.price, "*** Out Of Stock ***");
        } else {
            System.out.printf("\t4. %-20s%20.2f%20d\n", eugenia.name, eugenia.price, eugenia.qty);
        }
        if (water.qty == 0) {
            System.out.printf("\t5. %-20s%20.2f%20s\n", water.name, water.price, "*** Out Of Stock ***");
        } else {
            System.out.printf("\t5. %-20s%20.2f%20d\n", water.name, water.price, water.qty);
        }
        System.out.println("\tPlease enter an option: ");
        clearScreen();

        try {
            Scanner input = new Scanner(System.in);
            int selection = input.nextInt();
            input.nextLine();

            switch (selection) {
                case 1:
                    checkMaxOrder(crisps.name, crisps.price, crisps.qty, selection);
                    break;

                case 2:
                    checkMaxOrder(mars.name, mars.price, mars.qty, selection);
                    break;

                case 3:
                    checkMaxOrder(coca.name, coca.price, coca.qty, selection);
                    break;

                case 4:
                    checkMaxOrder(eugenia.name, eugenia.price, eugenia.qty, selection);
                    break;

                case 5:
                    checkMaxOrder(water.name, water.price, water.qty, selection);
                    break;

                case 6:
                    login();
                    adminMenu();
                    break;

                default:
                    System.out.println(GREEN + "\tPlease enter a valid selection between 1 and 5.");
                    System.out.println(GREEN + "\tFor admin panel press 6.");
                    goBack();
            }
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(GREEN + "\tPlease enter a valid selection between 1 and 5.");
            goBack();
        }
    }
        /* the mainMenu() method it's displaying the first screen menu where the client it's asked
        to select a product. It is checking if a valid number was introduced and if not, will display
        a message asking for a valid number. The method it's having and a secret selection, number "6"
        that it will take as at the administrative submenu*/


    private static void login(){
        System.out.println(BLUE + "\t_______________________________________________________________\n");
        System.out.println(GREEN + "\t\t\t\t\t\t\t*** WARNING! ***\n\t\t\t\t\t You are entering admin section.");
        System.out.println(BLUE + "\t_______________________________________________________________\n");
        System.out.println(GREEN + "\tPlease enter user ID");
        try {
            Scanner input = new Scanner(System.in);
            int code = input.nextInt();
            input.nextLine();
            if (code == 10976){  // 10976 is the secret admin user ID
                System.out.println(GREEN + "\tPlease enter your password: ");
                String pass = input.nextLine();
                if (pass.equals(PASS)){
                    System.out.println(BLUE + "\t_______________________________________________________________\n");
                    System.out.println(GREEN + "\t\t\t\t\t\t\t*** Login successful! ***");
                } else {
                    System.out.println(GREEN + "\t\t\t\t\t\t\tPassword incorrect, please try again");
                    login();
                }

            } else {
                System.out.println(GREEN + "\t\t\t\t\t\t*** Code Incorrect! ***");
                login();
            }
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(GREEN + "\t\t\t\t\t\t*** Code Incorrect! ***");
            login();
        }
// i create a login() method that will verify if the correct password was introduced for the admin submenu
    }

    private static void adminMenu(){
        System.out.println(BLUE + "\t_______________________________________________________________\n");
        System.out.println("\t1.\tView Total Money in the Vault.");
        System.out.println("\t2.\tView Stock");
        System.out.println("\t3.\tView Profits");
        System.out.println("\tTo go back please press 4.");
        System.out.println();
        System.out.println("\tPlease enter an option:");
        try {
            Scanner input = new Scanner(System.in);
            int selection = input.nextInt();
            input.nextLine();
            switch (selection){
                case 1:
                    System.out.println(BLUE + "\t_______________________________________________________________\n");
                    System.out.printf(GREEN + "\tTotal money in the account %.2f\n",Pool.getTotalPool());
                    adminMenu();
                    break;
                case 2:
                    System.out.println(BLUE + "\t_______________________________________________________________\n");
                    System.out.println(GREEN + "\tThe machine is holding this stock:");
                    System.out.println(BLUE + "\t_______________________________________________________________\n");
                    System.out.printf("\tCrisps\t%d\n", crisps.qty);
                    System.out.printf("\tMars Bar\t%d\n", mars.qty);
                    System.out.printf("\tCoca Cola\t%d\n", coca.qty);
                    System.out.printf("\tEugenia\t%d\n", eugenia.qty);
                    System.out.printf("\tWater\t%d\n", water.qty);
                    adminMenu();
                    break;
                case 3:
                    System.out.println(BLUE + "\t_______________________________________________________________\n");
                    System.out.printf("\t Crisps Profit %.2f\n", calculateProfit(crisps.price, crisps.qty));
                    System.out.printf("\t Mars Bar Profit %.2f\n", calculateProfit(mars.price, mars.qty));
                    System.out.printf("\t Coca Cola Profit %.2f\n", calculateProfit(coca.price, coca.qty));
                    System.out.printf("\t Eugenia Profit %.2f\n", calculateProfit(eugenia.price, eugenia.qty));
                    System.out.printf("\t Water Profit %.2f\n", calculateProfit(water.price, water.qty));
                    System.out.println(BLUE + "\t_______________________________________________________________\n");
                    System.out.printf(GREEN + "Total Profit %.2f\n", calculateProfit(crisps.price, crisps.qty ) +
                                    calculateProfit(mars.price, mars.qty) + calculateProfit(coca.price, coca.qty) +
                                    calculateProfit(eugenia.price, eugenia.qty) + calculateProfit(water.price, water.qty));
                    adminMenu();
                    break;
                case 4:
                    mainMenu();
                default:
                    System.out.println(BLUE + "\t_______________________________________________________________\n");
                    System.out.println(GREEN + "\tPlease enter a valid option between 1 and 3");
                    adminMenu();
            }
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(BLUE + "\t_______________________________________________________________\n");
            System.out.println(GREEN + "\tPlease enter a valid option between 1 and 3");
            adminMenu();

        }
    }
    /*  the adminMenu() method it's displaying the admin section of the application where we can check the total quantity
     of products at any time and the profits realized  and the total number of coins in the machine
      */


    private static void checkMaxOrder(String product, double price, int qty, int selection){
        try {
            subMenu();
            Scanner input = new Scanner(System.in);
            int qtySelected = input.nextInt();
            input.nextLine();
            if (qty == 0) {
                System.out.println(BLUE + "\t_______________________________________________________________\n");
                System.out.println(GREEN + "\t\t\t\t\t\t\t*** Out Of Stock ***");
                goBack();
            } else if (qtySelected > qty) {
                System.out.println(BLUE + "\t_______________________________________________________________\n");
                System.out.printf(GREEN + "\tThe maximum quantity dispensable is %d products.\n", qty);
                checkMaxOrder(product, price, qtySelected, selection);
            } else {
                insertCoin(product, price, qtySelected, selection);
            }
        } catch (Exception e) {
            System.out.println("\t\t\t\t\t\tPlease enter a valid number\n");
            System.out.printf(GREEN + "\tThe maximum quantity dispensable is %d products.\n", qty);
            checkMaxOrder(product, price, qty, selection);
//            e.printStackTrace();
        }
//   this method is checking if the quantity selected is greater than the number of products in stock
    }

    private static void insertCoin(String product, double price, int qtySelected, int selection){
        double total = price*qtySelected;
        System.out.printf(GREEN + "\tYou have selected %s %s for a Total Price of £%.2f.\n", qtySelected, product, total);
        System.out.println(BLUE + "\t_______________________________________________________________\n");
        System.out.printf(GREEN + "\tWe only accept this coins:\n%10s\t%10s\t%10s\t%10s\t%10s\n\n", "£1", "£0.50", "£0.20", "£0.10", "£0.05\n");
        System.out.println(BLUE + "\t_______________________________________________________________\n");
        System.out.println(GREEN + "\tPlease insert first coin.");
        System.out.println();
        clearScreen();
        try {
            Scanner input = new Scanner(System.in);
            System.out.printf("\t%-10s = %3.2f %40s = %3.2f\n", "Credit", Pool.getClientPool(), "Total Price", total);
            double coin = input.nextDouble();
            input.nextLine();
            Pool.depositInPool(coin);
            do {

                System.out.printf("\t%-10s = %3.2f %40s = %3.2f\n", "Credit", Pool.getClientPool(), "Total Price", total);
                System.out.println("\tPlease insert next coin:");
                coin = input.nextDouble();input.nextLine();
                Pool.depositInPool(coin);
                System.out.println();
            } while (Pool.getClientPool() < total);
            System.out.println(BLUE + "\t_______________________________________________________________\n");
            System.out.printf("\tTotal £%2.2f\n", Pool.getClientPool());
            System.out.println(BLUE + "\t_______________________________________________________________\n");

            Pool.giveChange(total);

            System.out.println(BLUE + "\t_______________________________________________________________\n");
            System.out.println("\t\t\t\t\t\t*** Please wait for the product ***");
            System.out.println("\t\t\t\t\t\t*** Your product was dispensed ***");  // here i have found a little error created by double \\
            System.out.println(GREEN + "\t_______________________________________________________________\n");
            System.out.println("\t\t\t\t\t*** Thank you for using the Vending Machine ***");
            Product.withdrawProduct(qtySelected, selection);
            Pool.setClientPool();
            goBack();
        } catch (Exception e) {
            System.out.println("\t\t\t\t\t\t\t*** Please enter a valid number ***");
            System.out.printf(GREEN + "\tWe only accept this coins:\n%10s\t%10s\t%10s\t%10s\t%10s\n", "£1", "£0.50", "£0.20", "£0.10", "£0.05\n");
            insertCoin(product, price, qtySelected, selection);
//            e.printStackTrace();
        }
/*  this method is checking if a valid coin was introduced. if the correct coin was introduced and the total amount was received,
    the machine will dispense the products and is calling the giveChange method if more coins was introduced then the total amount */
    }


    private static void subMenu(){
        System.out.println(BLUE + "\t_______________________________________________________________\n");
        System.out.println(GREEN + "\t**************** 10000 Steps Healthy Snacks ******************");
        System.out.println(BLUE + "\t_______________________________________________________________\n");
        System.out.println(GREEN + "\tPlease enter quantity: ");
    }
// this method it's displaying a submenu where the client it's been asked to introduce a quantity
    private static double calculateProfit(double price, int qty){
        return (price - initialPrice)*(10 - qty);

    }


    static void goBack(){
        mainMenu();
    }
//  this method takes you to the mainMenu

    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
