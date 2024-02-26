package conecta4;

public class Conecta4 {

	public static final int FILAS = 6; 
	public static final int COLUMNAS = 7; 
	
	private char panel[][];
	private int turno;
	private int dondeFichas[];
	
	public Conecta4() {
		
		turno = 1;
		panel = new char[FILAS][COLUMNAS];
		
		for(int i=0;i<FILAS;i++) {
			for(int j=0;j<COLUMNAS;j++) {
				
				panel[i][j] = ' ';
			}
		}
		
		dondeFichas = new int[COLUMNAS];
		for(int j=0;j<COLUMNAS;j++) {
			
			dondeFichas[j] = 5;
		}
		
	}
	
	
	
	public boolean colocarFicha(int columna) {

		int fila = dondeFichas[columna];
		if(fila>-1 && columna>=0 && columna<COLUMNAS) {

			// disminuyo donde va la siguiente ficha en esa columna
			dondeFichas[columna]--;
			// establezco la ficha que toca
			char ficha = (turno==1)?'X':'O';
			// cambio el turno
			turno = (turno==1)?2:1;
			// coloco la ficha
			panel[fila][columna] = ficha;
			
			return hayGanadorVertical(fila,columna);
		}
		return false;
	}

	
	
	
	
	
	
	private boolean hayGanadorVertical(int fila, int columna) {
		
		int contador = 0;
		
		if(fila<3) {
			char ficha = panel[fila][columna];
			
			for(int i=0;i<3;i++) {
				if(panel[fila+1+i][columna]==ficha) {
					contador++;
				}
			}
		}
		return contador==3;
	}


	
	
	
	

	public void imprimirPanel() {
		
		System.out.print("\n");

		for(int i=0;i<FILAS;i++) {
			for(int j=0;j<COLUMNAS;j++) {
				
				System.out.print(panel[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int j=0;j<COLUMNAS;j++) {
			
			System.out.print(j+" ");
		}
		
		System.out.println("\n");
	}


	
	
	

	public String getTurno() {

		if(turno==1) {
			
			return "X";
		}
		else return "O";
	}

}
