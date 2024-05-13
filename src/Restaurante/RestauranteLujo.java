public class RestauranteLujo extends Restaurante {
    private EstrategiaServicioCliente estrategiaServicio;

    public RestauranteLujo(EstrategiaServicioCliente estrategiaServicio) {
        this.estrategiaServicio = estrategiaServicio;
    }

    public void ofrecerServicio() {
        estrategiaServicio.ofrecerServicio();
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Restaurante de lujo con un ambiente elegante y un menú gourmet.");
    }

    @Override
    public String getNombre() {
        return "Restaurante de Lujo";
    }
}

