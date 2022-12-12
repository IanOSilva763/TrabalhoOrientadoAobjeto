package Arquivo;
import classe.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class ArquivoConta {
    Scanner entrada = new Scanner(System.in);

    public Conta Cadastrar(){
        ArquivoCliente arquivocliente = new ArquivoCliente();

        System.out.println("digite numero:");
        String numero = entrada.nextLine();
        System.out.println("digite cliente:");
        Cliente cliente = arquivocliente.Cadastrar();
        System.out.println("digite credito:");
        Credito credito = new Credito(entrada.nextDouble());
        System.out.println("digite debito:");
        Debito debito = new Debito(entrada.nextDouble());

        Conta conta = new Conta(
                numero,
                cliente,
                credito,
                debito
        );
        return conta;
    }

}

