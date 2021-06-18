package Tablero;
import  Ficha.FichaGeneral;
import Ficha.FichaAzul;
import Ficha.FichaAmarilla;

public abstract class Cuadro {
    
    /*El char definira un caracter que nos ayudara a armar el cuadro en si
    y los String son los colores que dichos  caracteres van a tomar para poder
    mostrarse en el tablero */

    protected final char CUADRO = (char)197;
    protected static final String ANSI_RED = "\u001B[31m";
    protected static final String ANSI_WHITE = "\u001B[37m";
    FichaGeneral dama;

    //Constructor de la clase
    public Cuadro(){
        dama = null;
    }

    //Esto tiene relación con la clase Ficha
    public void setDama(FichaGeneral dama){
        this.dama = dama;

    }

    public FichaGeneral getDama(){
        return dama;
    }

    public void inicializarFichaBlanca(){
        dama = new FichaAzul();
    }

    public void inicializarFichaNegra(){
        dama = new FichaAmarilla();
    }

    //Métodos para que las líneas se impriman cada linea y que se va a repetir
    //6 veces el caracter 

    public String pintarLinea1(){
        if (dama!= null)
        return getCuadroColor()+getCuadroColor()+dama.getFicha()+dama.getFicha()+getCuadroColor()+getCuadroColor();
        return getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor();
    }

    public String pintarLinea2(){
        if (dama!= null)
        return getCuadroColor()+dama.getFicha()+dama.getFicha()+dama.getFicha()+dama.getFicha()+getCuadroColor();
        return getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor();
    }    

    public String pintarLinea3(){
        if (dama!= null)
        return getCuadroColor()+getCuadroColor()+dama.getFicha()+dama.getFicha()+getCuadroColor()+getCuadroColor();
        return getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor();
    }

    //Utilizamos el metodo abstact porque en este caso necesitamos este metodo 
    //para las clases que heredan
    abstract String getCuadroColor();
}
