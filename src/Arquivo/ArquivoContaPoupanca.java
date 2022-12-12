package Arquivo;
import classe.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class ArquivoContaPoupanca {
    Scanner entrada = new Scanner(System.in);

    public ContaPoupanca Cadastrar(){
        ArquivoCliente arquivocliente = new ArquivoCliente();

        System.out.println("digite numero:");
        String numero = entrada.nextLine();
        System.out.println("digite credito:");
        Credito credito = new Credito(entrada.nextDouble());
        System.out.println("digite debito:");
        Debito debito = new Debito(entrada.nextDouble());
        Cliente cliente = arquivocliente.Cadastrar();
        ContaPoupanca contapoupanca = new ContaPoupanca(
                numero,
                cliente,
                credito,
                debito
        );
        return contapoupanca;
    }
}

