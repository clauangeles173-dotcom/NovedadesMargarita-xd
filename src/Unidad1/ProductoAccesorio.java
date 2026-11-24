
package Unidad1;

/**
 *
 * @author CLAUDIA
 */
public class ProductoAccesorio extends Producto{
    private String material;

    public ProductoAccesorio(String nombre, double precio, String material) {
        super(nombre, precio);
        setMaterial(material);
    }

    public String getMaterial() {
        return material;
    }
