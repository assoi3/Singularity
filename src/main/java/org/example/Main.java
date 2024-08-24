package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Department akk = new Department(scanner.nextLine());
        for(int i = 0; i < 3; i++) {
            Employee ns = new Employee(scanner.nextLine());
            akk.addEmployee(ns);
        }
        System.out.println("Employee"  + akk);
        Employee[] employees = akk.getEmployees();
        for (Employee e : employees) {
            if (e != null) {
                System.out.println(e);
            }
        }
        scanner.close();
    }
    }

