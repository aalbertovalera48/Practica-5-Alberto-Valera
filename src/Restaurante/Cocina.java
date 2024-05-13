public class Cocina {
    private MediadorRestaurante mediador;

    public Cocina(MediadorRestaurante mediador) {
        this.mediador = mediador;
    }

    public void recibirPedido(String pedido) {
        System.out.println("Pedido recibido en la cocina: " + pedido);
        // Lógica de preparación del pedido
        // ...
        mediador.comunicar("Pedido preparado: " + pedido);
    }
}
