package main;

import Daniel.ProductCart;
import Daniel.ShoppingCart;

public class MainCart {

    public static void main(String[] args) {
        
    	ProductCart prod1 = new ProductCart(1, 6.5f, "Bolacha");
    	ProductCart prod2 = new ProductCart(2, 2.5f, "Chiclete");
    	ProductCart prod3 = new ProductCart(3, 12.0f, "Chocolate");
        
        ShoppingCart shop1 = new ShoppingCart(100, 0);
        shop1.addCarItem(10, 10, prod1);
        shop1.addCarItem(11, 5, prod2);
        System.out.println(shop1.toString());
        
        ShoppingCart shop2 = new ShoppingCart(200, 0);
        shop2.addCarItem(5, 5, prod2);
        shop2.addCarItem(6, 6, prod3);
        System.out.println(shop2.toString());
        
    }	
}
