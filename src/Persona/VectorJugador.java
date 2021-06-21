package Persona;

import java.util.Scanner;
import Persona.Jugador;

public class VectorJugador {
    
    //Defino las variables a utilizar en general y metodos
    private Jugador[] jugadores = new Jugador[10];
    private int contadorJugador;
    Scanner leer = new Scanner(System.in);
   // private String nickname;

    //Constructor
    public VectorJugador(){
        contadorJugador= 1;
    }

    //Agregamos peliculas

    public void agregarJugador(String nickname){
       
    }

    public void agregarJugador(){

        System.out.println("\nIngrese la cantidad de jugadores (no mayor de 10 jugadores)");
        contadorJugador= leer.nextInt();
        leer.nextLine();

        if (contadorJugador <= 10) {
            for (int i = 0; i < contadorJugador; i++) {
                System.out.println("\n« « « Jugador "+(i+1) +"» » »");
                String nickname = IngresoDatos.getTexto("Ingrese nickname");
                agregarJugador(nickname); 
                jugadores[(contadorJugador-1)] = new Jugador(nickname);
        } 

    } else {
       if (contadorJugador > 10) {
           System.out.println("El número de jugadores se excede");
       }
    }
    contadorJugador++;
}


    //Mostramos los datos recibidos

    public void mostrarJugadores(){
        System.out.println("\n\n Jugadores");
        for (int i = 0; i < (contadorJugador-1); i++) {
        System.out.println("-"+i+") "+jugadores[i].getNickname());
        }

        System.out.println("\n\n");
    }

    //Ordenar alfabetico de los nickname cuandos se muestran

    public void mostrarNicknameOrdenado(boolean ascendente){
        boolean cambio = true;

        for (int i = 1; i < (contadorJugador-1); i++) {
            for (int j = 0; j < (contadorJugador-1-i); j++) {
                //  String.compareTo(String)
                //   [-oo , + oo]
                if (ascendente)
                    cambio= (jugadores[j].getNickname().compareTo(jugadores[j+1].getNickname()) > 0 );
                else 
                    cambio= (jugadores[j].getNickname().compareTo(jugadores[j+1].getNickname()) < 0 );
            }
        }
    }

}
