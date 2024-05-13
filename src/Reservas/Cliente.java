import java.util.Scanner;

public class Cliente {
    private String nombre;
    private String telefono;
    private String email;

    public Cliente(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }
    static Cliente obtenerDetallesCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese el nombre del cliente:");
        String nombre = scanner.nextLine();

        System.out.println("Por favor, ingrese el número de teléfono del cliente:");
        String telefono = scanner.nextLine();

        System.out.println("Por favor, ingrese el correo electrónico del cliente:");
        String email = scanner.nextLine();

        Cliente cliente = new Cliente(nombre, telefono, email);
        return cliente;
    }
}