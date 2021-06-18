package Ficha;

public abstract class FichaGeneral {

    //Iniciamos dando los colores que utilizaremos, estos códigos ya 
    //estan dados así que buscarlos en internet 

    protected static final char CUADRO = 'S';
    protected static final String ANSI_YELLOW = "\u001B[33m";
    protected static final String ANSI_BLUE = "\u001B[34m";

    
//Implementamos un método abstracto ya que este mismo métodos servira
//para las demás clases

    public abstract String getFicha();
    
}
