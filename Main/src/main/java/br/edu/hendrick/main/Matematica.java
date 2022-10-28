package br.edu.hendrick.main;

public abstract class Matematica {  
    private int a;
    private int b;
    int result;

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }

    public void setResult(int result) {
        this.result = result;
    }
    
    public int getResult() {
        return result;
    }
    
    
    public abstract void Soma();
    public abstract void Divisao();
    public abstract void Multiplicacao();
    public abstract void Subritacao();

    @Override
    public String toString() {
        return "Matematica{" + "a=" + a + ", b=" + b + ", result=" + result + '}';
    }

    
    
   
}
