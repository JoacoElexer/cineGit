import java.util.ArrayList;

public class Sala {
    private ArrayList<ArrayList<Asiento>> asientos;

    public Sala(int filas, int columnas) {
        this.asientos = new ArrayList<>();
        for (int i = 0; i < filas; i++) {
            ArrayList<Asiento> fila = new ArrayList<>();
            for (int j = 0; j < columnas; j++) {
                fila.add(new Asiento());
            }
            this.asientos.add(fila);
        }
    }
    public void reservarAsiento(int fila, int columna) {
        if (fila >= 0 && fila < asientos.size() && columna >= 0 && columna < asientos.get(fila).size()) {
            asientos.get(fila).get(columna).reservar();
        } else {
            System.out.println("El asiento especificado no existe en esta sala.");
        }
    }

    // Método para cancelar la reserva de un asiento en una fila y columna específicas
    public void cancelarReserva(int fila, int columna) {
        if (fila >= 0 && fila < asientos.size() && columna >= 0 && columna < asientos.get(fila).size()) {
            asientos.get(fila).get(columna).cancelarReserva();
        } else {
            System.out.println("El asiento especificado no existe en esta sala.");
        }
    }

    // Método para mostrar el estado de todos los asientos de la sala
    public void mostrarEstadoAsientos() {
        System.out.println("Estado de los asientos de la sala:");
        for (int i = 0; i < asientos.size(); i++) {
            for (int j = 0; j < asientos.get(i).size(); j++) {
                System.out.print("Fila " + i + ", Columna " + j + ": ");
                if (asientos.get(i).get(j).getReservado()) {
                    System.out.println("Reservado");
                } else {
                    System.out.println("Disponible");
                }
            }
        }
    }


}
