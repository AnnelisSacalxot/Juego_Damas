package Tablero;

public class CuadroBlanco extends Cuadro {
    
    @Override
    String getCuadroColor() {
        return ANSI_RED+CUADRO;
    }

}
