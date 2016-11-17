package dfs;


public class App {
	public static void main(String[] args){
		NodoDfs nodo1 = new NodoDfs(1);
		NodoDfs nodo2 = new NodoDfs(2);
		NodoDfs nodo3 = new NodoDfs(3);
		NodoDfs nodo4 = new NodoDfs(4);
		NodoDfs nodo5 = new NodoDfs(5);
		
		nodo1.addNodo(nodo2);
		nodo1.addNodo(nodo3);
		nodo1.addNodo(nodo5);
		nodo3.addNodo(nodo4);
		
		DFS dfs = new DFS();
		dfs.dfs(nodo1);
	}
}
