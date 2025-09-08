import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = Estudiante.builder()
                .nombre("Enzo Severino")
                .edad(20)
                .carrera("Ingeniería de Sistemas")
                .build();

        Estudiante estudiante2 = Estudiante.builder()
                .nombre("Luca Bertaina")
                .edad(21)
                .carrera("Ingeniería de Software")
                .build();

        Estudiante estudiante3 = Estudiante.builder()
                .nombre("Jerónimo Zúñiga")
                .edad(19)
                .carrera("Ciencia de la Computación")
                .build();

        Estudiante estudiante4 = Estudiante.builder()
                .nombre("Facundo Ganem")
                .edad(22)
                .carrera("Ingeniería Informática")
                .build();

        Estudiante estudiante5 = Estudiante.builder()
                .nombre("Gabriel Rodriguez")
                .edad(20)
                .carrera("Tecnologías de la Información")
                .build();

        Curso curso1 = Curso.builder()
                .nombre("Programacion III")
                .listaDeEstudiantes(Arrays.asList(estudiante1, estudiante2, estudiante3))
                .build();

        Curso curso2 = Curso.builder()
                .nombre("Ingles")
                .listaDeEstudiantes(Arrays.asList(estudiante4, estudiante5))
                .build();

        Curso curso3 = Curso.builder()
                .nombre("Bases de Datos")
                .listaDeEstudiantes(Arrays.asList(estudiante1, estudiante4, estudiante5, estudiante2))
                .build();

        List<Curso> cursos = Arrays.asList(curso1, curso2, curso3);

        for (Curso curso : cursos) {
            System.out.println("----------------------------------------");
            System.out.println("Curso: " + curso.getNombre());
            System.out.println("Cantidad de alumnos: " + curso.getListaDeEstudiantes().size());
        }
    }
}