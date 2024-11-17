public class EjemploStatic {
    private static int atributoSinStatic = 10; // no tiene static

    public static void metodoStatic(){

        atributoSinStatic = 20; // no puede agarrar el atributo Static
        System.out.println("El valor de atributoSinStatic es = " + atributoSinStatic);
    }

}
