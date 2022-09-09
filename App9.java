import java.util.Scanner;

public class App9 {
    Scanner scan = new Scanner(System.in);
    private String nombre;
    private String categoria;
    private String nombre_producto;
    private double precio;
    private double cantidad;

    public void Ingreso_datos() {
        System.out.println("Ingrese su nombre");
        nombre = scan.next();
        System.out.println("Ingrese el nombre de seccion de productos");
        categoria = scan.next();
        System.out.println("Ingrese el nombre del producto");
        nombre_producto = scan.next();
        System.out.println("Ingrese su precio ");
        precio = scan.nextDouble();
        System.out.println("Ingrese la cantidad comprada en Kg");
        cantidad = scan.nextDouble();
    }

    public void descuento() {
        double total_bruto = precio * cantidad;
        if (total_bruto > 1000) {
            double des = total_bruto * 20 / 100;
            double total_final = total_bruto - des;
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Su nombre es " + nombre);
            System.out.println("Usted compro el producto " + nombre_producto);
            System.out.println("Compro una cantidad de: " + cantidad);
            System.out.println("Su descuento por la compra es: " + des);
            System.out.println("El pasgo final por su compra es: " + total_final);
        } else {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Su nombre es " + nombre);
            System.out.println("Usted compro el producto " + nombre_producto);
            System.out.println("Compro una cantidad de: " + cantidad);
            System.out.println("No hay descuentos");
            System.out.println("El pasgo final por su compra es: " + total_bruto);
        }
    }
}
