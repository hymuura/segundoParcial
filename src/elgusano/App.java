package elgusano;

import comunes.Archivo;
import comunes.Floyd;

public class App {
	public static void main(String[] args){
		String pathEntrada="C:\\Users\\Daniel\\Desktop\\prueba\\redes.txt";
		String pathSalida="C:\\Users\\Daniel\\Desktop\\prueba\\rescateResp.txt";
		RedesDeComputadoras rdc = Archivo.armarGrafoRedesDeComputadoras(pathEntrada);
		
		Floyd f = new Floyd(rdc.getGrafo());
		
		for(NodoGusano ng : rdc.getInfectadas()){
			for(int x=0; x<rdc.getGrafo().getCantidadNodos(); x++){
				if(f.obtenerCosto(ng.getData(), x)==ng.getInfectadoHora()){
					System.out.println("entramos: "+ng.getData());
					NodoGusano ngInfectador = new NodoGusano();
					ngInfectador.setData(x);
					rdc.getInfectadores().add(ngInfectador);
				}
			}
		}
		
		
		for(NodoGusano ng : rdc.getInfectadores()){
			System.out.println(ng.getData());
		}
	}
}
