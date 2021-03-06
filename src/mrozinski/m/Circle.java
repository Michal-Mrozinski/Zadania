package mrozinski.m;

public class Circle extends Figure{
    int radius;
    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }
    public double area(){
        return (radius * radius) * 3.14;
    }
    public void infoFig() {
        System.out.println("Okrąg");
    }
    @Override
    public String toString(){
        return "Okrąg";
    }
}
