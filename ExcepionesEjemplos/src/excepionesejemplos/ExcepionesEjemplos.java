
package excepionesejemplos;

import java.util.Scanner;


public class ExcepionesEjemplos {

   /*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
*/
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
	
	try{
	Integer [] valores = {1,5 ,8,9,6,12};

	   System.out.print("en la posicion 7 está el número= " + valores [7]);
	   }catch(ArrayIndexOutOfBoundsException a){
	    System.out.println("Ingrese una posición correcta");
	    
	  
}  
        int a,b;
        a = devolverentero();
        b = devolverentero();
        try {
         //   System.out.println("El resultado de la division es: " + dn.division(a,b));
            
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir un numero por 0 " + e.getMessage());
        } 
 
    }
    public static Integer devolverentero(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        boolean valido = false;
        Integer n1=0;
        do {
        System.out.println("Ingrese 1 numeros");
        try {
            String  num1 = sc.next();
            n1 = Integer.parseInt(num1);
            valido = true;
        } catch (ClassCastException e) {
            System.out.println("No ingresa un numero entero " + e.getMessage());
            
        } catch (NumberFormatException e) {
            System.out.println("Ingreso un caracter invalido " + e.getMessage());
            
       /// } catch (InputMismatchException e) {  
            //al ser String toma todos los datos y no sale este error puede ocurrir al ingresar 
            // un string cuando se solicita un numero
           System.out.println("El elemento recibido no corresponde al tipo de dato ingresado " + e);
           // se usa un nuevo scanner para que no quede en un bucle
           //sc = new Scanner(System.in);
        }
        } while (!valido);
        return n1;
        
    }
     }
   
   
    

