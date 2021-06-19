package Persona;

import java.util.Scanner;

public class VectorJugador {
    
    //Defino las variables a utilizar en general y metodos
    private Jugador[] jugadores = new Jugador[10];
    private int contadorJugador;
    Scanner leer = new Scanner(System.in);

    //Constructor
    public VectorJugador(){
        contadorJugador= 1;
    }

    //Agregamos peliculas

    public void agregarJugador(String nickname, int numeroJugador){
       
    }

    public void agregarJugador(){

        System.out.println("\nIngrese la cantidad de jugadores (no mayor de 10 jugadores)");
        contadorJugador= leer.nextInt();
        leer.nextLine();

        for (int i = 0; i < contadorJugador; i++) {
        System.out.println("\n« « « Jugador "+(i+1) +"» » »");
        String nickname = IngresoDatos.getTexto("Ingrese nickname");
        int numeroJugador = IngresoDatos.getEntero("Ingrese el número de jugador", false);
        agregarJugador(nickname, numeroJugador);
    }
}


    //Mostramos los datos recibidos

    public void mostrarPeliculas(){

        System.out.println("\n\n Jugadores");
        for (int i = 0; i < (contadorJugador-1); i++) {
        System.out.println("-"+i+") "+jugadores[i].getInformacion());
        }

        System.out.println("\n\n");
    }


}
