package mrozinski.m;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args){
        /* wprowadzenie
        * pierwszej
        * liczby
         */
        System.out.println("Podaj pierwsza liczbę");
        Scanner input = new Scanner(System.in);
        double x = input.nextFloat();
        // wprowadzenie drugiej
        System.out.println("Podaj drugą liczbę");
        double y = input.nextFloat();
        calc(x, y);
        //System.out.println(calc(x, y));

    }
    /** działanie arytm
     * powinna być funkcja
     * @author Michał Mroziński
     */
    public static double calc(double a, double b) {
        double z = a + b;
        System.out.println("Wynik dodawania wynosi " + z);
        return z;
    }

}
