package dfs;

import java.util.Stack;


public class DFS {

	public void dfs(NodoDfs raiz){
		Stack<NodoDfs> pila = new Stack<>();
		
		pila.add(raiz);
		
		raiz.setVisitado(true);
		
		while(!pila.isEmpty()){
			NodoDfs nodoActual = pila.pop();
			System.out.println(nodoActual.getData()+"-");
			
			for(NodoDfs nodoHijo : nodoActual.getListaAdy()){
				if(!nodoHijo.isVisitado()){
					nodoHijo.setVisitado(true);
					pila.add(nodoHijo);
				}
			}
			
		}
	}

}
