
package Unidad1;

/**
 *
 * @author CLAUDIA
 */
public class Persona {
      private String nombres;
    private String telefono;

    public Persona(String nombres, String telefono) {
        if (nombres == null || nombres.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre es obligatorio.");
        }
        if (telefono == null || telefono.trim().isEmpty()) {
            throw new IllegalArgumentException("El telefono es obligatorio.");
        }
        this.nombres = nombres.trim();
        this.telefono = telefono.trim();
    }
