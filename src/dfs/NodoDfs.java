package dfs;

import java.util.ArrayList;
import java.util.List;

public class NodoDfs {
	private int data;
	private boolean visitado;
	private List<NodoDfs> listaAdy;
	private NodoDfs nodoPadre;
	
	public NodoDfs(int data){
		this.data=data;
		this.listaAdy = new ArrayList<>();
	}
	
	public void addNodo(NodoDfs n){
		this.listaAdy.add(n);
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public boolean isVisitado() {
		return visitado;
	}

	public void setVisitado(boolean visitado) {
		this.visitado = visitado;
	}

	public List<NodoDfs> getListaAdy() {
		return listaAdy;
	}

	public void setListaAdy(List<NodoDfs> listaAdy) {
		this.listaAdy = listaAdy;
	}

	public NodoDfs getNodoPadre() {
		return nodoPadre;
	}

	public void setNodoPadre(NodoDfs nodoPadre) {
		this.nodoPadre = nodoPadre;
	}
	
	
}
