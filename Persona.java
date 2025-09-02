import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@Setter
public class Persona {
    private String nombre;
    private int edad;
    @Override
    public String toString(){
        return "Persona{nombre='"+nombre+"',edad='"+edad+"'}";
    }
}
