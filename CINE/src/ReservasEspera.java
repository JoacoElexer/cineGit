import java.util.LinkedList;
import java.util.Queue;

public class ReservasEspera {
    private Queue<String> reservasEspera;

    public ReservasEspera() {
        this.reservasEspera = new LinkedList<>();
    }

    // getter y setter
    
    public Queue<String> getReservasEspera() {
        return reservasEspera;
    }
    
    public void setReservasEspera(Queue<String> reservasEspera) {
        this.reservasEspera = reservasEspera;
    }
    
    public boolean isEmpty() {
        return reservasEspera.isEmpty();
    }

    public String obtenerPrimeraReservaEspera() {
        return reservasEspera.poll();
    }

    public void agregarReservaEspera(String detalleReserva) {
        reservasEspera.offer(detalleReserva);
    }

    public void eliminarPrimeraReservaEspera() {
        reservasEspera.poll();
    }

    public void mostrarReservasEspera() {
        System.out.println("Reservas en espera:");
        for (String reserva : reservasEspera) {
            System.out.println(reserva);
        }
    }

    public void registrarReservaEnEspera(String detalleReserva) {
        agregarReservaEspera(detalleReserva);
    }
}
