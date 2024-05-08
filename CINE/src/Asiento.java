public class Asiento {
    private boolean Reservado;

    public Asiento() {
        this.Reservado = false;
    }

    public boolean getReservado() {
        return Reservado;
    }

    public void setReservado(boolean reservado) {
        Reservado = reservado;
    }

    public void reservar() {
        if (getReservado() == false) {
            this.Reservado = true;
        } else {
            System.out.println("El asiento ya está reservado.");
        }
        
    }

    public void cancelarReserva() {
        if (getReservado() == false){
            System.out.println("El asiento no está reservado.");
        } else {
            this.Reservado = false;
        }
    }
}