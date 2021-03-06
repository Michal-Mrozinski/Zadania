package mrozinski.m;
import java.util.Scanner;
public class Ifthen {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą");
        int x = input.nextInt();
        if(x % 2 == 0){
            System.out.println("parzysta");
        }
        else{System.out.println("nieparzysta");}
    }
}
