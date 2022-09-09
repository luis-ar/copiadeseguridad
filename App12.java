
public class App12 {
    private String titular;
    private double saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void entrada() {
        System.out.println("**************************************************************");
        System.out.println(titular + ", bienvenido acaba de entrar a su cuenta bancaria");
        System.out.println("**************************************************************");
    }

    public double deposito(double cant_deposito) {
        if (cant_deposito < 0) {
            System.out.println("Ingreso del valor del deposito es incorrecto");
        } else {
            System.out.println("La cantidad depositada es " + cant_deposito);

        }
        return cant_deposito;

    }

    public double retiro(double cant_retiro) {
        if (cant_retiro < saldo) {
            System.out.println("Lo que retiro es " + cant_retiro);

        } else {
            System.out.println("Ingreso del valor del retiro es incorrecto");

        }
        return cant_retiro;
    }

}
