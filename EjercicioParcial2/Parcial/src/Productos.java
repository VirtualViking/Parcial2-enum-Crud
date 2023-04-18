public enum Productos {

    LAPIZ("Lapiz","Sirve para escribir"), CUADERNO("Cuaderno","Sirve para estudiar"),
    BORRADOR("Borrador","Sirve para borrar"), CARTUCHERA("Cartuchera","Sirve para guardar"),
    SACAPUNTAS("Sacapuntas","Sirve para sacar punta");



    private String nombre;
    private String descripcion;

    Productos(String nombre, String descripcion){
        this.nombre=nombre;
        this.descripcion=descripcion;
    }
    public String getNombre(){return this.nombre;}

    public String getDescripcion(){return  this.descripcion;}
}

