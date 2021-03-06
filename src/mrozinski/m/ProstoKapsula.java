package mrozinski.m;

public class ProstoKapsula {
    public static void main(String[] args){
        Prostokat kwadrat = new Prostokat();
        int a = 4;
        kwadrat.setWysokosc(a);
        kwadrat.setSzerokosc(a);
        System.out.println("Prostokąt o wymiarach " + kwadrat.getWysokosc() + " x " + kwadrat.getSzerokosc() +
                " ma pole równe " + kwadrat.getPole() + "j^2.");
    }
}
