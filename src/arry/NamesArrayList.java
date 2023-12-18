package arry;

import java.util.ArrayList;
import java.util.Scanner;

public class NamesArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        String option = "";

        while (!option.equals("quit")) {
            System.out.println("Choose an option: Add, View, Delete, or Quit");
            option = input.nextLine();

            if (option.equals("add")) {
                System.out.println("Enter name(s) to add, separated by commas:");
                String[] newNames = input.nextLine().split(",");
                for (String name : newNames) {
                    names.add(name.trim());
                }
                System.out.println("Name(s) added successfully.");
            } else if (option.equals("view")) {
                if (names.size() == 0) {
                    System.out.println("No names to view.");
                } else {
                    System.out.println("Names in the list:");
                    for (String name : names) {
                        System.out.println(name);
                    }
                }
            } else if (option.equals("delete")) {
                if (names.size() == 0) {
                    System.out.println("No names to delete.");
                } else {
                    System.out.println("Enter name(s) to delete, separated by commas:");
                    String[] deleteNames = input.nextLine().split(",");
                    for (String name : deleteNames) {
                        names.remove(name.trim());
                    }
                    System.out.println("Name(s) deleted successfully.");
                }
            } else if (!option.equals("quit")) {
                System.out.println("Invalid option. Please try again.");
            }
        }
        System.out.println("Program exited successfully.");
    }
}