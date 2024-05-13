import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SistemaReservas {

    public void realizarOperacion() {
        System.out.println("Operación de reserva realizada en el sistema externo de reservas");

        // Seleccionar un restaurante
        Restaurante restaurante = seleccionarRestaurante();

        // Seleccionar una fecha y hora
        LocalDateTime fechaHora = seleccionarFechaHora();

        // Proporcionar detalles del cliente
        Cliente cliente = Cliente.obtenerDetallesCliente();

        // Realizar la reserva
        Reserva reserva = new Reserva(restaurante, fechaHora, cliente);

        // Confirmar la reserva
        boolean confirmacion = confirmarReserva(reserva);

        if (confirmacion) {
            System.out.println("Reserva confirmada.");
        } else {
            System.out.println("No se pudo confirmar la reserva.");
        }
    }

    private boolean confirmarReserva(Reserva reserva) {
        System.out.println("Reserva confirmada para " + reserva.getCliente().getNombre() + " en " + reserva.getRestaurante().getNombre() + " para la fecha y hora " + reserva.getFechaHora());
        return true;
    }


    private LocalDateTime seleccionarFechaHora() {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        System.out.println("Por favor, ingrese la fecha y hora de la reserva en el formato 'yyyy-MM-dd HH:mm':");
        String fechaHoraStr = scanner.nextLine();

        LocalDateTime fechaHora = LocalDateTime.parse(fechaHoraStr, formatter);
        return fechaHora;
    }

    private Restaurante seleccionarRestaurante() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, seleccione el tipo de restaurante:");
        System.out.println("1. Restaurante de lujo");
        System.out.println("2. Restaurante rápido");
        System.out.println("3. Restaurante temático");

        int seleccion = scanner.nextInt();

        switch (seleccion) {
            case 1:
                return new RestauranteLujo(new ServicioClienteLujo());
            case 2:
                return new RestauranteRapido(new ServicioClienteRapido());
            case 3:
                return new RestauranteTematico(new ServicioClienteTematico());
            default:
                System.out.println("Selección no válida. Seleccionando restaurante de lujo por defecto.");
                return new RestauranteLujo(new ServicioClienteLujo());
        }
    }
}
