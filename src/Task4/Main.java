package Task4;

import java.util.Scanner;

public class Main extends Printer{

    @Override
    void print(String value) {
        super.print(value);
    }

    public static void main(String[] args) {
        Printer printer = new Main();

        Scanner in = new Scanner(System.in);
        System.out.println("Value: ");
        value = in.next();

        printer.print(value);
    }
}
