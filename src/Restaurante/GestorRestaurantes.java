import java.util.ArrayList;
import java.util.List;

public class GestorRestaurantes {
    private static GestorRestaurantes instancia = new GestorRestaurantes();
    private List<Restaurante> restaurantes;

    private GestorRestaurantes() {
        this.restaurantes = new ArrayList<>();
    }

    public static GestorRestaurantes getInstancia() {
        return instancia;
    }

    public void agregarRestaurante(Restaurante restaurante) {
        restaurantes.add(restaurante);
    }

    public void eliminarRestaurante(Restaurante restaurante) {
        restaurantes.remove(restaurante);
    }

    public Restaurante buscarRestaurantePorNombre(String nombre) {
        for (Restaurante restaurante : restaurantes) {
            if (restaurante.getNombre().equalsIgnoreCase(nombre)) {
                return restaurante;
            }
        }
        return null; // Si no se encuentra ningún restaurante con ese nombre
    }

    public List<Restaurante> obtenerTodosLosRestaurantes() {
        return restaurantes;
    }

    // Otros métodos de gestión de restaurantes
}
