public class VistaRestaurante {
    public void mostrarInformacion(ModeloRestaurante restaurante) {
        System.out.println("Nombre: " + restaurante.getNombre());
        System.out.println("Dirección: " + restaurante.getDireccion());
        System.out.println("Teléfono: " + restaurante.getTelefono());
    }
}