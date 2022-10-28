package br.edu.hendrick.main;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Matematica matematica1 = new OperacaoMatematica();
        
        matematica1.setA(2);
        matematica1.setB(20);
        
        
        
        ArrayList <Matematica> matematica = new ArrayList<>();
         matematica.add(matematica1);
         
        for(Matematica m : matematica){          
            m.Soma();
            System.out.println(m);
            m.Divisao();
            System.out.println(m);
            m.Multiplicacao();
            System.out.println(m);
            m.Subritacao();
            System.out.println(m);        
        }
    }
}
