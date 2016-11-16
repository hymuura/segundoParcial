package comunes;


//Solo NO DIRIGIDOS
public class Floyd {
	//Attributes
	private Grafo grafo;
	private int[][][] arcos;
	
	//Constructors
	public Floyd(Grafo grafo){
		this.grafo = grafo;
		this.arcos = new int[grafo.getCantidadNodos()][grafo.getCantidadNodos()][2];
						
		for (int i=0; i<grafo.getCantidadNodos(); i++)
			for (int j=0; j<grafo.getCantidadNodos(); j++){
				if (grafo.obtenerCosto(i, j) != 0){
					this.arcos[i][j][0] = grafo.obtenerCosto(i, j);
					this.arcos[j][i][0] = grafo.obtenerCosto(j, i);
				}
				else{
					this.arcos[i][j][0] = 1000;
					this.arcos[j][i][0] = 1000;
				}
				this.arcos[i][j][1] = i;
				this.arcos[j][i][1] = j;
			}	
		
		for (int i=0; i<grafo.getCantidadNodos(); i++)
			this.arcos[i][i][0] = 0;
		
		
		
		int i, j, k;
		for (i = 0; i < grafo.getCantidadNodos(); i++) {
			for (j = 0; j < grafo.getCantidadNodos(); j++) {
				for (k = 0; k < grafo.getCantidadNodos(); k++) {
					if (this.arcos[i][k][0] + this.arcos[k][j][0] < this.arcos[i][j][0]) {
						this.arcos[i][j][0] = this.arcos[i][k][0] + this.arcos[k][j][0];
						this.arcos[i][j][1] = k;
					}
				}
			}
		}
	}
	
	//Public Methods
	public String obtenerCamino(int nodoOrigen, int nodoDestino) {
		if (nodoDestino > nodoOrigen)
		{
			int aux = nodoOrigen;
			nodoOrigen = nodoDestino;
			nodoDestino = aux;
		}
		String camino = "";	
		if (nodoOrigen == nodoDestino) {
			camino = this.grafo.getNodos()[nodoOrigen].getEtiqueta();
		} else {
			camino = obtenerCamino(nodoOrigen, this.arcos[nodoOrigen][nodoDestino][1]) + "->"
					+ this.grafo.getNodos()[nodoDestino].getEtiqueta();
		}
		return camino;
	}
	public int obtenerCosto(int nodoOrigen, int nodoDestino) {
		return this.arcos[nodoOrigen][nodoDestino][0];
	}
}
