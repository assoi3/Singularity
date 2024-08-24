package org.example;

public class Employee {
    private int ID;
    private String name;
    private double salary;

    Employee(String s) {
        this.ID = 0;
        this.name = "";
        this.salary = 0;
    }

    public int getID(){
        return ID;
    }


    public void setID(int ID){
        this.ID = ID;
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }



    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }



    public static String formatNumber(double number) {
        String numberStr = String.valueOf(number);
        int dotPosition = numberStr.indexOf('.');
        String beforeDot = numberStr.substring(0, dotPosition);
        return insertUnderscores(beforeDot);
    }

    private static String insertUnderscores(String number) {
        StringBuilder result;
        result = new StringBuilder();
        int length = number.length();
        int count = 0;
        for (int i = length - 1; i >= 0; i--) {
            if (count == 3) {
                result.insert(0, " ");
                count = 0;
            }
            result.insert(0, number.charAt(i));
            count++;
        }
        return result.toString();
    }


    @Override
    public String toString() {
        return getName() + "With a salary of " + formatNumber(getSalary()) + " tenge";
    }
}
