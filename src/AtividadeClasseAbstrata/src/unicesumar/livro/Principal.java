package unicesumar.livro;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int opcao;
		DVD dvd;
		CDS cds;
		
		while(true) {
			System.out.println(" ");
			System.out.println("-------------------------------");
			System.out.println("Digite 0 para SAIR ou a opção abaixo: ");
			System.out.println("1 - CADASTRAR DVD  "
					+ " 2 - EMPRESTAR DVD "
					+ " 3 - DEVOLVER DVD "
					+ " 4 - CADASTRAR CDS"
					+ " 5 - VENDER CD  "
					+ " 6 - IMPRIMIR CDS");
			System.out.println("Opção: ");
			
			Scanner scan = new Scanner(System.in);
			opcao = scan.nextInt();
			System.out.println("-------------------------------");
			System.out.println(" ");
			if(opcao == 0)
				System.exit(0);
			switch (opcao) {
			case 1: 
				dvd = DVD.getInstance();
				dvd.cadastrar();
				break;
			case 2: 
				dvd = DVD.getInstance();
				dvd.emprestar();
				break;
			case 3: 
				dvd = DVD.getInstance();
				dvd.devolver();
				break;
			case 4: 
				cds = CDS.getInstance();
				cds.cadastrar();
				break;
				
			case 5: 
				cds = CDS.getInstance();
				cds.vender();
				break;
			case 6: 
				cds = CDS.getInstance();
				cds.imprimir();
				break;
			}

		}
	}

}
