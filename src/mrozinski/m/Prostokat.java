package mrozinski.m;

public class Prostokat {
    public int getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(int wysokosc) {
        this.wysokosc = wysokosc;
    }

    private int wysokosc;

    public int getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(int szerokosc) {
        this.szerokosc = szerokosc;
    }

    private int szerokosc;
    private int pole(){
        return wysokosc * szerokosc;
    }
    public int getPole(){
        return pole();
    }

}
