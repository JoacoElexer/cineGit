import java.util.ArrayList;

public class Sala {
    private ArrayList<ArrayList<Asiento>> asientos;
    private Cancelaciones cancelaciones;
    private ReservasEspera reservasEspera;
   

    public Sala(int filas, int columnas) {
        this.asientos = new ArrayList<>();
        for (int i = 0; i < filas; i++) {
            ArrayList<Asiento> fila = new ArrayList<>();
            for (int j = 0; j < columnas; j++) {
                fila.add(new Asiento());
            }
            this.asientos.add(fila);
        }
        this.cancelaciones = new Cancelaciones();
        this.reservasEspera = new ReservasEspera();

    }

    public void reservarAsiento(int fila, int columna) {
        if (fila >= 0 && fila < asientos.size() && columna >= 0 && columna < asientos.get(fila).size()) {
            if (asientos.get(fila).get(columna).getReservado() == false) {
                asientos.get(fila).get(columna).reservar(fila, columna);
                System.out.println("Reserva realizada con éxito");
            } else {
                // Si el asiento ya está reservado, se agrega a la lista de reservas en espera
                reservasEspera.agregarReservaEspera("Reserva en espera en la fila " + fila + ", columna " + columna);
                System.out.println("El asiento en la fila " + fila + ", columna " + columna + " ya está reservado. Se ha agregado a la lista de reservas en espera.");
            }

        } else {
            System.out.println("El asiento especificado no existe en esta sala.");
        }
    }

    // Método para cancelar la reserva de un asiento en una fila y columna
    // específicas
    public void cancelarReserva(int fila, int columna) {
        if (fila >= 0 && fila < asientos.size() && columna >= 0 && columna < asientos.get(fila).size()) {
            asientos.get(fila).get(columna).cancelarReserva(fila, columna);
            System.out.println("Reserva cancelada con éxito.");
            cancelaciones.registrarReservaCancelada("Reserva cancelada en la fila " + fila + ", columna " + columna);
        } else {
            System.out.println("El asiento especificado no existe en esta sala.");
        }
        
    }
    //se me escucha en discord?

    // Método para mostrar el estado de todos los asientos de la sala
    public void mostrarEstadoAsientos() {
        for (int i = 0; i < asientos.size(); i++) {
            for (int j = 0; j < asientos.get(i).size(); j++) {
                if (asientos.get(i).get(j).getReservado()) {
                    System.out.print("[ X ]");
                } else {
                    System.out.print("[ O ]");
                }
            }
            System.out.println(); // Agrega un salto de línea después de imprimir cada fila
        }
        // Mostrar las cancelaciones
        cancelaciones.mostrarCancelaciones();
        // Mostrar las reservas en espera
        reservasEspera.mostrarReservasEspera();

    }

    // Método para deshacer la última cancelación de reserva
    public void deshacerCancelacion(int fila, int columna) {
        if (fila >= 0 && fila < asientos.size() && columna >= 0 && columna < asientos.get(fila).size()) {
            // Deshacer la cancelación
            asientos.get(fila).get(columna).deshacerCancelacion();
    
            // Eliminar la última cancelación de la pila de cancelaciones
            cancelaciones.deshacerCancelacion();
        } else {
            System.out.println("El asiento especificado no existe en esta sala.");
        }
    }

    public void asignarAsietosDeReservasEnEspera(int fila, int columna) {
        if (fila >= 0 && fila < asientos.size() && columna >= 0 && columna < asientos.get(fila).size()) {
            if (asientos.get(fila).get(columna).getReservado() == false) {
                asientos.get(fila).get(columna).reservar(fila, columna);
                System.out.println("Reserva realizada con éxito");
                // Eliminar la reserva en espera
                reservasEspera.eliminarPrimeraReservaEspera();

            } else {
                System.out.println("El asiento en la fila " + fila + ", columna " + columna + " ya está reservado.");
                // Eliminar el primer elemento de la lista de reservas en espera
                reservasEspera.obtenerPrimeraReservaEspera();
                // Agregar ese elemento al final de la lista de reservas en espera
                reservasEspera.agregarReservaEspera("Reserva en espera en la fila " + fila + ", columna " + columna);
            }
        } else {
            System.out.println("El asiento especificado no existe en esta sala.");
        }
    }
    

}
