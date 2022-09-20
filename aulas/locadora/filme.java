package aulas.locadora;

class Filme {
  int codigo;

  String nome;

  double valor;

  boolean disponivel;

  void retirar() {
    mudarStatus(false);
  }

  void devolver() {
    mudarStatus(true);
  }

  void mudarStatus(boolean status) {
    disponivel = status;
  }
}

class Programa {
  public static void main(String[] args){
    Filme filme = new Filme();
    filme.codigo = 12;
    filme.nome = "A era do Gelo";
    filme.valor = 15.90;
    filme.retirar();
    
    if(filme.disponivel) {
      System.out.println("Filme disponível");
    } else {
      System.out.println("O filme não está disponível");
    }
    System.out.println(filme);
  }
}
