public class EjemploStringMetodos {
    public static void main(String[] args) {
        funcionAndres();
        funcionTrabalenguas();



    }

    private static void funcionTrabalenguas() {
        String trabalengua = "trabalenguas";
        System.out.println("trabalenguas = " + trabalengua);
        System.out.println("trabalenguas.replace('a', 'e') = " + trabalengua.replace('a', '.'));
        System.out.println("trabalengua = " + trabalengua);
        System.out.println("trabalengua.indexOf('a') = " + trabalengua.indexOf('a'));
        System.out.println("trabalengua.lastIndexOf('a') = " + trabalengua.lastIndexOf('a'));
        System.out.println("trabalengua.lastIndexOf('a') = " + trabalengua.lastIndexOf('z'));
        System.out.println("trabalengua.contains(\"bal\") = " + trabalengua.contains("bal"));
        System.out.println("trabalengua.contains(\"bal\") = " + trabalengua.contains("mer"));
        System.out.println("trabalengua.startsWith(\"tra\") = " + trabalengua.startsWith("tra"));
        System.out.println("trabalengua.endsWith()(\"lenguas\") = " + trabalengua.endsWith("lenguas"));
        System.out.println(" trabalenguas  ".trim());

    }

    private static void funcionAndres() {
        String nombre = "Andres";
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Andres\") = " + nombre.equals("Andres"));
        System.out.println("nombre.equals(\"andres\") = " + nombre.equals("andres"));
        System.out.println("nombre.equalsIgnoreCase(\"andres\") = " + nombre.equalsIgnoreCase("andres"));
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres"));
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length() - 1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1, 4));
        System.out.println("nombre.substring(nombre.length() - 2) = " + nombre.substring(nombre.length() - 2));
    }
}
