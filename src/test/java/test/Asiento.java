package test;

public class Asiento {
    //Atributos
    String color;
    int precio;
    int registro;

    //Métodos
    public void cambiarColor(String color){
        if (color.equals("rojo") || color.equals("verde") || color.equals("amarillo") || color.equals("negro") || color.equals("blanco")) {
            this.color = color;
        }
    }
}
