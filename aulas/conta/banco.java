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

  void transferir(Conta contaDestino, double valor) {
    saldo -= valor;
    contaDestino.saldo += valor;
  }

}

class Banco {

  public static void main(String[] args){
    Conta conta = new Conta();
    conta.codigo = 251;
    conta.saldo = 500;
    conta.titular = "Clebson";
    conta.sacar(200.05);

    if(conta.sacar(600.05)) {
      System.out.println("Operaçao realizada com sucesso!");
    } else {
      System.out.println("Ocorreu um erro durante a operação!");
    }
    System.out.println(conta.saldo);

    conta.depositar(700.05);
    System.out.println(conta.saldo);

    Conta conta2 = new Conta();
    conta2.codigo = 251;
    conta2.saldo = 8000;
    conta2.titular = "Fábio";

    conta.transferir(conta2, 800);

    System.out.println(conta.saldo);
    System.out.println(conta2.saldo);


  }
}
