package test;
public class Auto {
    //Atributos
    String modelo;
    int precio;
    public Asiento [] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    //Métodos
    public int cantidadAsientos() {
        if (asientos != null) {
            return asientos.length;
        } else {
            return 0;
        }
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