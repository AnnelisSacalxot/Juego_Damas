    /*Esta clase va a manejar los métodos principales por lo que 
    exportaremos las clases necesarias para su funcionalidad y
     aqui ira la lógica principal */

package Juego;
import java.util.Scanner;

import Tablero.*;

public class Juego {
    Cuadro [][] tablero;

    //Iniciamos el constructor e indico el tamaño de la matriz 

    public Juego(){
        tablero = new Cuadro [8][8];
        inicilizarTablero();
    }

    //En este método se meteran todos los metodos que se verán más adelante
    //para llamarlos cuando se cree el objeto

    public void iniciarJuegoDamas(){
        pintarTablero();
        moverFicha();
        pintarTablero();
    }


    //Lógica para las damas y movimiento 


    public void moverFicha(){
        int x,y,d;
        Scanner n = new Scanner(System.in);
        System.out.println("Posición y:");
        x= n.nextInt();
        System.out.println("Posición x:");
        y=n.nextInt();
        System.out.println("0 izquierda, 1 derecha:");
        d = n.nextInt();

        if (movimientoValido(x,y,1)&& movimientoValido(x,y,0)){
            if (movimientoValido(tablero[x][y],tablero[(x+1)][(y+1)]))
                moverDama(tablero[x][y],tablero[(x+1)][(y+1)]);
            else
                System.out.println("Movimiento invalido");
        }
        else
            System.out.println("Movimiento fuera de rango");


    }

    public void moverDama(Cuadro co, Cuadro cd){
        cd.setDama(co.getDama());
        co.setDama(null);

    }

    public boolean movimientoValido(Cuadro co, Cuadro cd){
        if (cd.isEmpty() && !co.isEmpty())
            return true;
        return false;
    }


    public boolean movimientoValido(int x, int y, int m){
        x+=m;
        y+=m;
        if ((x>=0) && (x<= 7) && (y>=0 ) && (y<=7))
            return true;
        return false;
    }
    
     /* Para inicilizar el tablero y también pintarlo utilizaremos ciclos
    "for" anidados ya que son matrices con los que estamos trabajando*/
   
    private void inicilizarTablero() {

        boolean blanco = true;

        for (int i = 0; i<8; i++){
            for (int j = 0; j<8; j++){

                blanco = !blanco;

                if (blanco)
                    tablero[i][j] =  new CuadroBlanco();
                else
                    tablero[i][j] = new CuadroNegro();

                if (i<3 && blanco)
                    tablero[i][j].inicializarFichaBlanca();

                if (i>4 && blanco)
                    tablero[i][j].inicializarFichaNegra();
            }
            blanco = !blanco;
        }
    }

    public void pintarTablero(){

        String linea1 = "";
        String linea2 = "";
        String linea3 = "";
        String linea4 = "";

        for (int i = 0; i<8; i++){
            for (int j=0;j<8;j++){
                linea1 = linea1 + tablero[i][j].pintarLinea1();
                linea2 += tablero[i][j].pintarLinea2();
                linea3 += tablero[i][j].pintarLinea3();
                if (j==7)
                    linea2+="  "+i;
                if (i==7)
                    linea4+="   "+j+"  ";
            }
            System.out.println(linea1);
            System.out.println(linea2);
            System.out.println(linea3);
            linea1 = "";
            linea2 = "";
            linea3 = "";
        }
        System.out.println(linea4);
    }
}
