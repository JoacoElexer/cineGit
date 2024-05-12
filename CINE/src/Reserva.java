public class Reserva {
    public static void main(String[] args) {
        // Crear un cine con 3 funciones, 2 salas por función, 5 filas y 10 columnas

        System.out.println("Creación del sistema");
        Cine cine = new Cine(3, 2, 2, 3);
        cine.mostrarEstadoAsientos(0, 0);

        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");

        System.out.println("Reservar asiento disponible");

        cine.reservarAsiento(0, 0, 0, 0);
        cine.mostrarEstadoAsientos(0, 0);
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");

        System.out.println("Reservar asiento no disponible");

        cine.reservarAsiento(0, 0, 0, 0);
        cine.mostrarEstadoAsientos(0, 0);
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");

        System.out.println("Cancelar la reserva");

        cine.cancelarReserva(0, 0, 0, 0);
        cine.mostrarEstadoAsientos(0, 0);
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");

        System.out.println("Deshacer la ultima cancelacion");

        cine.deshacerCancelacion(0, 0, 0, 0);
        cine.mostrarEstadoAsientos(0, 0);
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");

        System.out.println(
                "Volver a cancelar la reservación y su registro en la pila. Registrando la reserva de la cola");
        cine.cancelarReserva(0, 0, 0, 0);
        cine.procesarReservasEnEspera(0, 0);
        cine.mostrarEstadoAsientos(0, 0);
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");

        System.out.println("Volver a deshacer la última cancelación pero ahora está reservado el asiento");
        cine.deshacerCancelacion(0, 0, 0, 0);
        cine.mostrarEstadoAsientos(0, 0);

        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        // Intentar reservar 3 vaces 2 distintos asientos
        System.out.println("Intentar reservar 3 veces 2 distintos asientos");
        cine.reservarAsiento(0, 0, 0, 0);
        cine.reservarAsiento(0, 0, 0, 1);
        cine.reservarAsiento(0, 0, 0, 2);
        cine.reservarAsiento(0, 0, 0, 0);
        cine.reservarAsiento(0, 0, 0, 1);
        cine.reservarAsiento(0, 0, 0, 2);
        cine.reservarAsiento(0, 0, 0, 0);
        cine.reservarAsiento(0, 0, 0, 1);
        cine.reservarAsiento(0, 0, 0, 2);

        cine.mostrarEstadoAsientos(0, 0);

        System.out.println("--------------------------------------------------");
        System.out.println("intentar procesar reservas en espera");
        cine.procesarReservasEnEspera(0, 0);
        cine.mostrarEstadoAsientos(0, 0);

    }
}
