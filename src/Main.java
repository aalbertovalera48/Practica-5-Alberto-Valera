import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        // Crear objetos necesarios
        RestauranteFactory restauranteFactory = new RestauranteFactory();
        GestorRestaurantes gestorRestaurantes = GestorRestaurantes.getInstancia();
        MediadorRestauranteImpl mediador = new MediadorRestauranteImpl();
        Cocina cocina = new Cocina(mediador);
        ServicioCliente servicioCliente = new ServicioCliente(mediador);
        Entrega entrega = new Entrega(mediador);
        mediador.setCocina(cocina);
        mediador.setServicioCliente(servicioCliente);
        mediador.setEntrega(entrega);
        GrupoRestaurantes grupoPrincipal = new GrupoRestaurantes();
        SistemaReservasAdapter sistemaReservasAdapter = new SistemaReservasAdapter(new SistemaReservas());
        ModeloRestaurante modelo = new ModeloRestaurante("Mi Restaurante", "Dirección del Restaurante");
        VistaRestaurante vista = new VistaRestaurante();
        ControladorRestaurante controlador = new ControladorRestaurante(modelo, vista);

        while (!salir) {
            System.out.println("Menú Principal");
            System.out.println("1. Crear Restaurante");
            System.out.println("2. Realizar Operación de Reserva");
            System.out.println("3. Mostrar Información de los Restaurantes");
            System.out.println("4. Actualizar Información del Restaurante");
            System.out.println("5. Salir");

            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después de leer un entero

            switch (opcion) {
                case 1:
                    System.out.println("Creación de Restaurante");
                    System.out.print("Ingrese el tipo de restaurante (rápido, temático, de lujo): ");
                    String tipoRestaurante = scanner.nextLine();
                    Restaurante restaurante = restauranteFactory.crearRestaurante(tipoRestaurante);
                    gestorRestaurantes.agregarRestaurante(restaurante);
                    grupoPrincipal.agregarRestaurante(restaurante);
                    System.out.println("Restaurante creado con éxito.");
                    break;
                case 2:
                    System.out.println("Realizar Operación de Reserva");
                    sistemaReservasAdapter.operacion();
                    break;
                case 3:
                    System.out.println("Mostrar Información de los Restaurantes");
                    grupoPrincipal.mostrarInformacion();
                    break;
                case 4:
                    System.out.println("Actualizar Información del Restaurante");
                    controlador.actualizarVista();
                    break;
                case 5:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }

        scanner.close();
    }
}
