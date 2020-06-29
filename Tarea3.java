package ejercicio7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea3 {
	public static String pais;
	public static String profesion;
	public static int riesgoPais;
	public static int riesgoProfesion;
	
	public static void validarRiesgoPais(String pais,boolean FiguraPolitica){
		if(pais.equals("Venezuela")||pais.equals("Colombia")
				|| pais.equals("Nicaragua") || pais.equals("Islas Caiman")) { 
			System.out.println(riesgoPais=3);
			System.out.println("Riesgo Alto");
		}
		
		else if(pais.equals("Argentina")||pais.equals("Brasil")
				||pais.equals("Rusia") ||pais.equals("China")) { 
			System.out.println(riesgoPais=2);
			System.out.println("Riesgo medio");
		}
		else if(FiguraPolitica == true) {
			riesgoPais=3;
			riesgoProfesion=3;
			System.out.println("Riesgo Alto");
		}
		else {
			System.out.println(riesgoPais=1);
			System.out.println("Riesgo bajo");
		}
	}
	public static void validarRiesgoProfesion(String profesion,boolean FiguraPolitica){
		if(profesion.equals("Abogado")||profesion.equals("Prestamista")) { 
			System.out.println(riesgoProfesion=3);
			System.out.println("Riesgo Alto");
		}
		else if(FiguraPolitica == true) {
			riesgoPais=3;
			riesgoProfesion=3;
			System.out.println("Riesgo Alto");
		}
		
		else if(profesion.equals("Médico")||profesion.equals("Informático")
				||profesion.equals("Contador")) { 
			System.out.println(riesgoProfesion=2);
			System.out.println("Riesgo medio");
		}
		else {
			System.out.println(riesgoProfesion=1);
			System.out.println("Riesgo bajo");
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		double porcentajepais=0.30;
		double porcentajeProfesion=0.70;
		double notaPais=0;
		double notaProfesion=0;
		double notaFinal=0;
		
		System.out.print("Digite el nombre : ");
		String nombre = reader.readLine();
		System.out.print("Digite la cedula : ");
		String cedula = reader.readLine();
		System.out.print("Digite la edad : ");
		int edad = Integer.parseInt(reader.readLine());
		System.out.print("Digite el pais : ");
		pais = reader.readLine();
		System.out.print("Digite la actividad economica : ");
		profesion = reader.readLine();
		System.out.print("Digite si es politico o no : ");
		Boolean FiguraPolitica = Boolean.parseBoolean(reader.readLine());
		//validar riesgo 
		
		validarRiesgoPais(pais,FiguraPolitica);
		System.out.println("riesgoPais: "+riesgoPais);
		validarRiesgoProfesion(profesion,FiguraPolitica);
		System.out.println("profesion: "+riesgoProfesion);
		notaPais=riesgoPais*porcentajepais;
		notaProfesion=riesgoProfesion*porcentajeProfesion;
		notaFinal=notaPais+notaProfesion;
		
		if(notaFinal > 2.0) {
			System.out.println("nota Final: "+notaFinal);
			System.out.println("Riesgo Alto");
		}else if(notaFinal > 1.0 && notaFinal == 2.0) {
			System.out.println("nota Final: "+notaFinal);
			System.out.println("Riesgo Medio");
		}
		else if(notaFinal == 1.0) {
			System.out.println("nota Final: "+notaFinal);
			System.out.println("Riesgo Bajo");
		}else {
			System.out.println("invalid option");
		}
		String[] cliente= {"Nombre: "+nombre,"Cedula: "+cedula,"Edad: "+Integer.toString(edad),"País: "+pais
				,"Profesion: "+profesion,"Es figura publica?: "+Boolean.toString(FiguraPolitica),"Nota Final: "+Double.toString(notaFinal)};
		for(int i=0; i<cliente.length;i++) {
			System.out.println(cliente[i]);
		}
	}

}
