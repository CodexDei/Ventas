import java.util.Date;

public class Ventas {


    public static void main(String[] args) {

        //Crear varios objetos de tipo producto
        Producto producto1 = new Producto("Camisa", 50);
        Producto producto2 = new Producto("Pantalon", 100);
        Producto producto3 = new Producto("Clanclas", 20);
        Producto producto4 = new Producto("Camiseta", 50);
        Producto producto5 = new Producto("Boxer", 40);
        Producto producto6 = new Producto("Peine", 5);
        Producto producto7 = new Producto("Medias", 20);
        Producto producto8 = new Producto("Gorra", 35);
        Producto producto9 = new Producto("Saco", 150);
        Producto producto10 = new Producto("Chaqueta", 300);
        Producto producto11 = new Producto("Zapatillas", 250);

        //creamos un objeto de tipo orden
        Orden orden1 = new Orden();
        Orden orden2 = new Orden();

        //agregamos los productos a la orden
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);
        orden1.agregarProducto(producto5);
        orden1.agregarProducto(producto6);
        orden1.agregarProducto(producto7);
        orden1.agregarProducto(producto8);
        orden1.agregarProducto(producto9);
        orden1.agregarProducto(producto10);
        orden1.agregarProducto(producto11);

        orden2.agregarProducto(producto5);
        orden2.agregarProducto(producto7);

        //imprimir orden
        orden1.mostrarorden();
        orden2.mostrarorden();


    }
}
