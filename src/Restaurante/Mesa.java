public class Mesa {
    private String numero;
    private EstadoMesa estado;

    public Mesa(String numero) {
        this.numero = numero;
        this.estado = new MesaLibre(); // Por defecto, la mesa se inicializa como libre
    }

    public void setEstado(EstadoMesa estado) {
        this.estado = estado;
    }

    public String getNumero() {
        return numero;
    }

    public EstadoMesa getEstado() {
        return estado;
    }
}
