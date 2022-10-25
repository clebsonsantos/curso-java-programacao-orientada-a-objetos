import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Programa2 {
	public static void main(String[] args) {

		try {
			Scanner leitor = new Scanner(new FileReader("texto.txt"));
			while (leitor.hasNextLine()) {
				System.out.println(leitor.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!");
		}

	}

}
