public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;
        StringBuilder sb = new StringBuilder(a);

        int limite = 10000;
        long tiempo = 0;

        tiempo = probar(c,a,b,limite,0,sb);
        System.out.println("Tiempo con concat: " + tiempo);
        tiempo = probar(c,a,b,limite,1,sb);
        System.out.println("Tiempo con +: " + tiempo);
        tiempo = probar(c,a,b,limite,2,sb);
        System.out.println("Tiempo con stringBuilder: " + tiempo);
    }

    private static long probar(String c, String a, String b, int limite,int tipo, StringBuilder sb) {
        long inicio = 0;
        long fin = 0;


        inicio = System.currentTimeMillis();
        for (int i = 0; i < limite; i++) {
            if (tipo == 0) {
                c = c.concat(a).concat(b).concat("\n");
            } else if (tipo == 1) {
                c += a + b + "\n";
            } else if (tipo == 2) {
                sb.append(a).append(b).append("\n");
            }
        }
        fin = System.currentTimeMillis();
        return fin - inicio;
    }
}
