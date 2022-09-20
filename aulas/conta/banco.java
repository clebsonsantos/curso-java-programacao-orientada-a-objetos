package aulas.conta;

class Conta {
  int codigo;
  double saldo;
  String titular;

  boolean sacar(double valor){
    if (saldo >= valor) {
      saldo -= valor;
      return true;
    } else {
      return false;
    }
  }
  void depositar(double valor){
    saldo += valor;
  }

  boolean transferir(Conta contaDestino, double valor) {
    if (saldo >= valor) {
      saldo -= valor;
      contaDestino.saldo += valor;
      return true;
    } else {
      return false;
    }
  }

}
class Funcionario {
  String nome;
  String departamento;
  double salario;
  String dataDeEntrada;
  String rg;
  boolean estaNaEmpresa;
}

class Banco {

  public static void main(String[] args){
    Conta conta = new Conta();
    conta.codigo = 251;
    conta.saldo = 500;
    conta.titular = "Clebson";
    conta.sacar(200.05);

    if(conta.sacar(600.05)) {
      System.out.println("Saque realizada com sucesso!");
    } else {
      System.out.println("Ocorreu um erro durante o saque!");
    }
    System.out.println(conta.saldo);

    conta.depositar(700.05);
    System.out.println(conta.saldo);

    Conta conta2 = new Conta();
    conta2.codigo = 251;
    conta2.saldo = 8000;
    conta2.titular = "Fábio";

    if (conta.transferir(conta2, 800)) {
      System.out.println("Transferencia realizada com sucesso");
    } else {
      System.out.println("Transferencia falhou");
    }

    System.out.println(conta.saldo);
    System.out.println(conta2.saldo);
    System.out.println("======================== Fucionario ================================");

    Funcionario funcionario = new Funcionario();
    funcionario.nome = "Clebson";
    funcionario.departamento = "TI";
    funcionario.salario = 9000.0;
    funcionario.dataDeEntrada = "25/10/1996";
    funcionario.rg = "1545545";
    funcionario.estaNaEmpresa = true;
    System.out.println(funcionario.toString());
  }
}
