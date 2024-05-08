import java.util.Stack;

public class Cancelaciones {
    Stack<Integer> Cancelaciones = new Stack<>();

    public Cancelaciones() {
    }

    public void agregarCancelacion(int funcion, int sala, int fila, int columna) {
        Cancelaciones.push(funcion);
        Cancelaciones.push(sala);
        Cancelaciones.push(fila);
        Cancelaciones.push(columna);


    }

    public void deshacerCancelacion() {
        if (Cancelaciones.empty()) {
            System.out.println("No hay cancelaciones que deshacer.");
            return;
        } else {
            System.out.println("Cancelación deshecha: " + Cancelaciones.peek());
        }
        Cancelaciones.pop();
    }

    public void mostrarCancelaciones() {
        System.out.println("Cancelaciones: " + Cancelaciones);
    }

    public void manejarReservaCancelada(int funcion, int sala, int fila, int columna) {
        
    }
}