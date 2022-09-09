
//problema3 
public class App8 {
    private double aumento;
    private double pago_final = 0;
    int talla;
    String modelo;

    public void zapatos() {
        if (modelo == "ejecutivo") {
            aumento = talla - 8;
            pago_final = 345.5 + aumento * 10;
        } else if (modelo == "premier") {
            aumento = talla - 8;
            pago_final = 298.7 + aumento * 10;

        } else if (modelo == "emperador") {
            aumento = talla - 8;
            pago_final = 246 + aumento * 10;

        }

    }

    @Override
    public String toString() {

        return "El modelo " + modelo + " de talla " + talla + " cuesta " + pago_final;
    }

}