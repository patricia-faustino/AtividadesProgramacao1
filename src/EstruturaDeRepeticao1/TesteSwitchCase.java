/**
 * 
 */
package EstruturaDeRepeticao1;

import java.util.Scanner;

/**
 * @author patricia.faustino
 *
 */
public class TesteSwitchCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new TesteSwitchCase().caso2 ();

	}

	public void caso1() {
		System.out.println("Digigte uma das op��es abaixo.");
		System.out.println("1: COMPRAR; 2:VENDER; 3: LISTAR; 4. SAIR.");
		Scanner scan = new Scanner(System.in);
		int opcao = scan.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("VOC� ACESSOU COMPRAR.");
			break;
		case 2:
			System.out.println("VOC� ACESSOU VENDER.");
			break;
		case 3:
			System.out.println("VOC� ACESSOU LISTAR.");
			break;
		case 4:
			System.out.println("VOC� ACESSOU SAIR.");
			break;
		default:
			System.out.println("OP��O INV�LIDA.");
			break;
		}
	}

	public void caso2() {
		System.out.println("Digigte uma das op��es abaixo.");
		System.out.println("1: COMPRAR; 2:VENDER; 3: LISTAR; 4. SAIR.");
		Scanner scan = new Scanner(System.in);
		int opcao = scan.nextInt();

		if (opcao == 1) {
			System.out.println("VOC� ACESSOU COMPRAR.");
		} else if (opcao == 2) {
			System.out.println("VOC� ACESSOU VENDER.");
		} else if (opcao == 3) {
			System.out.println("VOC� ACESSOU LISTAR.");
		}

		else if (opcao == 4) {
			System.out.println("VOC� ACESSOU SAIR.");
		} else {
			System.out.println("OP��O INV�LIDA.");
		}

	}

}
