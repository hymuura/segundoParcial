package bfs;

import java.util.ArrayList;
import java.util.List;

public class NodoBfs {
	private int data;
	private boolean visitado;
	private List<NodoBfs> listaAdy;
	
	public NodoBfs(int data){
		this.data=data;
		this.listaAdy = new ArrayList<>();
	}
	
	public void addNodo(NodoBfs n){
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

	public List<NodoBfs> getListaAdy() {
		return listaAdy;
	}

	public void setListaAdy(List<NodoBfs> listaAdy) {
		this.listaAdy = listaAdy;
	}
}
