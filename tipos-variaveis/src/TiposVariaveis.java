public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // ** VARIÁVEIS **
        //>> TIPOS PRIMITIVOS - JAVA

        // - Inteiros
        byte numeroByte = 127; // Memória = 1 bytes
        short numeroShort = 32767; // Memória = 2 bytes
        int numeroInt = 2147483647; // Memória = 4 bytes
        long numeroLong = 9223372036854775807L; // Memória = 8 bytes

        // - Reais
        float numeroFloat = 1.23F; // Memória = 4 bytes
        double numeroDouble = 1.23; // Memória = 8 bytes

        // - Lógico
        boolean ehDomingo = false;

        // - Caracteres
        char eixo = 'x';

        //>> CLASSES JAVA
        //Variáveis do tipo String guardam referências a objetos, e não um valor, como acontece com os tipos primitivos.

        // - Cadeia de Caracteres - Strings
        String estado = "Minas Gerais";

        // ** CONSTANTES **
        // Constante não pode ter o seu valor alterado.
        final double VALOR_DE_PI = 3.14;
        
    }
}
