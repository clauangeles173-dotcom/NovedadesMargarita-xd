
package Unidad1;

/**
 *
 * @author CLAUDIA
 */
public class RegistroPedido {
    private final String codigoPedido;

    public RegistroPedido(String codigoPedido) {
        if (codigoPedido == null || codigoPedido.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El codigo del pedido es obligatorio.");
        }
        this.codigoPedido = codigoPedido.trim();
    }
    public String getCodigoPedido() {
        return codigoPedido;
    }

    @Override
    public String toString() {
        return "pedido " + codigoPedido;
    }
}