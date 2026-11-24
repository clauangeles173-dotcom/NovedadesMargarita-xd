
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
