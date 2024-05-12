public class Asiento {
    private boolean Reservado;

    public Asiento() {
        this.Reservado = false;
    }

    public boolean getReservado() {
        return Reservado;
    }

    public void reservar(int fila, int columna) {
        if (getReservado() == false) {
            this.Reservado = true;
        } else {
            System.out.println("El asiento en la fila: " + fila + " y columna: " + columna + ", ya está reservado");
        }

    }

    public void cancelarReserva(int fila, int columna) {
        if (getReservado() == false) {
            System.out.println("El asiento en la fila: " + fila + " y columna: " + columna + ", no está reservado");
        } else {
            this.Reservado = false;
        }
    }

    public void deshacerCancelacion() {
        // Comprobar si el asiento fue reservado previamente
        if (getReservado() == true) {
            System.out.println("El asiento ya ha sido reservado. No se puede deshacer la cancelación.");
            
        } else {
            System.out.println("Cancelación deshecha con éxito.");
            this.Reservado = true;
        }
    }
}