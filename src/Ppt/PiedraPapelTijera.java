/*Se trabajara la lógica de Piedra, Papel o Tijera se harán Strings 
porque no necesitamos que los usuarios introduzcan los valores
o cadenas sino que será de manera aleatoria */

package Ppt;

public class PiedraPapelTijera {
    
    //Declaro las variables que van a servir para el juego y también
    // se va a utilizar el metodo random para tirar las jugadas
   private int jugador1, jugador2, aleatorio=0;
   private String gano1 = "Gano jugador 1";
   private String gano2 = "Gano jugador 2";

    //Constructor

    public PiedraPapelTijera(){ 

    }

    //Método o lógica del juego
    public void juegoIniciaP(){   

        aleatorio = (int)(Math.random()*6+1);

        if (aleatorio == 1) {
            System.out.println("Jugador 1: piedra");
            System.out.println("Jugador 2: tijera");
            System.out.println(gano1);
        } else if (aleatorio == 2) {
            System.out.println("Jugador 2: piedra");
            System.out.println("Jugador 1: tijera");
            System.out.println(gano2);
        } else if (aleatorio == 3) {
            System.out.println("Jugador 1: papel");
            System.out.println("Jugador 2: piedra");
            System.out.println(gano1);
        }
        else if (aleatorio == 4) {
            System.out.println("Jugador 2: papel");
            System.out.println("Jugador 1: piedra");
            System.out.println(gano2);
        } else if (aleatorio == 5) {
            System.out.println("Jugador 1: tijera");
            System.out.println("Jugador 2: papel");
            System.out.println(gano1);
        } else if (aleatorio == 6) {
            System.out.println("Jugador 2: tijera");
            System.out.println("Jugador 1: papel");
            System.out.println(gano2);
        }
       
    }  
}


