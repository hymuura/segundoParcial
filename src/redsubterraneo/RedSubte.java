package redsubterraneo;

import java.util.ArrayList;

public class RedSubte {
	int estacionInicial;
	int estacionFinal;
	ArrayList<Subte> subtes;
	public RedSubte(){}
	public int getEstacionInicial() {
		return estacionInicial;
	}
	public void setEstacionInicial(int estacionInicial) {
		this.estacionInicial = estacionInicial;
	}
	public int getEstacionFinal() {
		return estacionFinal;
	}
	public void setEstacionFinal(int estacionFinal) {
		this.estacionFinal = estacionFinal;
	}
	public ArrayList<Subte> getSubtes() {
		return subtes;
	}
	public void setSubtes(ArrayList<Subte> subtes) {
		this.subtes = subtes;
	}
}
