package elgusano;

import java.util.ArrayList;

import comunes.Grafo;
import comunes.Nodo;

public class RedesDeComputadoras {
	private Grafo grafo;
	private ArrayList<NodoGusano> infectadas;
	private ArrayList<NodoGusano> infectadores;
	
	public RedesDeComputadoras(){
		infectadas = new ArrayList<>();
		infectadores = new ArrayList<>();
	}

	public Grafo getGrafo() {
		return grafo;
	}

	public void setGrafo(Grafo grafo) {
		this.grafo = grafo;
	}

	public ArrayList<NodoGusano> getInfectadas() {
		return infectadas;
	}

	public void setInfectadas(ArrayList<NodoGusano> infectadas) {
		this.infectadas = infectadas;
	}

	public ArrayList<NodoGusano> getInfectadores() {
		return infectadores;
	}

	public void setInfectadores(ArrayList<NodoGusano> infectadores) {
		this.infectadores = infectadores;
	}

	
}
