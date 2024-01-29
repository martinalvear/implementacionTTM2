package com.tuempresa.facturacion.modelo;
 
import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;
 
@Entity @Getter @Setter
public class Marca extends Identificable {
 
    
 
    @Column(length=50) @Required
    String nombre;
    
    @OneToMany(mappedBy="marca")
    @ListProperties("numero, descripcion, precio")
    Collection<Autos> autos;
  
}