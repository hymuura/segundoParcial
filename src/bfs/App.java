package bfs;

public class App {
	
	
	
	public static void main(String[] args){
		NodoBfs nodo1 = new NodoBfs(1);
		NodoBfs nodo2 = new NodoBfs(2);
		NodoBfs nodo3 = new NodoBfs(3);
		NodoBfs nodo4 = new NodoBfs(4);
		NodoBfs nodo5 = new NodoBfs(5);
		
		nodo1.addNodo(nodo2);
		nodo1.addNodo(nodo3);
		nodo1.addNodo(nodo5);
		nodo4.addNodo(nodo3);
		nodo4.addNodo(nodo5);
		
		BFS bfs = new BFS();
		bfs.bfs(nodo1);
	}
	
}
