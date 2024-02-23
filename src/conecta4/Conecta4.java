package conecta4;

public class Conecta4 {

	public static final int FILAS = 6; 
	public static final int COLUMNAS = 7; 
	
	private char panel[][];
	private int turno;
	
	public Conecta4() {
		
		turno = 1;
		panel = new char[FILAS][COLUMNAS];
		
		for(int i=0;i<FILAS;i++) {
			for(int j=0;j<COLUMNAS;j++) {
				
				panel[i][j] = ' ';
			}
		}
	}
	
	
	
	public boolean colocarFicha(int columna) {
		// TODO Auto-generated method stub
		return false;
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

}
