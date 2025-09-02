public class Main {
    public static void main(String[]args){
        Estudiante e1 =  Estudiante.builder()
                .nombre("Facundo Ganem")
                .edad(19)
                .carrera("Ingeniería en Sistemas")
                .build();
        System.out.println(e1);
    }
}
