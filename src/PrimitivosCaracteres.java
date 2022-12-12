public class PrimitivosCaracteres {
    public static void main(String[] args) {
        var caracter = '\u0040';
        var decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("caracter == decimal: " + (caracter == decimal));

        System.out.println();
        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo == caracter: " + (simbolo == caracter));

//        char espacio = ' ';
        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulado = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("char corresponde en byte:" + System.lineSeparator() + Character.SIZE);
        System.out.println("char corresponde en bites = " + Character.BYTES);
        System.out.println("Valor minimo char = " + Character.MIN_VALUE);
        System.out.println("Valor maximo char = " + Character.MAX_VALUE);

    }
}
