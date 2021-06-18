    /*Esta clase va a manejar los métodos principales por lo que 
    exportaremos las clases necesarias para su funcionalidad y
     aqui ira la lógica principal */

package Juego;
import Tablero.*;

public class Juego {
    Cuadro [][] tablero;
    Cuadro cuadro = new Cuadro();

    //Iniciamos el constructor e indico el tamaño de la matriz 

    public Juego(){
        tablero = new Cuadro [8][8];
        inicilizarTablero();
    }

    //En este método se meteran todos los metodos que se verán más adelante
    //para llamarlos cuando se cree el objeto

    public void iniciarJuegoDamas(){

    }

     /* Para inicilizar el tablero y también pintarlo utilizaremos ciclos
    "for" anidados ya que son matrices con los que estamos trabajando*/
   
    private void inicilizarTablero() {

        boolean blanco = true;

        for (int i = 0; i<8; i++){
            for (int j = 0; j<8; j++){

                blanco = !blanco;

                if (blanco)
                    tablero[i][j] = cuadro.getCuadroColorBlanco();
                else
                    tablero[i][j] = cuadro.getCuadroColorNegro();

                //if (i<3 && blanco)
                  //  tablero[i][j].inicializarFichaBlanca();

                //if (i>4 && blanco)
                  //  tablero[i][j].inicializarFichaNegra();
            }
            blanco = !blanco;
        }
    }
}
