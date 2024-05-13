import java.util.ArrayList;
import java.util.List;

public class GrupoRestaurantes extends ComponenteRestaurante {
    private List<ComponenteRestaurante> restaurantes = new ArrayList<>();

    public void agregarRestaurante(ComponenteRestaurante restaurante) {
        restaurantes.add(restaurante);
    }
@Override
public void mostrarInformacion() {
    for (ComponenteRestaurante restaurante : restaurantes) {
        restaurante.mostrarInformacion();
    }
}

public void eliminarRestaurante(ComponenteRestaurante restaurante) {
        restaurantes.remove(restaurante);
    }

}