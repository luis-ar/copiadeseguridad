public class Auto {
    private String marca;
    private String modelo;
    private String traccion;
    private int caballosDeFuerza;
    private int capacidadDePasajeros;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public int getCaballosDeFuerza() {
        return caballosDeFuerza;
    }

    public void setCaballosDeFuerza(int caballosDeFuerza) {
        this.caballosDeFuerza = caballosDeFuerza;
    }

    public int getCapacidadDePasajeros() {
        return capacidadDePasajeros;
    }

    public void setCapacidadDePasajeros(int capacidadDePasajeros) {
        this.capacidadDePasajeros = capacidadDePasajeros;
    }

    String arrancar() {
        return "rumm-rumm";
    }

    String frenar() {
        return "Screech";
    }

    String encenderElAutoradio() {
        return "El auto radio se esta prendiendo";

    }

    String cambiarLaVelocidad(int inicial, String opcion) {
        if (opcion == "aumento") {
            inicial = inicial + 1;
            return "Se encuentra manejando en " + inicial;
        } else if (opcion == "reducir") {
            inicial = inicial - 1;
            return "Se encuentra manejando en " + inicial;

        }
        return "Opcion invalida";

    }

    public static void main(String[] args) {
        Auto auto1 = new Auto();
        System.out.println(auto1.cambiarLaVelocidad(2, "aumento"));

    }
}