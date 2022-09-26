package aulas.polimorfismoheranca;

public class Principal {
  public static void main(String[] args) {
    Pessoa paciente = new Paciente("123", "Bradesco", "Clebson", 26, "12356516");
    paciente.imprimirInfo();

    System.out.println("\n=====================================\n");

    Pessoa enfermeiro = new Enfermeiro(2, "UTI", "88887", "Luccas", 26, "8889897");
    enfermeiro.imprimirInfo();

  }
}
