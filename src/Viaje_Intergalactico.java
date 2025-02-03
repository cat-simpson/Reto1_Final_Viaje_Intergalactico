import java.util.Scanner;

public class Viaje_Intergalactico {

    public static void main(String[] args) {

        Double Distancia_Marte = 225.8d; // Millones de kms
        Double Distancia_Jupiter = 778.6d; // Millones de kms
        Double Distancia_Saturno = 1_426.3d; // Millones de kms
        Double Distancia_Urano = 2_870.2d; // Millones de kms
        Double Distancia_Estacion = 408d; // Kms

        Scanner sc = new Scanner(System.in);

        System.out.print("Hola, bienvenido a este viaje intergaláctico... \nCuál es tu nombre? : ");
        String nombre = sc.nextLine();
        System.out.println();
        System.out.println(nombre + """
                , nuevamente te doy una calurosa bienvenida!
                Es muy importante para nosotros conocerte un poco mejor, por lo tanto
                te invitamos a responder algunas preguntas importantes.
                ...Vamos. Continuemos!
                        """);

        System.out.print("Qué edad tienes? : ");
        int edad = sc.nextInt();
        System.out.print("Cuál es tu peso en kgs? : ");
        int peso = sc.nextInt();
        System.out.print("Cuál es tu estatura en cms? : ");
        int estatura = sc.nextInt();
        System.out.println();

        int opcion;

        do {
            System.out.println("A continuación te mostraremos los destinos disponibles: ");
            System.out.println("1. Marte");
            System.out.println("2. Jupiter");
            System.out.println("3. Saturno");
            System.out.println("4. Urano");
            System.out.println("5. Estación Espacial Internacional");
            System.out.println("6. Salir\n");

            System.out.print(nombre + ", por favor elige un destino: ");
            opcion = sc.nextInt();
            System.out.println();

            if (opcion < 1 || opcion > 6) {
                System.out.println("Opción inválida. Por favor, intente nuevamente.\n");
            } else {
                switch (opcion) {
                    case 1:
                        viaje("Marte", Distancia_Marte);
                        break;
                    case 2:
                        viaje("Jupiter", Distancia_Jupiter);
                        break;
                    case 3:
                        viaje("Saturno", Distancia_Saturno);
                        break;
                    case 4:
                        viaje("Urano", Distancia_Urano);
                        break;
                    case 5:
                        viaje("La Estación Espacial Internacional", Distancia_Estacion);
                        break;
                }
            }
        } while (opcion < 1 || opcion > 6);

        sc.close();
    }

    public static void viaje(String destino, double distancia) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Has elegido viajar a " + destino + ".");
        System.out.println("La distancia es de " + distancia + " millones de kms.\n");
    }
}
