package Arquivo;
import classe.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class ArquivoCliente {
    Scanner entrada = new Scanner(System.in);
    public Cliente Cadastrar(){
        ArquivoEndereco arquivoendereco = new ArquivoEndereco();
        String cpf;
        String nome;
        String telefone;
        List <Endereco>  endereco = new ArrayList<>();
        System.out.println("escreva seu cpf:");
        cpf = entrada.nextLine();
        System.out.println("escreva seu nome:");
        nome = entrada.nextLine();
        System.out.println("escreva seu telefone:");
        telefone = entrada.nextLine();
        int Option;

        do{
            endereco.add(arquivoendereco.Cadastrar());
            System.out.println("\n1.Adicionar endereco. \n0. Sair");
            Option = entrada.nextInt();
        }while (Option != 0);




        Cliente cliente = new Cliente(
                cpf,
                nome,
                telefone,
                true,
                endereco
        );
        return cliente;

    }


}

