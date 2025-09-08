import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>();
        Producto p1 = Producto.builder()
                .codigo("P001")
                .nombre("Notebook")
                .precio(1200)
                .build();
        Producto p2 = Producto.builder()
                .codigo("P002")
                .nombre("Mouse")
                .precio(25)
                .build();
        Producto p3 = Producto.builder()
                .codigo("P001")
                .nombre("Notebook Gaming")
                .precio(1500)
                .build();
        Producto p4 = Producto.builder()
                .codigo("P003")
                .nombre("Teclado")
                .precio(75)
                .build();
        Producto p5 = Producto.builder()
                .codigo("P002")
                .nombre("Mouse Inalámbrico")
                .precio(35)
                .build();
        System.out.println("Agregando productos a la lista:");

        addProducto(productos, p1);
        addProducto(productos, p2);
        addProducto(productos, p3);
        addProducto(productos, p4);
        addProducto(productos, p5);
        for (Producto p:productos){
            System.out.println(p);
            System.out.println("-------------------------------------");
        }
    }

    private static void addProducto(List<Producto> lista, Producto producto) {
        if (!lista.contains(producto)) {
            lista.add(producto);
            System.out.println("Producto agregado: " + producto);
        } else {
            System.out.println("Producto duplicado (no agregado): " + producto);
        }
    }
}