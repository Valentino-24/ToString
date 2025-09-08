import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Producto> productosSet = new HashSet<>();

        Producto p1 = Producto.builder()
                .codigo("P001")
                .nombre("Notebook")
                .precio(1200.00)
                .build();
        Producto p2 = Producto.builder()
                .codigo("P002")
                .nombre("Mouse")
                .precio(25.50)
                .build();
        Producto p3 = Producto.builder()
                .codigo("P001")
                .nombre("Notebook Gaming")
                .precio(1500.00)
                .build();
        Producto p4 = Producto.builder()
                .codigo("P003")
                .nombre("Teclado")
                .precio(75.00)
                .build();
        System.out.println("Agregando productos al HashSet:");
        System.out.println("Producto 1 agregado: " + productosSet.add(p1));
        System.out.println("Producto 2 agregado: " + productosSet.add(p2));
        System.out.println("Producto 3 agregado: " + productosSet.add(p3)); // Debería ser false (duplicado)
        System.out.println("Producto 4 agregado: " + productosSet.add(p4));

        System.out.println("\nContenido del HashSet:");
        for (Producto producto : productosSet) {
            System.out.println(producto);
        }
        System.out.println("\nTotal de productos únicos: " + productosSet.size());

        System.out.println("\nVerificando existencia de productos:");
        Producto productoBusqueda = Producto.builder()
                .codigo("P001")
                .nombre("")
                .precio(0.0)
                .build();
        System.out.println(productosSet.contains(productoBusqueda));
    }
}