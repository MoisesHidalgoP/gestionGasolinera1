package controlador;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sn = new Scanner(System.in);
		  boolean salir = false;
		  //Guardamos la información del usuario
		  int opcion;
		  
		  while(!salir) {
			  System.out.println("Repostaje normal");
			  System.out.println("Repostaje factura");
			  System.out.println("Ver todos los repostajes");
			  System.out.println("Importe total combustible vendido");
			  System.out.println("Llenado de depósito");
			  System.out.println("Eliminar último llenado de depósito");
			  System.out.println("Ver todos los llenados de depósito");
			  
			  System.out.println("Introduce una de las opciones: ");
			  opcion = sn.nextInt();
			  
			  try {
				  switch(opcion) {
				  case 1: 
					  System.out.println("Has seleccionado la opcion 1");
					  break;
				  case 2: 
					  System.out.println("Has seleccionado la opcion 2");
					  break;
				  case 3: 
					  System.out.println("Has seleccionado la opcion 3");
					  break;
				  case 4: 
					  System.out.println("Has seleccionado la opcion 4");
					  break;
				  case 5: 
					  System.out.println("Has seleccionado la opcion 5");
					  break;
				  case 6: 
					  System.out.println("Has seleccionado la opcion 6");
					  break;
				  case 7: 
					  System.out.println("Has seleccionado la opcion 7");
					  break;
				  case 8: 
					  System.out.println("Gracias por utilizar la aplicación");
					  salir = true;
					  
					  break;
					  
					  default:
						  System.out.println("Tiene que ser un número entre 1 y 7");
				  }
				  } catch (InputMismatchException e) {
		                System.out.println("Debes insertar un número");
		                sn.next();
		            }
				  
			  }
			  
			  
		  
			  
		  }
		  

	}


