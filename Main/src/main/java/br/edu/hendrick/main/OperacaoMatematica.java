package br.edu.hendrick.main;

public  class OperacaoMatematica extends Matematica {      
    @Override
    public void Soma() {
      super.setA(super.getA());
      super.setB(super.getB());   
      super.setResult(super.getA() + super.getB());
 
    }

    @Override
    public void Divisao() {
      super.setA(super.getA());
      super.setB(super.getB());   
      super.setResult(super.getA() / super.getB());
    }

    @Override
    public void Multiplicacao() {
      super.setA(super.getA());
      super.setB(super.getB());   
      super.setResult(super.getA() * super.getB());
    }

    @Override
    public void Subritacao() {
      super.setA(super.getA());
      super.setB(super.getB());   
      super.setResult(super.getA() - super.getB());
        
    }
}
