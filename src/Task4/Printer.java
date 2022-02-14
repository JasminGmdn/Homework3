package Task4;

import java.util.Scanner;

public class Printer {
    static String value;

    public  static final String value_yellow = "\u001B[33m";
    public  static final String value_red = "\u001B[31m";
    public  static final String value_green = "\u001B[32m";
    public  static final String value_purple = "\u001B[35m";
    public  static final String value_blue = "\u001B[34m";



    void print(String value){
        System.out.println(value_yellow + value + "\n" + value_red + value + "\n"
                + value_green + value + "\n" + value_blue + value + "\n" + value_purple + value );
    }




}
