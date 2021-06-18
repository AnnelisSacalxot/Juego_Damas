package Tablero;

public class CuadroNegro extends Cuadro {

    @Override
    String getCuadroColor() {
        return ANSI_WHITE+CUADRO;
    }

}
