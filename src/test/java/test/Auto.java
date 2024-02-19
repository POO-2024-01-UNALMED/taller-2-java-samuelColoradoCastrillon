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
        int cantidad = 0;
        for (Asiento asiento : asientos) {
            if (asiento instanceof Asiento) {
                cantidad++;
            }
        }
        return cantidad;
    }
    public String verificarIntegridad() {
        if (this.registro != this.motor.registro) {
            return "Las piezas no son originales";
        }
        for (Asiento asiento: asientos) {
            if (asiento instanceof Asiento) {
                if (this.registro != asiento.registro) {
                    return "Las piezas no son originales";
                }
            }
        }
        return "Auto original";
    }
}