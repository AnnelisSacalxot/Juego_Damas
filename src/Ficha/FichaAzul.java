package Ficha;

public class FichaAzul extends FichaGeneral{
    
    @Override
    public String getFicha() {
        return ANSI_BLUE+CUADRO;
    }
}
