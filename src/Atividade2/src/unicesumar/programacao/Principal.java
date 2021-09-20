package unicesumar.programacao;

import unicesumar.business.PessoaBusiness;

public class Principal {

	public static void main(String[] args) {
		
        for (int i = 0; i < 12; i++) {
            if (i % 3 == 0) continue;
            if (i % 5 == 0) break;
            if (i % 7 == 0) continue;

            System.out.print(i + " ");
        }
	}
}
