// autor: PANDO REYES JOAQUIN ADRIAN

package Unidad1;

// Esta clase se encarga de registrar la identificación y contacto del solicitante.
// Los productos solicitados, cantidades y estados se registran en 'Pedido' y sus detalles.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cliente extends Persona {

    // ATRIBUTOS

    // Identificador textual del cliente. Se conserva después de crear el cliente.
    private final String codigoCliente;    
    // Secuencia compartida. No identifica por sí mismo a una persona.
    private static int contadorClientes = 0;
    
    // METODOS

    // Constructor. Inicializa un cliente válido y genera su código.
    public Cliente(String nombres, String telefono) {
        super(nombres, telefono);
        contadorClientes++;
        
        // Se forma un código siguiendo el formato CLI-XXXX. Por ejemplo, el primer cliente recibirá el codigo CLI-0001.
        // Si llegase a superar los 9999 clientes, el formato simplemente se expande a CLI-XXXXX.
        this.codigoCliente = String.format("CLI-%04d", contadorClientes);
        this.nombres = nombres.trim();
        this.telefono = telefono.trim();
    }
    
    // Getter para codigoCliente. Devuelve el código del cliente sin modificarlo.
    public String getCodigoCliente() {
        return codigoCliente;
    }
     
    void agregarPedido(Pedido pedido) {
        if (pedido != null && !pedidos.contains(pedido)) {
            pedidos.add(pedido);
        }
    }
    public List<Pedido> getPedidos() {
        return Collections.unmodifiableList(new ArrayList<>(pedidos));
    }
        @Override
    public String toString() {
        return codigoCliente + " - " + super.toString();
    }

}