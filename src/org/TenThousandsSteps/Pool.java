package org.TenThousandsSteps;

class Pool {

    private static final String GREEN = "\u001B[32m";
//  this is a final variable used to color the menu in green
    private static double onePoundPool = Menu.onePound.value*Menu.onePound.qtyCoins;
    private static double halfPoundPool = Menu.halfPound.value*Menu.halfPound.qtyCoins;
    private static double twentyPencePool = Menu.twentyPence.value*Menu.twentyPence.qtyCoins;
    private static double tenPencePool = Menu.tenPence.value*Menu.tenPence.qtyCoins;
    private static double fivePencePool = Menu.fivePence.value*Menu.fivePence.qtyCoins;

    private static double totalPool = onePoundPool + halfPoundPool + twentyPencePool + tenPencePool + fivePencePool;
    private static double clientPool = 0;

    /* I create a class "Pool" that will be responsible with the deposit of coins in the pool and give change
     in the case that more coins are inserted than the total value of the products. The class is also verifying
     the total pool of coins and the total coins that a client inserted */

    static void depositInPool(double coin){

        if (coin == Menu.onePound.value){
            System.out.println("\tYou have entered £1.00");
            clientPool += coin;
            totalPool += coin;
            onePoundPool += coin;
        } else if (coin == Menu.halfPound.value){
            System.out.println("\tYou have entered £0.50");
            clientPool += coin;
            totalPool += coin;
            halfPoundPool += coin;
        } else if (coin == Menu.twentyPence.value){
            System.out.println("\tYou have entered £0.20");
            clientPool += coin;
            totalPool += coin;
            twentyPencePool += coin;
        } else if (coin == Menu.tenPence.value){
            System.out.println("\tYou have entered £0.10");
            clientPool += coin;
            totalPool += coin;
            tenPencePool += coin;
        } else if (coin == Menu.fivePence.value){
            System.out.println("\tYou have entered £0.05");
            clientPool += coin;
            totalPool += coin;
            fivePencePool += coin;
        } else {
            System.out.printf(GREEN + "\tWe only accept:\n\t%10s\t%10s\t%10s\t%10s\t%10s\n", "£1", "£0.50", "£0.20", "£0.10", "£0.05");
        }
        /* I create a depositInPool() method that first is verifying what type of coin was inserted and is depositing the coin in the
        "clientPool" and "totalPool" variables */
    }

    static void giveChange(double total){
        if (clientPool > total){
            System.out.println("\tPlease wait for the change.");
            double change = clientPool - total;
            totalPool -= change;
            System.out.printf("\tYou have received £%2.2f change back.Thank you.\n", change);
        }
//  I create a method giveChange() that is verifying if more coins was inserted in the pool and if it's true will give change the difrence
    }

    static double getTotalPool() {
        return totalPool;
    }

    static double getClientPool() {
        return clientPool;
    }

    static void setClientPool() {
        Pool.clientPool = (double) 0;
    }

//  Here I have generated the getters and setters for two variables totalPool and clientPool

}
