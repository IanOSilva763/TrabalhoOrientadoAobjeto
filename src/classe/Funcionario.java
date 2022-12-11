package classe;
import java.util.Objects;
public class Funcionario extends Pessoa implements IUsuario{
    private double salario;

    private Cargo cargo;

    public Funcionario(){}
    public Funcionario(
            double salario,
            String cpf,
            String nome,
            String telefone,
            Cargo cargo
    ){
        this.salario = salario;
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.cargo = cargo;

    }

    public double getSalario() {
        return salario;
    }

    public boolean autenticar(){
        return true;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public Cargo getCargo() {
        return cargo;
    }
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return  "\n" + "salário:" +this.salario + "\n" + "CPF:" + this.cpf + "\n" + "nome:"+ this.nome + "\n" + "telefone:"+ this.telefone + "\n" + "cargo:"+ this.cargo.getNome() + "\n";
    }

    public boolean equals(Object myObject ) {
        if (this == myObject)return true;
        if (myObject == null || this.getClass() != myObject.getClass()) return false;
        Funcionario funcionario = (Funcionario) myObject;
        return Objects.equals(this.cpf, funcionario.cpf);
    }
    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }
}
