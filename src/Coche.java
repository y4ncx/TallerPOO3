public class Coche {
    private String marca;
    private String modelo;
    private static int contadorCoches = 0;

    public Coche(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;

    }


    public static int MostrarContadorCoches(){
        return contadorCoches;
    }

    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Supra");
        Coche coche2 = new Coche("Nissan", "Skyline");
        Coche coche3 = new Coche("Honda", "Civic");

        System.out.println("La cantidad de coches creados es de = " + MostrarContadorCoches());
    }


}
