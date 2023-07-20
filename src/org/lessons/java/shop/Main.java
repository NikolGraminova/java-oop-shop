package org.lessons.java.shop;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome.");

        // INPUTS
        int code = random.nextInt(100001);
        System.out.print("Enter product name: ");
        String name = scan.nextLine();
        System.out.print("Enter product description: ");
        String description = scan.nextLine();
        System.out.print("Enter product price: ");
        double price = Double.parseDouble(scan.nextLine());
        System.out.print("Enter product IVA: ");
        int iva = Integer.parseInt(scan.nextLine());

        // CATEGORY
        ArrayList<Category> categoryList = new ArrayList<Category>();
        boolean quit = false;
        do {
            System.out.println("Do you want to add a category? (Y/N)");
            String choiceYN = scan.nextLine();
            if (choiceYN.equalsIgnoreCase("Y")){

                System.out.print("Enter category name: ");
                String nameCategory = scan.nextLine();
                System.out.print("Enter category description: ");
                String descriptionCategory = scan.nextLine();
                Category category = new Category(nameCategory, descriptionCategory);
                categoryList.add(category);

            } else{
                quit = true;
            }

        } while(!quit);

        // PRINT
        Product productOne = new Product(code, name, description, price, iva);

        System.out.println("--- Your order details --- ");
        System.out.println("Code: " + productOne.calcCode() + "-" + name);
        System.out.println("Price: €" + price);
        System.out.println("Total price: €" + String.format("%.2f",productOne.calcPriceIva()));
        System.out.println("Your categories: " + categoryList);

        // QUIT
        System.out.println("Thank you for shopping with us. Bye!");
        scan.close();
    }
}
