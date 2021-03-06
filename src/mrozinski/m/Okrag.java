package mrozinski.m;

public class Okrag extends Ksztalt implements Masa, Material{
    @Override
    void ksztInfo(String kszt) {
        System.out.println("jest to okrąg");
    }

    @Override
    public void twardosc() {
        System.out.println(4);
    }
    @Override
    public void powierzchnia(){
        System.out.println("matowa");
    }

    @Override
    public void masa() {
        System.out.println(5);
    }
}
