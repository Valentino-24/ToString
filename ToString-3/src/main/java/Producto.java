import lombok.*;
@Builder
@Getter
@Setter
@ToString
public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        Producto producto = (Producto) obj;
        return codigo.equals(producto.codigo);
    }
}
