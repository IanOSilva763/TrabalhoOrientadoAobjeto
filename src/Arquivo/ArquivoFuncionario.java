package Arquivo;
import classe.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class ArquivoFuncionario {
    Scanner entrada = new Scanner(System.in);

    public Funcionario Cadastrar(){
        String nomedocargo;
        double salario;
        String cpf;
        String nome;
        String telefone;

        System.out.println("Nome do cargo:");
        nomedocargo = entrada.nextLine();
        System.out.println("seu cpf:");
        cpf = entrada.nextLine();
        System.out.println("seu salario:");
        salario = entrada.nextFloat();
        System.out.println("seu nome:");
        nome = entrada.nextLine();
        System.out.println("seu telefone:");
        telefone = entrada.nextLine();

        Cargo cargo = new Cargo(nomedocargo);
        Funcionario funcionario = new Funcionario(
                salario,
                cpf,
                nome,
                telefone,
                cargo
        );
        return funcionario;
    }

}
