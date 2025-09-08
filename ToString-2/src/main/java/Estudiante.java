import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
@Getter
@Setter
@SuperBuilder

public class Estudiante extends Persona{
    private String carrera;
    @Override
    public String toString(){
        return "Estudiante{nombre='"+getNombre()+"',edad='"+getEdad()+"',carrera='"+getCarrera()+"'}\n";
    }
}