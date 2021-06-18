package Tablero;

public class CuadroBlanco extends Cuadro {
    
    /*El método Override nos ayuda a sobreescribir el método de la clase
    principal Cuadro, pero tiene diferente función comparado con la clase
    Cuadro Blanco */

    @Override
    String getCuadroColor() {
        return ANSI_RED+CUADRO;
    }

}
