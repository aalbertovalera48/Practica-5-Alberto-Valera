public class Restaurante extends ComponenteRestaurante {

    @Override
    public void mostrarInformacion() {
        System.out.println("Información del restaurante");

    }

    public String getNombre() {
        return "Nombre del restaurante";
    }

}