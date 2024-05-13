public class ControladorRestaurante {
    private ModeloRestaurante modelo;
    private VistaRestaurante vista;

    public ControladorRestaurante(ModeloRestaurante modelo, VistaRestaurante vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void actualizarVista() {
        vista.mostrarInformacion(modelo);
    }
}