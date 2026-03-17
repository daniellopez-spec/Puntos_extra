public class Logica {


    public void imprimirCadenas(String c1, String c2) {
        System.out.println("Cadena #1: " + c1);
        System.out.println("Cadena #2: " + c2);
    }

    public void caracterPosicion(String c1) {
        System.out.println("Posicion del caracter #6: " + c1.charAt(6));
    }

    public void longitudes(String c1, String c2) {
        System.out.println("Longitud de la cadena#1: " + c1.length());
        System.out.println("Longitud de la cadena#2: " + c2.length());
    }

    public void buscarCaracteres(String c1, String c2) {
        System.out.println("Primera e de cadena#1: " + c1.indexOf('e'));
        System.out.println("Última e de cadena#2: " + c2.lastIndexOf('e'));
    }

    public void mayusMinus(String c1, String c2) {
        System.out.println("Cadena#1 mayúscula: " + c1.toUpperCase());
        System.out.println("Cadena#2 minúscula: " + c2.toLowerCase());
    }

    public void comparar(String c1, String c2) {
        System.out.println("equals: " + c1.equals(c2));
        System.out.println("equalsIgnoreCase: " + c1.equalsIgnoreCase(c2));
    }

    public void concatenar(String c1, String c2) {
        System.out.println("Concatenación: " + c1.concat(" " + c2));
    }

    public void contieneSubcadena(String c1) {
        System.out.println("Contiene esta: " + c1.contains("esta "));
    }

    public void subcadena(String c1) {
        System.out.println("Subcadena(0-6): " + c1.substring(0, 6));
    }

    public void reemplazar(String c1) {
        System.out.println("Reemplazo(a->i): " + c1.replace('a', 'i'));
    }

    public void compararObjetos() {
        String s1 = "El lenguaje Java ";
        String s2 = new String("El lenguaje Java ");

        System.out.println("Comparación con == : " + (s1 == s2));
        System.out.println("Comparación con equals: " + s1.equals(s2));

        s2 = "El lenguaje Java ";
        System.out.println("Ahora con == : " + (s1 == s2));

        System.out.println("Conclusión: ");
        System.out.println("== compara memoria ");
        System.out.println("equals compara contenido ");
    }

    public String invertirTexto(String texto) {
        return new StringBuilder(texto).reverse().toString();
    }

    public String eliminarEspacios(String texto) {
        return texto.replace( " ", " " );
    }

    public int contarVocales(String texto) {
        int contador = 0;
        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if ("aeiou".indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }
}

