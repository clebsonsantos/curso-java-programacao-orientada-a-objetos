package aulas.polimorfismoheranca;


public class Enfermeiro extends Pessoa{
  int horaTrabalho;
  String setor;
  String numeroCadastro;

  Enfermeiro(int horaTrabalho, String setor, String numeroCadastro, String nome, int idade, String documento) {
    super(nome, idade, documento);
    this.horaTrabalho = horaTrabalho;
    this.setor = setor;
    this.numeroCadastro = numeroCadastro;
  }

  public void imprimirInfo(){
    super.imprimirInfo();
    System.out.println("Hora de trabalho: " + this.horaTrabalho);
    System.out.println("Setor: " + this.setor);
    System.out.println("Numero de Cadastro: " + this.numeroCadastro);
  }
  
}