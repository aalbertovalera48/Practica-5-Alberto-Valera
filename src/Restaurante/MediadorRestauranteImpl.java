public class MediadorRestauranteImpl implements MediadorRestaurante {
    private Cocina cocina;
    private ServicioCliente servicioCliente;
    private Entrega entrega;

    public MediadorRestauranteImpl() {
        this.cocina = cocina;
        this.servicioCliente = servicioCliente;
        this.entrega = entrega;
    }

    @Override
    public void comunicar(String mensaje) {
        cocina.recibirPedido(mensaje);
        servicioCliente.notificarCliente(mensaje);
        entrega.entregarPedido(mensaje);
    }

    public Cocina getCocina() {
        return cocina;
    }

    public void setCocina(Cocina cocina) {
        this.cocina = cocina;
    }

    public ServicioCliente getServicioCliente() {
        return servicioCliente;
    }

    public void setServicioCliente(ServicioCliente servicioCliente) {
        this.servicioCliente = servicioCliente;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }
}
