package org.lessons.java.shop;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome.");

        // INPUTS
        int code = random.nextInt(1000);
        System.out.print("Enter product name: ");
        String name = scan.nextLine();
        System.out.print("Enter product description: ");
        String description = scan.nextLine();
        System.out.print("Enter product price: ");
        double price = Double.parseDouble(scan.nextLine());
        System.out.print("Enter product IVA: ");
        int iva = Integer.parseInt(scan.nextLine());

        // PRINT
        Product productOne = new Product(code, name, description, price, iva);

        System.out.println("Your order details: ");
        System.out.println("Code: " + productOne.calcCode() + "-" + name);
        System.out.println("Price: €" + price);
        System.out.println("Total price: €" + String.format("%.2f",productOne.calcPriceIva()));

        // EXIT
        System.out.println("Thank you for shopping with us. Bye!");
        scan.close();

    }
}
