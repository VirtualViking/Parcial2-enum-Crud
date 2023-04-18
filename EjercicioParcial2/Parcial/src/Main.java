public class Main {
    public static void main(String[] args) {

        Productos productos = Productos.BORRADOR;
        System.out.println("Esto es un: "+ productos.getNombre() + " y "+ productos.getDescripcion());

        Productos productos1 = Productos.CARTUCHERA;
        System.out.println("Esto es una: "+ productos1.getNombre() + " y "+ productos1.getDescripcion());

        Productos productos2 = Productos.CUADERNO;
        System.out.println("Esto es un: " + productos2.getNombre() + " y "+ productos2.getDescripcion());

        Productos productos3 = Productos.LAPIZ;
        System.out.println("Esto es un: " + productos3.getNombre() + " y "+ productos3.getDescripcion());

        Productos productos4 = Productos.SACAPUNTAS;
        System.out.println("Esto es un: " + productos4.getNombre() + " y "+ productos4.getDescripcion());

    }
}