
package excepciones;

import entidades.Persona;
import service.Servicio;
/*
Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8 Servicios, a null y tratar
de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código
con una cláusula try-catch para probar la nueva excepción que debe ser controlada.
*/
public class Excepciones {

    public static void main(String[] args) {
	Servicio personaServicio = new Servicio();
	try{
	personaServicio.crearPersona();
	}catch (Exception a){
	    System.out.println("Ingrese los datos conforme se solicita");
}


	Persona[] personas = new Persona[4];
	int[] resultadosIMC = new int[4];
	boolean[] mayoresDeEdad = new boolean[4];

	for (int i = 0; i < 4; i++) {
	    personas[i] = personaServicio.crearPersona();
	    resultadosIMC[i] = personaServicio.calcularIMC(personas[i]);
	    mayoresDeEdad[i] = personaServicio.esMayorDeEdad(personas[i]);
	}

	int porDebajoPeso = 0;
	int enPesoIdeal = 0;
	int conSobrepeso = 0;
	int cantidadMayoresDeEdad = 0;

	for (int i = 0; i < 4; i++) {
	    if (resultadosIMC[i] == -1) {
		porDebajoPeso++;
	    } else if (resultadosIMC[i] == 0) {
		enPesoIdeal++;
	    } else {
		conSobrepeso++;
	    }

	    if (mayoresDeEdad[i]) {
		cantidadMayoresDeEdad++;
	    }
	}

	System.out.printf("Porcentaje de personas por debajo del peso ideal: %.2f%%\n", (porDebajoPeso / 4.0) * 100);
	System.out.printf("Porcentaje de personas en su peso ideal: %.2f%%\n", (enPesoIdeal / 4.0) * 100);
	System.out.printf("Porcentaje de personas con sobrepeso: %.2f%%\n", (conSobrepeso / 4.0) * 100);
	System.out.printf("Porcentaje de personas mayores de edad: %.2f%%\n", (cantidadMayoresDeEdad / 4.0) * 100);
	System.out.printf("Porcentaje de personas menores de edad: %.2f%%\n", ((4 - cantidadMayoresDeEdad) / 4.0) * 100);
    }
}
