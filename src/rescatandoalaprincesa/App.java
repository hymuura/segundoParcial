package rescatandoalaprincesa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import comunes.Archivo;
import comunes.Coloreo;
import comunes.Dijkstra;
import comunes.Nodo;

public class App {
	public static void main(String[] args){
		
		int[] costoDragones;
		int costoPrincipe;
		boolean debug = true;
		String pathEntrada="C:\\Users\\Daniel\\Desktop\\prueba\\rescate.txt";
		String pathSalida="C:\\Users\\Daniel\\Desktop\\prueba\\rescateResp.txt";
		
		LaberintoMagico lm = Archivo.armarGrafoRescateDesdeArchivo(pathEntrada);
		
		System.out.println(Coloreo.Colorear(lm.getGrafo()));
		
		Dijkstra dij = new Dijkstra(lm.getGrafo(), lm.getPosicionPrincesa());
		
		if(debug){
			System.out.println("Principe costo: "+dij.obtenerCosto(lm.getPosicionPrincipe()));
			for(Nodo n : dij.obtenerCamino(lm.getPosicionPrincipe())){
				System.out.println(n.getEtiqueta());
			}
			for(int x =0; x<lm.getPosicionesDragones().length;x++){
				System.out.println("Dragon numero "+(x+1)+" costo: "+dij.obtenerCosto(lm.getPosicionesDragones()[x]));
				for(Nodo n : dij.obtenerCamino(lm.getPosicionesDragones()[x])){
					System.out.println(n.getEtiqueta());
				}
			}
		}
		
		
		
		
		costoPrincipe=dij.obtenerCosto(lm.getPosicionPrincipe());
		
		if(costoPrincipe==Integer.MAX_VALUE){
			Archivo.armarRespuestaRescateDesdeArchivo(pathSalida, "No hay camino");
		}
		
		
		costoDragones = new int[lm.getPosicionesDragones().length];
		
		
		
		for(int x =0; x<lm.getPosicionesDragones().length;x++){
			costoDragones[x]=dij.obtenerCosto(lm.getPosicionesDragones()[x]);
		}
		
		boolean sigueEnJuego=true;
		for(int x=0;x<costoDragones.length && sigueEnJuego;x++){
			if(costoPrincipe>=costoDragones[x]){
				Archivo.armarRespuestaRescateDesdeArchivo(pathSalida, "Interceptado");
				sigueEnJuego=false;
			}
		}
		
		if(sigueEnJuego){
			String respuesta = "";
			for(Nodo n : dij.obtenerCamino(lm.getPosicionPrincipe())){
				respuesta=n.getEtiqueta()+" "+respuesta;
			}
			Archivo.armarRespuestaRescateDesdeArchivo(pathSalida, respuesta);
		}
		
	}
}
