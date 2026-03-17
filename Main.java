import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Logica service = new Logica();

        String cadena1 = "Cadena#1: ";
        String cadena2 = "Cadena#2: ";

        service.imprimir_cadenas(cadena1, cadena2);
        service.caracter_posicion(cadena1);
        service.longitudes(cadena1, cadena2);
        service.buscar_caracteres(cadena1, cadena2);
        service.mayus_minus(cadena1, cadena2);
        service.comparar(cadena1, cadena2);
        service.concatenar(cadena1, cadena2);
        service.contiene_subcadena(cadena1);
        service.subcadena(cadena1);
        service.reemplazar(cadena1);

        service.comparar_objetos();

        System.out.print("\nIngrese una palabra: ");
        String palabra = sc.nextLine();
        System.out.println("Invertida: " + service.invertir_texto(palabra));

        System.out.print("\nIngrese una frase: ");
        String frase = sc.nextLine();

        String sinEspacios = service.eliminar_espacios(frase);
        String invertida = service.invertir_texto(sinEspacios);

        System.out.println("Sin espacios: " + sinEspacios);
        System.out.println("Invertida: " + invertida);

        System.out.print("\nIngrese otra frase: ");
        String frase2 = sc.nextLine();

        int vocales = service.contar_vocales(frase2);
        System.out.println("Número de vocales: " + vocales);
    }
}

