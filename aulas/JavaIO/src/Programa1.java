import java.util.Scanner;

public class Programa1 {
	public static void main(String[] args) {

		try (Scanner teclado = new Scanner(System.in)) {
			String nome = teclado.next();

			System.out.println(nome);
		}

	}
}
