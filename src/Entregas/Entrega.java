public class Entrega {
    private MediadorRestaurante mediador;

    public Entrega(MediadorRestaurante mediador) {
        this.mediador = mediador;
    }

    public void entregarPedido(String pedido) {
        System.out.println("Pedido entregado: " + pedido);
        // Lógica de entrega del pedido
        // ...
    }
}