package com.tuempresa.facturacion.modelo;
 
import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity 

@Getter @Setter
public class Accesorios {
 
    @Id @Column(length=9)
    int numero;
 
    @Column(length=50) @Required
    String descripcion;
    
    @Money // La propiedad precio se usa para almacenar dinero
    BigDecimal precio; // BigDecimal se suele usar para dinero
     
    @Files // Una galer�a de fotos completa est� disponible
    @Column(length=32) // La cadena de 32 de longitud es para almacenar la clave de la galer�a
    String fotos;
     
    @TextArea // Esto es para un texto grande, se usar� un �rea de texto o equivalente
    String observaciones;

 
}