package com.tuempresa.facturacion.modelo;

import lombok.*;

@Getter @Setter
public class Incidencia {

    int numero;
    String descripcion;
	
    public String getDescripcion() { // Tu propio getter sobrescribe el generado por Lombok
        if (descripcion == null) return "Todavía sin descripción";
        return descripcion;
    }

}
