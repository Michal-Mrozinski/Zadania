package mrozinski.m;

import java.util.Scanner;

public class StrBldr {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj pierwsze wyrażenie.");
        String a = input.nextLine();
        StringBuilder x = new StringBuilder(a);
        System.out.println("Podaj drugie wyrażenie.");
        x.append(" " + input.nextLine());
        System.out.println(x);
    }
}
