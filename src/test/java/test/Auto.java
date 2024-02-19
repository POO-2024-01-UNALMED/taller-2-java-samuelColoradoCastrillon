package test;
import java.util.List;
import java.util.ArrayList;
public class Auto {
    //Atributos
    String modelo;
    int precio;
    public List<Asiento> asientos = new ArrayList<>();
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    //Métodos
    public int cantidadAsientos() {
        return asientos.size();
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