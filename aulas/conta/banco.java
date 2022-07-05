package aulas.conta;

class Conta {
  int codigo;
  double saldo;
  String titular;

  void sacar(double valor){
    saldo -= valor;
  }
  void depositar(double valor){
    saldo += valor;
  }

}

class ProgramaBanco {
  public static void main(String[] args){
    Conta conta = new Conta();
    conta.codigo = 251;
    conta.saldo = 500;
    conta.titular = "Clebson";

    conta.sacar(200.05);
    System.out.println(conta.saldo);

    conta.depositar(700.05);
    System.out.println(conta.saldo);
  }
}
