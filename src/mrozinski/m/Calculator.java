package mrozinski.m;

public class Calculator {
    float x = 10.5f;
    float y = 23.8f;
    public float sum(){
       return x + y;
    }

    @Override
    public String toString() {
        return "Calculator{" + "1st value=" + x + '\'' +
                "2nd value=" + y + '\'' +
                "sum=" + sum();
    }
}
