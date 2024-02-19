package test;

public class Motor {
    //Atributos
    int numeroCilindros;
    String tipo;
    int registro;

    //Métodos
    public void cambiarRegistro(int registro) {
        this.registro = registro;
    }
    public void asignarTipo(String tipo) {
        if (tipo.equals("electrico") || tipo.equals("gasolina")) {
            this.tipo = tipo;
        }
    }
}
