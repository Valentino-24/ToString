import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[]args){
        List<Estudiante>listaEstudiantes=new ArrayList<>();
        listaEstudiantes.add(Estudiante.builder()
                .nombre("Facundo Ganem")
                .edad(19)
                .carrera("Ingeniería en Sistemas")
                .build());
        listaEstudiantes.add(Estudiante.builder()
                .nombre("Enzo Severino")
                .edad(20)
                .carrera("Redstone Engineer")
                .build());
        listaEstudiantes.add(Estudiante.builder()
                .nombre("Jerónimo Zúñiga")
                .edad(21)
                .carrera("Médico Militar")
                .build());
        System.out.println(listaEstudiantes);
    }
}
