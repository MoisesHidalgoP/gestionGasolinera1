package controlador;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import dal.repostajeGasolinera;
import dal.repostajeVehiculo;



@Controller
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("contexto.xml"); 
		 consultas.consultas consulta = context.getBean(consultas.consultas.class);
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
					  consulta.insertarUnRepostajeNormal(new repostajeGasolinera(2,"sbhu",50.00));
					  System.out.println("Ah repostado usted 50 euros");
				  case 2: 
					  System.out.println("Has seleccionado la opcion 2");
					  consulta.insertarUnRepostajeVehiculo(new repostajeVehiculo(3,"euibh","6534839-P","64756-KHG",100.00));
					  
					  break;
				  case 3: 
					  System.out.println("Has seleccionado la opcion 3");
					  consulta.verTodosRepostajes().toString();
					  consulta.verTodosRepostajesGasolinera().toString();
					  System.out.println(consulta.verTodosRepostajes());
					  System.out.println(consulta.verTodosRepostajesGasolinera());
					  
					  break;
				  case 4: 
					  System.out.println("Has seleccionado la opcion 4");
					  
					  break;
				  case 5: 
					  System.out.println("Has seleccionado la opcion 5");
					  consulta.llenarDeposito(new repostajeGasolinera(3,"Camion1",(double) 500));
					  break;
				  case 6: 
					  System.out.println("Has seleccionado la opcion 6");
					  break;
				  case 7: 
					  System.out.println("Has seleccionado la opcion 7");
					  consulta.listaLlenadoDeposito().toString();
					  System.out.println(consulta.listaLlenadoDeposito());
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


