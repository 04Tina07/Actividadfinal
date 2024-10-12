package com.scotiabank.entidad;

import com.scotiabank.enums.TipoGestion;

public class Cliente implements Comparable<Cliente> {
    
    private String nombres;
    private String apellido;
    private String documento;
    private TipoGestion gestion;
    
    public Cliente(String nombres, String apellido, String documento, TipoGestion gestion) {
        this.nombres = nombres;
        this.apellido = apellido;
        this.documento = documento;
        this.gestion = gestion;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public TipoGestion getGestion() {
        return gestion;
    }

    @Override
    public int compareTo(Cliente otro) {
        return Integer.compare(this.gestion.getPrioridad(), otro.gestion.getPrioridad());
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombres='" + nombres + '\'' +
                ", apellido='" + apellido + '\'' +
                ", documento='" + documento + '\'' +
                ", gestion=" + gestion +
                '}';
    }
}
