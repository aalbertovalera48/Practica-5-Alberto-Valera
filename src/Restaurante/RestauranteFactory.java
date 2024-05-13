public class RestauranteFactory {
    public RestauranteRapido crearRestaurante(String tipo) {
        EstrategiaServicioCliente estrategiaServicio;
        if (tipo.equalsIgnoreCase("rápido")) {
            estrategiaServicio = new ServicioClienteRapido();
            return new RestauranteRapido(estrategiaServicio);
        } else if (tipo.equalsIgnoreCase("temático")) {
            estrategiaServicio = new ServicioClienteTematico();
            return new RestauranteRapido(estrategiaServicio);
        } else if (tipo.equalsIgnoreCase("de lujo")) {
            estrategiaServicio = new ServicioClienteLujo();
            return new RestauranteRapido(estrategiaServicio);
        }
        return null;
    }
}