package productp;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductServiceHandler productServiceHandler = new ProductServiceHandler();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to Product Management System!!! Select an operation:");
            System.out.println("1. Add product");
            System.out.println("2. Delete product");
            System.out.println("3. Update product information");
            System.out.println("4. Get product by ID");
            System.out.println("5. Show all products");
            System.out.println("6. Exit system");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Product Name: ");
                    String productName = scanner.next();
                    System.out.print("Enter Product Price: ");
                    int price = scanner.nextInt();
                    productServiceHandler.add(productName, price);
                    System.out.println("--------------------------------------------------------------");
                    break;

                case 2:
                    System.out.print("Enter Product ID to delete: ");
                    int idDelete = scanner.nextInt();
                    productServiceHandler.delete(idDelete);
                    System.out.println("--------------------------------------------------------------");
                    break;

                case 3:
                    System.out.print("Enter Product ID to update: ");
                    int idUpdate = scanner.nextInt();
                    System.out.print("Enter new Product Name: ");
                    String newProductName = scanner.next();
                    System.out.print("Enter new Product Price: ");
                    int newPrice = scanner.nextInt();
                    productServiceHandler.update(idUpdate, newProductName, newPrice);
                    System.out.println("--------------------------------------------------------------");
                    break;

                case 4:
                    System.out.print("Enter Product ID to view: ");
                    int idView = scanner.nextInt();
                    try {
                        System.out.println(productServiceHandler.get(idView));
                    } catch (NullPointerException e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("--------------------------------------------------------------");
                    break;

                case 5:
                    System.out.println("All Products: " + productServiceHandler.getAll());
                    System.out.println("--------------------------------------------------------------");
                    break;

                case 6:
                    System.out.println("Exiting the system... Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid input! Please try again.");
                    System.out.println("--------------------------------------------------------------");
            }
        }
    }
}
