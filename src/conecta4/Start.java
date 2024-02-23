package conecta4;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		Conecta4 conecta4 = new Conecta4();
		
		boolean hayGanador = false;
		
		while(!hayGanador) {
			
			System.out.println("le toca a "+conecta4.getTurno());
			System.out.println("elige columna:");
			
			int columna = teclado.nextInt();
			if(columna>=0 && columna<Conecta4.COLUMNAS) {
			
				hayGanador = conecta4.colocarFicha(columna);
				conecta4.imprimirPanel();
			}
		}
		
	}

	
	
}
