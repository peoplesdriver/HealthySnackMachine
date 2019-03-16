package org.TenThousandsSteps;

class Product {

    String name;
    double price;
    int qty;
//  here i create a class Product with three private variables name, price and qty


    Product(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }
//  I create a cuonstructor for the class

    static void withdrawProduct(int qty, int selection){
        if (selection == 1 && Menu.crisps.qty > 0){
            Menu.crisps.qty -= qty;
        } else if (selection == 2 && Menu.mars.qty > 0){
            Menu.mars.qty -= qty;
        } else if (selection == 3 && Menu.coca.qty > 0){
            Menu.coca.qty -= qty;
        } else if (selection == 4 && Menu.eugenia.qty > 0){
            Menu.eugenia.qty -= qty;
        } else if (selection == 5 && Menu.water.qty > 0) {
            Menu.water.qty -= qty;
        } else {
            Menu.goBack();
        }
    }

/*
I create a method withdrawProduct() with two parameters "qty" and "selection" that will verify what the client have selected and if the
product is in stock, it will withdraw the quantity selected
*/
}
