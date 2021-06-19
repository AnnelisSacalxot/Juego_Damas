/*Esta clase va a manejar el menpu y desde aca se va a manejar las
opciones para poder ejecutar o no el juego */

package Juego;

import java.util.Scanner;

public class Menu {

    //Declarando las variables que necesito 
    Scanner leer = new Scanner(System.in);
    private int opcion;
    boolean salir = false;

    //Constructor de la clase
    public Menu(){

    }

    //Se hará el menú para iniciar con el juego

    public void iniciarMenu(){

        System.out.println("°♦°♦°♦° Bienvenido a Juego de Damas °♦°♦°♦°");
        System.out.println("1. Ingrese nickname de jugadores");
        System.out.println("2. Salir");
        System.out.println("\nEliga la opción que desee: ");
        opcion = leer.nextInt();
        leer.nextLine();

        switch (opcion) {
            case 1:
                
                break;
            case 2:    
                salir = true;
                System.out.println("-|-|- Gracias -|-|-");
                break;    
        
            default:
            System.out.println("Opción no encontrada");
        }
    }

}
