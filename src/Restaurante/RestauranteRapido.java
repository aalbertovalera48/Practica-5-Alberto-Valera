public class RestauranteRapido extends Restaurante {
        @Override
        public void mostrarInformacion() {
            System.out.println("Restaurante rápido que ofrece comidas rápidas y asequibles.");
        }

        @Override
        public String getNombre() {
            return "Restaurante Rápido";
        }

    private EstrategiaServicioCliente estrategiaServicio;

    public RestauranteRapido(EstrategiaServicioCliente estrategiaServicio) {
        this.estrategiaServicio = estrategiaServicio;
    }

    public void ofrecerServicio() {
        estrategiaServicio.ofrecerServicio();
    }
}