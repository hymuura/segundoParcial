package bfs;

import java.util.LinkedList;
import java.util.Queue;

import comunes.Nodo;

public class BFS {

	public void bfs(NodoBfs raiz){
		Queue<NodoBfs> queue = new LinkedList<>();
		
		raiz.setVisitado(true);
		
		queue.add(raiz);
		
		while(!queue.isEmpty()){
			NodoBfs nodoActual = queue.remove();
			System.out.println(nodoActual.getData()+"-");
			
			for(NodoBfs nodoHijo : nodoActual.getListaAdy()){
				if(!nodoHijo.isVisitado()){
					nodoHijo.setVisitado(true);
					queue.add(nodoHijo);
				}
			}
			
		}
	}
}
