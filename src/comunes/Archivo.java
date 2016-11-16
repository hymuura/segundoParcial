package comunes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import rescatandoalaprincesa.LaberintoMagico;

public class Archivo {
	public static LaberintoMagico armarGrafoRescateDesdeArchivo(String path){
		File file = null;
		FileReader fr = null;
		BufferedReader br =null;
		LaberintoMagico lm = new LaberintoMagico();
		Grafo grafo;
		
		int[] posicionesDragones;
		try{
			file = new File(path);
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String linea = br.readLine();
			
			String primera[] = linea.split(" ");
			
			grafo = new Grafo(Integer.parseInt(primera[0]), false);
			
			int cantidadArcos = Integer.parseInt(primera[1]);
			int cantidadDragones = Integer.parseInt(primera[2]);
			posicionesDragones = new int[cantidadDragones];
			
			
			String linea3 = br.readLine();
			
			String tercera[] = linea3.split(" ");
			
			lm.setPosicionPrincesa(Integer.parseInt(tercera[0]));
			lm.setPosicionPrincipe(Integer.parseInt(tercera[1]));
			
			
			
			String linea2 = br.readLine();
			
			String segunda[] = linea2.split(" ");
			
			for(int x=0; x<cantidadDragones; x++){
				posicionesDragones[x]=Integer.parseInt(segunda[x]);
			}
			lm.setPosicionesDragones(posicionesDragones);

			
			for(int x=0; x<cantidadArcos; x++){
				String datos = br.readLine();
				String[] datosArcos = datos.split(" ");
				grafo.crearArco(Integer.parseInt(datosArcos[0]), Integer.parseInt(datosArcos[1]), Integer.parseInt(datosArcos[2]));
			}
			
			lm.setGrafo(grafo);
			fr.close();
			br.close();
		}catch(Exception e){
			
		}finally{
			
		}
		return lm;
	}
	
	public static void armarRespuestaRescateDesdeArchivo(String path, String respuesta){
		FileWriter fichero = null;
		PrintWriter pw = null;
		try{
			fichero = new FileWriter(path);
			pw = new PrintWriter(fichero);
			pw.println(respuesta);
			pw.close();
			fichero.close();
		}
		catch (Exception e) {
		    e.printStackTrace();
		} 

	}
}
