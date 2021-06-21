/*Esta clase va a manejar el menpu y desde aca se va a manejar las
opciones para poder ejecutar o no el juego */

package Juego;

import java.util.Scanner; 
import Persona.VectorJugador;

public class Menu {

    //Declarando las variables que necesito 
    Scanner leer = new Scanner(System.in);
    private int opcion;
    boolean salir = false;
    VectorJugador parametroJugador = new VectorJugador();

    //Constructor de la clase
    public Menu(){

    }

    //Se hará el menú para iniciar con el juego

    public void iniciarMenu(){

        System.out.println("\n°♦°♦°♦° Bienvenido a Juego de Damas °♦°♦°♦°");
        System.out.println("1. Ingrese nickname de jugadores");
        System.out.println("2. Salir");
        System.out.println("\nEliga la opción que desee: ");
        opcion = leer.nextInt();
        leer.nextLine();

        switch (opcion) {
            case 1:
                nombreJugadores();
                mostrarNicknameJugadores();
                menuJugar();
                break;
            case 2:    
                salir = true;
                System.out.println("-|-|- Gracias -|-|-");
                break;    
        
            default:
            System.out.println("Opción no encontrada");
        }
    }

    private void menuJugar() {

        System.out.println("/°/°/ DAMAS /°/°/");
        System.out.println("1. Elegir quienes van a jugar ( ejempleo: 1 y 2)");
        System.out.println("2. Mostrar rendimiento de jugadores");
        opcion = leer.nextInt();
        leer.nextLine();

        switch (opcion) {
            case 1:
                playJuego();
                break;
            case 2:
                rendimientoJugadores();
                break;
            default:
            System.out.println("Opción no encontrada");  
        }
    }

    private void mostrarNicknameJugadores() {

        parametroJugador.mostrarJugadores();
        
    }

    private void rendimientoJugadores() {
    }

    private void playJuego() {

    }

    private void nombreJugadores() {

        parametroJugador.agregarJugador();
    }

}
