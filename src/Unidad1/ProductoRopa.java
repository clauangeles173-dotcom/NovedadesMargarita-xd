
package Unidad1;

/**
 *
 * @author CLAUDIA
 */
public class ProductoRopa extends Producto {
    private String talla;

    public ProductoRopa(String nombre, String descripcion, double precio, String talla) {
        super(nombre, descripcion, precio);
        setTalla(talla);
    }

    public String getTalla() {
        return talla;
    }
    public final void setTalla(String talla) {
        if (talla == null || talla.trim().isEmpty()) {
            throw new IllegalArgumentException("La talla es obligatoria.");
        }
        this.talla = talla.trim();
    }

    @Override
    public String describir() {
        return super.describir() + " | Talla " + talla;
    }
}
