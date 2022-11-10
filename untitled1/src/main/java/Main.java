import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Funcionario funcionarioD = new Diretor();
        Funcionario funcionarioE = new Estagiario();
        Funcionario funcionarioDe = new Desenvolvedor();

        funcionarioD.setNome("Jose");
        funcionarioD.setSalario(1000.00);

        funcionarioDe.setNome("Han Tonio");
        funcionarioDe.setSalario(1000.00);

        funcionarioE.setNome("Marco");
        funcionarioE.setSalario(1000.00);

        ArrayList<Funcionario> funcionarios = new ArrayList<>();
         funcionarios.add(funcionarioD);
         funcionarios.add(funcionarioDe);
         funcionarios.add(funcionarioE);

        for(Funcionario f : funcionarios){
            f.aumentaSalario();
            System.out.println(f);

        }
    }
}
