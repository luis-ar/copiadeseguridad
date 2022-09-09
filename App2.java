public class App2 {
    private String nombre;
    private String direccion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void entrada() {
        System.out.println("********************************************************************************");
        System.out.println("Bienvenido al teatro " + nombre + " que se encuentra ubicado en " + direccion);
        System.out.println("*********************************************************************************");
    }

    public void funcion1(String curso1, double precio1) {
        System.out.println("Se encuentra en el curso de " + curso1 + " que tiene un costo de " + precio1);

    }

    public void funcion2(String curso2, double precio2) {
        System.out.println("Se encuentra en el curso de " + curso2 + " que tiene un costo de " + precio2);
    }

    public void funcion3(String curso3, double precio3) {
        System.out.println("Se encuentra en el curso de " + curso3 + " que tiene un costo de " + precio3);

    }

    public void funcion4(String curso4, double precio4) {
        System.out.println("Se encuentra en el curso de " + curso4 + " que tiene un costo de " + precio4);

    }

}