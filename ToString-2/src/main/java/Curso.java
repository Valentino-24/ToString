import java.util.*;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
@Getter
@Setter
@SuperBuilder
public class Curso {
    private String nombre;
    private List<Estudiante>listaDeEstudiantes;
    @Override
    public String toString(){
        return "Curso{nombre='"+getNombre()+"',listaDeEstudiantes='"+getListaDeEstudiantes()+"'}";
    }

}
