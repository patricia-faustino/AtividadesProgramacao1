package unicesumar.atividade1;


import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws DeltaException {

		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Digite o valor de a: ");
			int a = scanner.nextInt();
			
			System.out.println("Digite o valor de b: ");
			int b = scanner.nextInt();
			
			System.out.println("Digite o valor de c: ");
			int c = scanner.nextInt();
			
			ResolvendoBhaskara resolvendo = new ResolvendoBhaskara(a, b, c);
			
			resolvendo.resultado();
		}
		catch(DeltaException e) {
			System.out.println(e.getMessage());
		}

	}

}
