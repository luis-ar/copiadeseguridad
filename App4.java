import java.util.Scanner;

//problema2
public class App4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de unidades que adquiridas del producto A");
        int cantidad = scan.nextInt();
        System.out.println("Ingrese la cantidad de unidades que adquiridas del producto B");
        int cantidad1 = scan.nextInt();
        System.out.println("Ingrese la cantidad de unidades que adquiridas del producto C");
        int cantidad2 = scan.nextInt();

        if (cantidad > 50) {
            int monto_bruto = cantidad * 25;
            Double descuento = monto_bruto * 0.15;
            Double monto_final = monto_bruto - descuento;
            System.out.println("");
            System.out.println("Su importe bruto del producto A es: $" + monto_bruto);
            System.out.println("Su descuento del producto A es: $" + descuento);
            System.out.println("Su importe total del producto A es: $" + monto_final);
            System.out.println("");

        } else {
            int monto_bruto = cantidad * 25;
            int descuento = 0;
            int monto_final = monto_bruto - descuento;
            System.out.println("");
            System.out.println("Su importe bruto del producto A es: $" + monto_bruto);
            System.out.println("Su descuento del producto A es: $" + descuento);
            System.out.println("Su importe total del producto A es: $" + monto_final);
            System.out.println("");

        }

        if (cantidad1 > 35) {
            Double monto_bruto = cantidad * 27.5;
            Double descuento = monto_bruto * 0.1;
            Double monto_final = monto_bruto - descuento;
            System.out.println("Su importe bruto del producto B es: $" + monto_bruto);
            System.out.println("Su descuento del producto B es: $" + descuento);
            System.out.println("Su importe total del producto B es: $" + monto_final);
            System.out.println("");

        } else {
            Double monto_bruto = cantidad * 27.5;
            int descuento = 0;
            Double monto_final = monto_bruto - descuento;
            System.out.println("Su importe bruto del producto B es: $" + monto_bruto);
            System.out.println("Su descuento del producto B es: $" + descuento);
            System.out.println("Su importe total del producto B es: $" + monto_final);
            System.out.println("");

        }

        if (cantidad2 > 20) {
            Double monto_bruto = cantidad * 30.5;
            Double descuento = monto_bruto * 0.08;
            Double monto_final = monto_bruto - descuento;
            System.out.println("Su importe bruto del producto C es: $" + monto_bruto);
            System.out.println("Su descuento del producto C es: $" + descuento);
            System.out.println("Su importe total del producto C es: $" + monto_final);
            System.out.println("");

        } else {
            Double monto_bruto = cantidad * 30.5;
            int descuento = 0;
            Double monto_final = monto_bruto - descuento;
            System.out.println("Su importe bruto del producto C es: $" + monto_bruto);
            System.out.println("Su descuento del producto C es: $" + descuento);
            System.out.println("Su importe total del producto C es: $" + monto_final);
            System.out.println("");

        }

    }

}