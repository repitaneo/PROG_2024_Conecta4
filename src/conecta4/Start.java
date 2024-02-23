package conecta4;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		Conecta4 conecta4 = new Conecta4();
		
		boolean hayGanador = false;
		int turno = 1;
		
		while(!hayGanador) {
			
			System.out.println("le toca a ["+turno+"]");
			System.out.println("elige columna:");
			int columna = teclado.nextInt();
			hayGanador = conecta4.colocarFicha(columna);
			conecta4.imprimirPanel();
			
			// turno = (turno==1)?2:1;
			if(turno==1) {
				turno=2;
			}
			else turno = 1;
		}
		
	}

	
	
}
