import javax.swing.JOptionPane;

public class App7  {
        private int eleccion;
        private int menu_terrestre;
        private int menu_aereo;
        private int opcion_cuzco;
        private int opcion_juliaca;
        private int opcion_arequipa;
        private int opcion_tacna;
        private int opcion_chimbote;
        private int opcion_ayacucho;
        private int pasajes;
        private double costo_final;
        private String nombre;
        private String apellido;
        private int dni;
        private int lugar_partida;
        private int edad;
        private int primera_vez;
        private double des;
        private double pago_final;
        String[] salida = { "Lima", "Tacna", "Ica" };
        String[] destino = { "Cuzco", "Juliaca", "Arequipa", "Tacna", "Chimbote", "Ayacucho" };
        int[] precio = { 45, 65, 105, 95, 35, 85, 150, 215, 145, 265, 175, 195 };
        int i;
        int a;

        public void datos_personales() {
                nombre = JOptionPane.showInputDialog("Ingrese su nombre");
                apellido = JOptionPane.showInputDialog("Ingrese su apellido");
                dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de DNI"));
                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));

        }
        // boletos

        public void boleto_normal() {

                JOptionPane.showMessageDialog(null, "**Boleta de compra** \n" +
                                "Usuario: " + nombre + " " + apellido + "                    DNI: " + dni + "\n"
                                +
                                "Lugar de partida: " + salida[(lugar_partida - 1)] + "            Lugar de llegada: "
                                + destino[i] + "\n"
                                +
                                "****************************************************\n"
                                +
                                "C. Boletos                   " + "P.U                       " + "I.T \n" +
                                "       " + pasajes + "                              " + precio[a]
                                + "                     "
                                + costo_final + "\n"
                                +
                                "****************************************************\n" +
                                "Importe a pagar: S/" + costo_final);
        }

        public void boleto_descuento() {
                JOptionPane.showMessageDialog(null, "**Boleta de compra** \n" +
                                "Usuario: " + nombre + " " + apellido + "                    DNI: " + dni + "\n"
                                +
                                "Lugar de partida: " + salida[(lugar_partida - 1)] + "            Lugar de llegada: "
                                + destino[i] + "\n"
                                +
                                "****************************************************\n"
                                +
                                "C. Boletos                   " + "P.U                       " + "I.T \n" +
                                "       " + pasajes + "                              " + precio[a]
                                + "                       "
                                + costo_final + "\n"
                                +
                                "****************************************************\n" +
                                "Importe a pagar: S/" + costo_final + "\n" +
                                "Descuento: S/" + des + "\n" +
                                "Total a pagar: S/" + pago_final);

        }

        // validadcion de edad
        public void validacion() {
                if (edad >= 18) {
                        primera_vez = Integer.parseInt(JOptionPane.showInputDialog(
                                        "¿Es la primera vez que viaja al interior del país? \n" +
                                                        "Opción 1: Si \n" +
                                                        "Opción 2: No \n" +
                                                        "Eliga su opción"));
                        descuento();
                        lugar_partida = Integer.parseInt(JOptionPane.showInputDialog(
                                        "¿Ingrese su lugar de partida? \n" +
                                                        "Opción 1: Lima \n" +
                                                        "Opción 2: Tacna \n" +
                                                        "Opción 3: Ica \n" +
                                                        "Eliga su opción"));

                        forma_viaje();
                        despliegue_menu();

                } else {
                        JOptionPane.showMessageDialog(null,
                                        "Usted no puede viajar, es menor de edad");

                }
        }
        // descuento

        public void descuento() {
                if (primera_vez == 1) {
                        JOptionPane.showMessageDialog(null,
                                        "Felicitaciones obtuvo un descuento del 15%");

                }
        }

        public void forma_viaje() {
                // tipo de viaje

                eleccion = Integer.parseInt(JOptionPane.showInputDialog(
                                "¿De que forma va a viajar? \n" +
                                                "Opción 1: Terrestre \n" +
                                                "Opción 2: Aéreo \n" +
                                                "Eliga su opción"));

        }

        // menu

        public void despliegue_menu() {
                if (eleccion == 1) {
                        menu_terrestre = Integer.parseInt(JOptionPane.showInputDialog(
                                        "Destinos disponibles en transporte terrestre \n" +
                                                        "Opción 1: Cuzco \n" +
                                                        "Opción 2: Juliaca \n" +
                                                        "Opción 3: Arequipa \n" +
                                                        "Eliga su opción"));
                        switch (menu_terrestre) {
                                case 1:
                                        opcion_cuzco = Integer.parseInt(JOptionPane.showInputDialog(
                                                        "Empresas de transporte disponibles para Cuzco \n" +
                                                                        "Opción 1: El Emperador \n" +
                                                                        "Opción 2: Las Flores \n" +
                                                                        "Eliga su opción"));
                                        switch (opcion_cuzco) {
                                                case 1:
                                                        pasajes = Integer.parseInt(
                                                                        JOptionPane.showInputDialog(
                                                                                        "Ingrese la cantidad de pasajes que va a comprar"));
                                                        costo_final = pasajes * 45;
                                                        i = 0;
                                                        a = 0;
                                                        des = costo_final * 15 / 100;
                                                        pago_final = costo_final - des;

                                                        if (primera_vez == 1) {
                                                                boleto_descuento();

                                                        } else {
                                                                boleto_normal();
                                                        }

                                                        break;
                                                case 2:
                                                        pasajes = Integer.parseInt(
                                                                        JOptionPane.showInputDialog(
                                                                                        "Ingrese la cantidad de pasajes que va a comprar"));
                                                        costo_final = pasajes * 65;
                                                        i = 0;
                                                        a = 1;
                                                        des = costo_final * 15 / 100;
                                                        pago_final = costo_final - des;

                                                        if (primera_vez == 1) {
                                                                boleto_descuento();

                                                        } else {
                                                                boleto_normal();
                                                        }

                                                        break;
                                                default:
                                                        JOptionPane.showMessageDialog(null,
                                                                        "La opción ingresada es incorrecta");
                                                        break;
                                        }

                                        break;
                                case 2:
                                        opcion_juliaca = Integer.parseInt(JOptionPane.showInputDialog(
                                                        "Empresas de transporte disponibles para Juliaca \n" +
                                                                        "Opción 1: Movil Bus \n" +
                                                                        "Opción 2: Civa \n" +
                                                                        "Eliga su opción"));
                                        switch (opcion_juliaca) {
                                                case 1:
                                                        pasajes = Integer.parseInt(
                                                                        JOptionPane.showInputDialog(
                                                                                        "Ingrese la cantidad de pasajes que va a comprar"));
                                                        costo_final = pasajes * 105;
                                                        i = 1;
                                                        a = 2;
                                                        des = costo_final * 15 / 100;
                                                        pago_final = costo_final - des;

                                                        if (primera_vez == 1) {
                                                                boleto_descuento();

                                                        } else {
                                                                boleto_normal();
                                                        }

                                                        break;
                                                case 2:
                                                        pasajes = Integer.parseInt(
                                                                        JOptionPane.showInputDialog(
                                                                                        "Ingrese la cantidad de pasajes que va a comprar"));
                                                        costo_final = pasajes * 95;
                                                        i = 1;
                                                        a = 3;
                                                        des = costo_final * 15 / 100;
                                                        pago_final = costo_final - des;

                                                        if (primera_vez == 1) {
                                                                boleto_descuento();

                                                        } else {
                                                                boleto_normal();
                                                        }

                                                        break;
                                                default:
                                                        JOptionPane.showMessageDialog(null,
                                                                        "La opción ingresada es incorrecta");
                                                        break;
                                        }

                                        break;
                                case 3:
                                        opcion_arequipa = Integer.parseInt(JOptionPane.showInputDialog(
                                                        "Empresas de transporte disponibles para Arequipa \n" +
                                                                        "Opción 1: Soyuz \n" +
                                                                        "Opción 2: Perú Bus \n" +
                                                                        "Eliga su opción"));
                                        switch (opcion_arequipa) {
                                                case 1:
                                                        pasajes = Integer.parseInt(
                                                                        JOptionPane.showInputDialog(
                                                                                        "Ingrese la cantidad de pasajes que va a comprar"));
                                                        costo_final = pasajes * 35;
                                                        i = 2;
                                                        a = 4;
                                                        des = costo_final * 15 / 100;
                                                        pago_final = costo_final - des;

                                                        if (primera_vez == 1) {
                                                                boleto_descuento();

                                                        } else {
                                                                boleto_normal();
                                                        }

                                                        break;
                                                case 2:
                                                        pasajes = Integer.parseInt(
                                                                        JOptionPane.showInputDialog(
                                                                                        "Ingrese la cantidad de pasajes que va a comprar"));
                                                        costo_final = pasajes * 85;
                                                        i = 2;
                                                        a = 5;
                                                        des = costo_final * 15 / 100;
                                                        pago_final = costo_final - des;

                                                        if (primera_vez == 1) {
                                                                boleto_descuento();

                                                        } else {
                                                                boleto_normal();
                                                        }

                                                        break;
                                                default:
                                                        JOptionPane.showMessageDialog(null,
                                                                        "La opción ingresada es incorrecta");
                                                        break;
                                        }

                                        break;

                                default:
                                        JOptionPane.showMessageDialog(null, "La opción ingresada es incorrecta");
                                        break;
                        }

                } else if (eleccion == 2) {
                        menu_aereo = Integer.parseInt(JOptionPane.showInputDialog(
                                        "Destinos disponibles en transporte aéreo \n" +
                                                        "Opción 1: Tacna \n" +
                                                        "Opción 2: Chimbote \n" +
                                                        "Opción 3: Ayacucho \n" +
                                                        "Eliga su opción"));
                        switch (menu_aereo) {
                                case 1:
                                        opcion_tacna = Integer.parseInt(JOptionPane.showInputDialog(
                                                        "Aerolineas disponibles para Tacna \n" +
                                                                        "Opción 1: Avianca \n" +
                                                                        "Opción 2: LATAM Airlines \n" +
                                                                        "Eliga su opción"));
                                        switch (opcion_tacna) {
                                                case 1:
                                                        pasajes = Integer.parseInt(
                                                                        JOptionPane.showInputDialog(
                                                                                        "Ingrese la cantidad de pasajes que va a comprar"));
                                                        costo_final = pasajes * 150;
                                                        i = 3;
                                                        a = 6;
                                                        des = costo_final * 15 / 100;
                                                        pago_final = costo_final - des;

                                                        if (primera_vez == 1) {
                                                                boleto_descuento();

                                                        } else {
                                                                boleto_normal();
                                                        }

                                                        break;
                                                case 2:
                                                        pasajes = Integer.parseInt(
                                                                        JOptionPane.showInputDialog(
                                                                                        "Ingrese la cantidad de pasajes que va a comprar"));
                                                        costo_final = pasajes * 215;
                                                        i = 3;
                                                        a = 7;
                                                        des = costo_final * 15 / 100;
                                                        pago_final = costo_final - des;

                                                        if (primera_vez == 1) {
                                                                boleto_descuento();

                                                        } else {
                                                                boleto_normal();
                                                        }

                                                        break;
                                                default:
                                                        JOptionPane.showMessageDialog(null,
                                                                        "La opción ingresada es incorrecta");
                                                        break;
                                        }

                                        break;
                                case 2:
                                        opcion_chimbote = Integer.parseInt(JOptionPane.showInputDialog(
                                                        "Aerolineas disponibles para Chimbote \n" +
                                                                        "Opción 1: Iberia \n" +
                                                                        "Opción 2: Sky Airline \n" +
                                                                        "Eliga su opción"));
                                        switch (opcion_chimbote) {
                                                case 1:
                                                        pasajes = Integer.parseInt(
                                                                        JOptionPane.showInputDialog(
                                                                                        "Ingrese la cantidad de pasajes que va a comprar"));
                                                        costo_final = pasajes * 145;
                                                        i = 4;
                                                        a = 8;
                                                        des = costo_final * 15 / 100;
                                                        pago_final = costo_final - des;

                                                        if (primera_vez == 1) {
                                                                boleto_descuento();

                                                        } else {
                                                                boleto_normal();
                                                        }

                                                        break;
                                                case 2:
                                                        pasajes = Integer.parseInt(
                                                                        JOptionPane.showInputDialog(
                                                                                        "Ingrese la cantidad de pasajes que va a comprar"));
                                                        costo_final = pasajes * 265;
                                                        i = 4;
                                                        a = 9;
                                                        des = costo_final * 15 / 100;
                                                        pago_final = costo_final - des;

                                                        if (primera_vez == 1) {
                                                                boleto_descuento();

                                                        } else {
                                                                boleto_normal();
                                                        }

                                                        break;
                                                default:
                                                        JOptionPane.showMessageDialog(null,
                                                                        "La opción ingresada es incorrecta");
                                                        break;
                                        }

                                        break;
                                case 3:
                                        opcion_ayacucho = Integer.parseInt(JOptionPane.showInputDialog(
                                                        "Aerolineas disponibles para Ayacucho \n" +
                                                                        "Opción 1: Copa Airlines \n" +
                                                                        "Opción 2: Peruvian Airlines \n" +
                                                                        "Eliga su opción"));
                                        switch (opcion_ayacucho) {
                                                case 1:
                                                        pasajes = Integer.parseInt(
                                                                        JOptionPane.showInputDialog(
                                                                                        "Ingrese la cantidad de pasajes que va a comprar"));
                                                        costo_final = pasajes * 175;
                                                        i = 5;
                                                        a = 10;
                                                        des = costo_final * 15 / 100;
                                                        pago_final = costo_final - des;

                                                        if (primera_vez == 1) {
                                                                boleto_descuento();

                                                        } else {
                                                                boleto_normal();
                                                        }

                                                        break;
                                                case 2:
                                                        pasajes = Integer.parseInt(
                                                                        JOptionPane.showInputDialog(
                                                                                        "Ingrese la cantidad de pasajes que va a comprar"));
                                                        costo_final = pasajes * 195;
                                                        i = 5;
                                                        a = 11;
                                                        des = costo_final * 15 / 100;
                                                        pago_final = costo_final - des;

                                                        if (primera_vez == 1) {
                                                                boleto_descuento();

                                                        } else {
                                                                boleto_normal();
                                                        }
                                                        ;

                                                        break;
                                                default:
                                                        JOptionPane.showMessageDialog(null,
                                                                        "La opción ingresada es incorrecta");
                                                        break;
                                        }

                                        break;

                                default:
                                        JOptionPane.showMessageDialog(null, "La opción ingresada es incorrecta");
                                        break;
                        }

                } else {
                        JOptionPane.showMessageDialog(null, "La opción ingresada es incorrecta");

                }
        }

}
