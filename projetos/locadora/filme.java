class Filme {
  int codigo;
  String nome;
  double valor;
}

class Programa {
  public static void main(String[] args){
    Filme filme = new Filme();
    filme.codigo = 12;
    filme.nome = "A era do Gelo";
    filme.valor = 15.90;
    System.out.println(filme); 
  }
}