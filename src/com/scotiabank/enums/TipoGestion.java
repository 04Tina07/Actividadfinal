package com.scotiabank.enums;

public enum TipoGestion {
    
    CAJA(1), // Mayor prioridad
    ASESORIACOMERCIAL(2),
    RECLAMOS(3),
    ATENCIONESPECIALIZADA(4),
    ATENCIONPREFERENCIAL(5);
    
    private final int prioridad;

    TipoGestion(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getPrioridad() {
        return prioridad;
    }
}
