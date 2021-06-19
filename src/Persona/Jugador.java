package Persona;

public class Jugador {

    //Las variables que se van a utilizar para los métodos a implementar
    private String nickname;
    private int numeroJugador = 0;

    //constructor
    public Jugador(String nickname, int numeroJugador){
        this.nickname = nickname;
        this.numeroJugador = numeroJugador;
    }

    public Jugador(){

    }

    //Getters and setters

    public String getNickname(){
        return nickname;
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    public int getNumeroJugador(){
        return numeroJugador;
    }

    public void setNumeroJugador(int numeroJugador){
        this.numeroJugador = numeroJugador;
    }

    public String getInformacion() {
        String resultado = "No. " + numeroJugador + " Nickname: " + nickname;
        return resultado;
    }

}
