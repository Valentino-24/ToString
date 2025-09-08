import lombok.*;
import java.util.Objects;
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Producto producto = (Producto) obj;
        return codigo.equals(producto.codigo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}