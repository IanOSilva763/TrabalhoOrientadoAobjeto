package Arquivo;
import classe.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class ArquivoContaCorrente {
    Scanner entrada = new Scanner(System.in);

    public ContaCorrente Cadastrar(){
        ArquivoCliente arquivocliente = new ArquivoCliente();

        System.out.println("digite limite:");
        double limite = entrada.nextDouble();
        System.out.println("digite numero:");
        String numero = entrada.nextLine();
        System.out.println("digite credito:");
        Credito credito = new Credito(entrada.nextDouble());
        System.out.println("digite debito:");
        Debito debito = new Debito(entrada.nextDouble());
        Cliente cliente = arquivocliente.Cadastrar();
        ContaCorrente contacorrente = new ContaCorrente(
                limite,
                numero,
                cliente,
                credito,
                debito
        );
        return contacorrente;
    }

}



