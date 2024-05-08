public class Reserva {
    public static void main(String[] args) {
        // Crear un cine con 3 funciones, 2 salas por función, 5 filas y 10 columnas
        Cine cine = new Cine(3, 2, 2, 3);

        cine.reservarAsiento(0, 0, 0, 0);

        cine.reservarAsiento(0, 0, 1, 0);

        cine.reservarAsiento(0, 0, 1, 1);

        cine.mostrarEstadoAsientos(0, 0);

        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("CANCELAR LA RESERVACIÓN");
        // Cancelar la reservación

        cine.cancelarReserva(0, 0, 1, 0);

        cine.mostrarEstadoAsientos(0, 0);

        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("RESERVAR ASIENTO YA RESERVADO");

        cine.reservarAsiento(0, 0, 0, 0);

        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("CANCELAR RESERVA DE ASIENTO DISPONIBLE");

        cine.cancelarReserva(0, 0, 1, 2);  
    }
}
