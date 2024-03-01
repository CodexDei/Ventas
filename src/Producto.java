import java.lang.*;

public class Producto {

    //variables de la clase
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos = 1000;

    //contructores de la clase
    Producto() {

        this.idProducto = ++contadorProductos;
    }

    public Producto(String nombre, int precio) {

        //llama al contructor sin parametros
        this();

        this.nombre = nombre;
        this.precio = precio;
    }

    //metodos gets y sets
    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    //metodos de la clase
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getContadorProductos(){

        return contadorProductos;
    }

    //metodo toString
    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombre=" + nombre +
                ", precio=" + precio +
                '}';
    }
}
