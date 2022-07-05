package aulas;
class LacosRepeticao {
  public static void main(String[] args){
    int i;
    for(i = 0; i < 10; i++){
      System.out.println("Laço encerrou ");
    }
    int j = 0;
    while (j < 10) {
      System.out.println("Laço encerrou aqui também");
      j++;
      
    }

    int k = 0;
    do{
      System.out.println(k + " ao quadrado é " + (k*k));
      k++;
    }while(k < 100);
  }
}
