package com.scotiabank.Prioridad;

import com.scotiabank.entidad.Cliente;
import com.scotiabank.enums.TipoGestion;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class TurnoPorPrioridad {
    
    public static void main(String[] args) {
        PriorityQueue<Cliente> colaClientes = new PriorityQueue<>();
        
        // Agregar clientes a la cola con diferentes edades y tipos de gestión
        listaCompleta(colaClientes);
        
        System.out.println("Atendiendo clientes por prioridad:");
        while (!colaClientes.isEmpty()) {
            Cliente cliente = colaClientes.poll();
            System.out.println(cliente);
        }
    }
    
    public static void listaCompleta(PriorityQueue<Cliente> colaClientes) {
        colaClientes.add(new Cliente("Juan Perez", "Gomez", "12345678", TipoGestion.CAJA));
        colaClientes.add(new Cliente("Maria Lopez", "Torres", "87654321", TipoGestion.ASESORIACOMERCIAL));
        colaClientes.add(new Cliente("Carlos Ramirez", "Diaz", "13579246", TipoGestion.RECLAMOS));
        colaClientes.add(new Cliente("Ana Torres", "Vega", "24681357", TipoGestion.ATENCIONPREFERENCIAL));
        colaClientes.add(new Cliente("Luisa Martinez", "Gonzalez", "15975324", TipoGestion.CAJA));
        colaClientes.add(new Cliente("Jorge Salas", "Martinez", "35795124", TipoGestion.ATENCIONESPECIALIZADA));
    }
}
