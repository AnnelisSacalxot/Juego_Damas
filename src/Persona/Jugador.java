package Persona;

public class Jugador {

    //Las variables que se van a utilizar para los métodos a implementar
    private String nickname;

    //constructor
    public Jugador(String nickname){
        this.nickname = nickname;

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



    public String getInformacion() {
        String resultado = " Nickname: " + nickname;
        return resultado;
    }

}
