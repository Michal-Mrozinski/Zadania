package mrozinski.m;

public class Square extends Figure {
    int edge;

    public Square(String color, int edge) {
        super(color);
        this.edge = edge;
    }
    public void infoFig(){
        System.out.println("Kwadrat");
    }
    public int area(){
        return edge * edge;
    }

    @Override
    public String toString() {
        return "square";
    }
}
