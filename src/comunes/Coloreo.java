package comunes;

import java.util.ArrayList;

public class Coloreo {
	//Public Static Methods
	public static int Colorear(Grafo grafo){
		int cantidadColores = 0;
		int cantidadNodosColoreados = 0;		
		for (int indexOrigen=0; indexOrigen < grafo.getCantidadNodos(); indexOrigen++){
			if (grafo.getNodos()[indexOrigen].getColor() == 0){
				cantidadColores++;
				grafo.getNodos()[indexOrigen].setColor(cantidadColores);
				cantidadNodosColoreados++;
				ArrayList<Integer> nodosColoreadosEnIteracion = new ArrayList<Integer>(); 
				for (int indexDestino = indexOrigen+1; indexDestino < grafo.getCantidadNodos(); indexDestino++){
					if (grafo.getNodos()[indexDestino].getColor() == 0)
						if (!grafo.verificarAdyacencia(indexOrigen, indexDestino)){
							boolean esAdyacenteConOtroYaColoreado = false;
							for (Integer indexNodo : nodosColoreadosEnIteracion)
								if (grafo.verificarAdyacencia(indexDestino, indexNodo))
									esAdyacenteConOtroYaColoreado =  true;
							if (!esAdyacenteConOtroYaColoreado){
								cantidadNodosColoreados++;
								grafo.getNodos()[indexDestino].setColor(cantidadColores);
								nodosColoreadosEnIteracion.add(indexDestino);
							}					
						}
				}
			}
			if (cantidadNodosColoreados >= grafo.getCantidadNodos()) break;
		}		
		return cantidadColores;
	}
	public static void Descolorear(Grafo grafo){
		for (int i=0; i < grafo.getCantidadNodos(); i++)
			grafo.getNodos()[i].setColor(0);
	}
}
