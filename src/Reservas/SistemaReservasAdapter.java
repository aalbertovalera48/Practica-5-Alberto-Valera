public class SistemaReservasAdapter implements SistemaExterno {
    private SistemaReservas sistemaReservas;

    public SistemaReservasAdapter(SistemaReservas sistemaReservas) {
        this.sistemaReservas = sistemaReservas;
    }
    @Override
    public void operacion() {
        sistemaReservas.realizarOperacion();
    }

}