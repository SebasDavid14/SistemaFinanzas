import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Registrar ingreso");
            System.out.println("2. Registrar gasto");
            System.out.println("3. Salir");
            opcion = sc.nextInt();
        } while(opcion != 3);
    }
}