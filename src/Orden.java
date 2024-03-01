import javax.swing.*;
import java.util.Date;

public class Orden {

    //variables de la clase
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 20;
    Date fecha = new Date();
    private static StringBuilder mensaje;

    //constructor de la clase
    public Orden(){

        this.idOrden = ++contadorOrdenes;
        //inicializar el producto
        productos = new Producto[MAX_PRODUCTOS];
    }

    //metodos de la clase
    public void agregarProducto(Producto producto){

        if (this.contadorProductos < MAX_PRODUCTOS){

            productos[contadorProductos++] = producto;

        }else {

            JOptionPane.showMessageDialog(null,"Se ha superado el maximo de productos");
        }

    }

    public double calcularTotal(){

        double total = 0;

            for (int i = 0; i < this.contadorProductos; i++){

                    Producto producto = this.productos[i];
                    total += producto.getPrecio();
            }
            return total;
    }

    public void mostrarorden (){

        mensaje = new StringBuilder("RECIBO DE LA ORDEN \n\n");

        mensaje.append("Orden #:" + this.idOrden).append("\n\n");
        mensaje.append(fecha).append("\n\n");
        mensaje.append("Total de la orden: $" + this.calcularTotal()).append("\n\n");
        mensaje.append("Productos de la orden:").append("\n\n");

        for (int i = 0; i < contadorProductos; i++){

            mensaje.append(productos[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null,mensaje,"TIENDA DON JORGE",JOptionPane.INFORMATION_MESSAGE);
    }

}
