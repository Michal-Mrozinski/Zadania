package mrozinski.m;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args){
        System.out.println("Paczka zawiera następujące programy:" + System.lineSeparator() +
                "1. Calc - dodawanie dwóch liczb zmiennoprzecinkowych" + System.lineSeparator() +
                "2. Abstract - przykład klasy abstrakcyjnej i interfejsów" + System.lineSeparator() +
                "3. Array - lista imion" + System.lineSeparator() +
                "4. CalUse - przykład użycia metody wewnątrz klasy" + System.lineSeparator() +
                "5. Constr - przykład konstruktora" + System.lineSeparator() +
                "6. DateTime - podaje aktualną datę i godzinę" + System.lineSeparator() +
                "7. For - przykład pętli For" + System.lineSeparator() +
                "8. Ifthen - czy liczba jest parzysta?" + System.lineSeparator() +
                "9. Inherit - podaj kolory i wymiary figur" + System.lineSeparator() +
                "10. Konto - przykład tworzenia obiektu; wyświetla moje imię i nazwisko" + System.lineSeparator() +
                "11. langs - przykład dodawania pozycji do listy"+ System.lineSeparator() +
                "12. Length - liczy znaki w podanym wyrażeniu" + System.lineSeparator() +
                "13. m - przykład analizy ciągu znaków" + System.lineSeparator() +
                "14. ProstoKapsula - przykład zastosowania enkapsulacji" + System.lineSeparator() +
                "15. Skaner - prosi o imię i nazwisko a potem je wyświetla" + System.lineSeparator() +
                "16. StrBldr - złącz ze sobą dwa wyrażenia" + System.lineSeparator() +
                "17. Switch - przykład przełącznika, zwraca dzień tygodnia w odpowiedzi na numer" + System.lineSeparator() +
                "18. Task2 - prosty przykład wykorzystania zmiennej" + System.lineSeparator() +
                "19. Ternary - prosty przykład użycia operatorów trzeciego rzędu" + System.lineSeparator() +
                "20. While - prosty przykład uzycia pętli warunkowej" + System.lineSeparator() +
                "21. While1 - prosty przykład użycia pętli while" + System.lineSeparator() + System.lineSeparator() +
                "podaj numer programu, który chcesz uruchomić");
        Scanner i = new Scanner(System.in);
        switch (i.nextInt()){
            case 1:
                Calc.main(args);
                break;
            case 2:
                Abstract.main(args);
                break;
            case 3:
                Array.main(args);
                break;
            case 4:
                CalUse.main(args);
                break;
            case 5:
                Constr.main(args);
                break;
            case 6:
                DateTime.main(args);
                break;
            case 7:
                For.main(args);
                break;
            case 8:
                Ifthen.main(args);
                break;
            case 9:
                Inherit.main(args);
                break;
            case 10:
                Konto.main(args);
                break;
            case 11:
                langs.main(args);
                break;
            case 12:
                Length.main(args);
                break;
            case 13:
                m.main(args);
                break;
            case 14:
                ProstoKapsula.main(args);
                break;
            case 15:
                Skaner.main(args);
                break;
            case 16:
                StrBldr.main(args);
                break;
            case 17:
                Switch.main(args);
                break;
            case 18:
                Task2.main(args);
                break;
            case 19:
                Ternary.main(args);
                break;
            case 20:
                While.main(args);
                break;
            case 21:
                While1.main(args);
                break;
            default:
                System.out.println("Brak podanej pozycji na liście.");


            }

    }
}
