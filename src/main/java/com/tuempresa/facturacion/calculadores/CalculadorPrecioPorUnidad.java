package com.tuempresa.facturacion.calculadores;

//Para usar getManager()
import static org.openxava.jpa.XPersistence.getManager;

import org.openxava.calculators.*;

import com.tuempresa.facturacion.modelo.*;

import lombok.*;
 
public class CalculadorPrecioPorUnidad implements ICalculator {
 
    @Getter @Setter
    int numeroProducto;
 
    @Override
    public Object calculate() throws Exception {
        Autos autos = getManager() // getManager() de XPersistence
            .find(Autos.class, numeroProducto); // Busca el producto
        return autos.getPrecio();    // Retorna su precio
    }
 
}