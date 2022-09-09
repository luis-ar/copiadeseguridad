public class App10 {
    public static void main(String[] args) throws Exception {
        App12 usuario1 = new App12();
        usuario1.getTitular();
        usuario1.setTitular("Jua Perez");
        usuario1.setSaldo(145678);
        double saldo = usuario1.getSaldo();
        usuario1.entrada();
        double depo = usuario1.deposito(134);
        double reti = usuario1.retiro(179);
        double sal_final = saldo + depo - reti;
        System.out.println("Su saldo final es " + sal_final);

    }
}
