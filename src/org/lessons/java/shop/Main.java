package org.lessons.java.shop;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Random random = new Random();
        int code = random.nextInt(100);

        Product productOne = new Product(code, "name","description",19.99, 22);
        System.out.println(productOne);

    }
}
