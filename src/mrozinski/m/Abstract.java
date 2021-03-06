package mrozinski.m;

public class Abstract {
    public static void main(String[] args){
        Okrag ok = new Okrag();
        Kwadrat kwadrat = new Kwadrat();
        ok.ksztInfo("okrąg");
        kwadrat.ksztInfo("kwadrat");
        ok.powierzchnia();
        ok.masa();
        ok.twardosc();
    }
}
