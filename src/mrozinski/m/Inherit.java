package mrozinski.m;
import java.util.Scanner;
public class Inherit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj osobno kolor i długość boku kwadratu.");
        /* nie trzeba przypisywać zmiennych, można od razu
        * wsadzić output Scannera do obiektu/metody
         */
        Square kw = new Square(input.nextLine(), input.nextInt());
        // trzeba tylko pamiętać, że program będzie czekał
        // na wartości w kolejności ich występowania w kodzie
        System.out.println(kw.color + " " + kw + " with an edge " + kw.edge + " units long." + System.lineSeparator() +
                "It's area equals " + kw.area() + " square units.");

        System.out.println("Podaj osobno kolor i promień koła.");
        Scanner incirc = new Scanner(System.in);
        Circle circ = new Circle(incirc.nextLine(), incirc.nextInt());
        System.out.println(circ.color +" " + circ + " with a radius of " + circ.radius + " units long." +
                System.lineSeparator() + "It's area equals " + circ.area() + "square units.");

        System.out.println("Podaj kolor figury.");
        Scanner infig = new Scanner(System.in);
        Figure fig = new Figure(infig.nextLine());
        fig.infoFig();

        kw.infoFig();
        circ.infoFig();
    }
}
