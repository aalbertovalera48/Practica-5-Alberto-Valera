import java.time.LocalDateTime;

public class Reserva {
    private Restaurante restaurante;
    private LocalDateTime fechaHora;
    private Cliente cliente;

    public Reserva(Restaurante restaurante, LocalDateTime fechaHora, Cliente cliente) {
        this.restaurante = restaurante;
        this.fechaHora = fechaHora;
        this.cliente = cliente;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public Cliente getCliente() {
        return cliente;
    }

}
