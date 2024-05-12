import java.util.Stack;

public class Cancelaciones {
    private Stack<String> cancelaciones;

    public Cancelaciones() {
        this.cancelaciones = new Stack<>();
    }

    // Getters y Setters
    public Stack<String> getCancelaciones() {
        return cancelaciones;
    }

    public void setCancelaciones(Stack<String> cancelaciones) {
        this.cancelaciones = cancelaciones;
    }

    public void agregarCancelacion(String detalleCancelacion) {
        cancelaciones.push(detalleCancelacion);
    }

    public void deshacerCancelacion() {
        if (!cancelaciones.isEmpty()) {
            cancelaciones.pop();
        } 
    }

    public void mostrarCancelaciones() {
        System.out.println("Reservas canceladas:");
        for (String cancelacion : cancelaciones) {
            System.out.println(cancelacion);
        }
    }

    public void registrarReservaCancelada(String detalleCancelacion) {
        agregarCancelacion(detalleCancelacion);
    }

    // public void deshacerReservaCancelada() {
    //     deshacerCancelacion();
    // }
}