public class ServicioCliente {
    private MediadorRestaurante mediador;

    public ServicioCliente(MediadorRestaurante mediador) {
        this.mediador = mediador;
    }

    public void notificarCliente(String mensaje) {
        System.out.println("Notificación al cliente: " + mensaje);
        MediadorRestaurante mediador = new MediadorRestauranteImpl() {
            @Override
            public void comunicar(String mensaje) {
                System.out.println("Mensaje al cliente: " + mensaje);
            }
        };
        }
    }