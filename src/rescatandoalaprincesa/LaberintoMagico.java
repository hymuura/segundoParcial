package rescatandoalaprincesa;

import comunes.Grafo;

public class LaberintoMagico {
	int posicionPrincipe;
	int posicionPrincesa;
	int[] posicionesDragones;
	Grafo grafo;
	
	public LaberintoMagico(){
		
	}

	public int getPosicionPrincipe() {
		return posicionPrincipe;
	}

	public void setPosicionPrincipe(int posicionPrincipe) {
		this.posicionPrincipe = posicionPrincipe;
	}

	public int getPosicionPrincesa() {
		return posicionPrincesa;
	}

	public void setPosicionPrincesa(int posicionPrincesa) {
		this.posicionPrincesa = posicionPrincesa;
	}

	public int[] getPosicionesDragones() {
		return posicionesDragones;
	}

	public void setPosicionesDragones(int[] posicionesDragones) {
		this.posicionesDragones = posicionesDragones;
	}

	public Grafo getGrafo() {
		return grafo;
	}

	public void setGrafo(Grafo grafo) {
		this.grafo = grafo;
	}
	
	
}
