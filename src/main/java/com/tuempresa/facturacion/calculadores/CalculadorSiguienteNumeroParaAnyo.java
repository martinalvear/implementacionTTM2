package com.tuempresa.facturacion.calculadores;
 
import javax.persistence.*;

import org.openxava.calculators.*;
import org.openxava.jpa.*;

import lombok.*;
 
public class CalculadorSiguienteNumeroParaAnyo
    implements ICalculator { // Un calculador tiene que implementar ICalculator
 
    @Getter @Setter     
    int anyo; // Este valor se inyectar� antes de calcular
 
    public Object calculate() throws Exception {
        Query query = XPersistence.getManager().createQuery(
            "select max(f.numero) from " +
            "DocumentoComercial f " + // DocumentoComercial en vez de Factura
            "where f.anyo = :anyo");
        query.setParameter("anyo", anyo);
        Integer ultimoNumero = (Integer) query.getSingleResult();
        return ultimoNumero == null?1:ultimoNumero + 1;
    }
 
}