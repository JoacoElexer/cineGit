

import java.util.ArrayList;

public class Cine {
    private ArrayList<ArrayList<Sala>> funciones;

    // Constructor
    public Cine(int numFunciones, int numSalasPorFuncion, int filas, int columnas) {
        this.funciones = new ArrayList<>();

        // Crear las salas para cada función
        for (int i = 0; i < numFunciones; i++) {
            ArrayList<Sala> salasPorFuncion = new ArrayList<>();
            for (int j = 0; j < numSalasPorFuncion; j++) {
                salasPorFuncion.add(new Sala(filas, columnas));
            }
            this.funciones.add(salasPorFuncion);
        }
    }

    // Método para reservar un asiento en una función y sala específicas
    public void reservarAsiento(int funcion, int sala, int fila, int columna) {
        if (funcion >= 0 && funcion < funciones.size() && sala >= 0 && sala < funciones.get(funcion).size()) {
            funciones.get(funcion).get(sala).reservarAsiento(fila, columna);
        } else {
            System.out.println("La función o sala especificada no existe.");
        }
    }

    // Método para cancelar la reserva de un asiento en una función y sala específicas
    public void cancelarReserva(int funcion, int sala, int fila, int columna) {
        if (funcion >= 0 && funcion < funciones.size() && sala >= 0 && sala < funciones.get(funcion).size()) {
            funciones.get(funcion).get(sala).cancelarReserva(fila, columna);
        } else {
            System.out.println("La función o sala especificada no existe.");
        }
    }

    // Método para mostrar el estado de los asientos de una función y sala
    public void mostrarEstadoAsientos(int funcion, int sala) {
        if (funcion >= 0 && funcion < funciones.size() && sala >= 0 && sala < funciones.get(funcion).size()) {
            System.out.println("Estado de los asientos de la función " + funcion + ", sala " + sala + ":");
            funciones.get(funcion).get(sala).mostrarEstadoAsientos();
        } else {
            System.out.println("La función o sala especificada no existe.");
        }
    }

}
