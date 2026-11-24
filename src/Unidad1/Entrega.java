/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad1;

/**
 *
 * @author fcag2
 */
public class Entrega extends RegistroPedido {
    
    private final String fechaEntrega;

   
    public Entrega(String codigoPedido, String fechaEntrega) {
        super(codigoPedido); 
        if (fechaEntrega == null || fechaEntrega.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "La fecha de entrega es obligatoria.");
        }

        this.fechaEntrega = fechaEntrega.trim();
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }
}
