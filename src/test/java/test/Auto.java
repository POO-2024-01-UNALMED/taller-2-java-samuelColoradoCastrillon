package test;

public class Auto {
    //Atributos
    String modelo;
    int precio;
    Asiento [] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    //Métodos
    public int cantidadAsientos() {
        return asientos.length;
    }
    public String verificarIntegridad() {
        boolean sitsRegister = true;
        for (Asiento asiento : asientos) {
            if (asiento.registro == this.registro) {
                continue;
            }
            else {
                sitsRegister = false;
                break;
            }
        }
        if (this.registro == motor.registro && sitsRegister) {
            return "Auto original";
        } else {
            return "Las piezas no son originales";
        }
    }
}