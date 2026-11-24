
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
    public final void setMaterial(String material) {
        if (material == null || material.trim().isEmpty()) {
            throw new IllegalArgumentException("El material es obligatorio.");
        }
        this.material = material.trim();
    }

    @Override
    public String describir() {
        return super.describir() + " | Material " + material;
    }
}
