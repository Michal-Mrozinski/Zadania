package mrozinski.m;
import java.util.Scanner;
public class Skaner {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj swoje imię");
        String imie = input.nextLine();
        System.out.println("Podaj swoje nazwisko");
        String nazwisko = input.nextLine();
        System.out.println("Twoje imię i nazwisko to " + imie + " " + nazwisko + ".");
    }
}
