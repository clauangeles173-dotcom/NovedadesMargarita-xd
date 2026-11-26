

package Unidad1;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Pedido {
  
    private final String codigoPedido;

    
    private static int contadorPedidos = 0;

   
    private final String codigoCliente;

   
    private String estado = "BORRADOR";

    
    private Cliente cliente;

    private final List<DetallePedido> detalles = new ArrayList<>();
    
    public Pedido(String codigoCliente) {
       
        if (codigoCliente == null || codigoCliente.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El codigo del cliente es obligatorio.");
        }

        
        contadorPedidos++;

        this.codigoPedido =
                String.format("PED-%04d", contadorPedidos);

        this.codigoCliente = codigoCliente.trim();
    }

    public Pedido(Cliente cliente) {
        this(codigoDe(cliente));      // reutiliza el constructor original
        this.cliente = cliente;
        cliente.agregarPedido(this);  // el cliente tambien conoce a su pedido
    }
       private static String codigoDe(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("El cliente es obligatorio.");
        }
        return cliente.getCodigoCliente();
    }
    public String getCodigoPedido() {
        return codigoPedido;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public String getEstado() {
        return estado;
    }

        public Cliente getCliente() {
        return cliente;
    }

    public boolean agregarDetalle(String codigoProducto, int cantidad,
                                  double precioUnitario) {
        if (!"BORRADOR".equals(estado)) {
            return false;
        }
        detalles.add(new DetallePedido(codigoProducto, cantidad, precioUnitario));
        return true;
    }

    public boolean agregarDetalle(Producto producto, int cantidad) {
        if (producto == null) {
            throw new IllegalArgumentException("El producto es obligatorio.");
        }
        return agregarDetalle(producto.getCodigoProducto(), cantidad,
                              producto.getPrecio());
    }
    public List<DetallePedido> getDetalles() {
        return Collections.unmodifiableList(new ArrayList<>(detalles));
    }

    public double calcularTotal() {
        double total = 0;
        for (DetallePedido d : detalles) {
            total += d.getSubtotal();
        }
        return total;
    }
    public boolean cancelar() {
        if (!"BORRADOR".equals(estado)) {
            return false;
        }

        this.estado = "CANCELADO";
        return true;
    }
}
   
