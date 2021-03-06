package mrozinski.m;

import java.util.Scanner;

public class Length {
    public static void main(String[] args){
        Scanner wyrazenie = new Scanner(System.in);
        System.out.println("Podaj wyrażenie do zliczenia.");
        String x = wyrazenie.nextLine();
        int i = x.length();
        System.out.println(i);
    }
}
