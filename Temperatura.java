import java.util.Scanner;
import javax.swing.JOptionPane;

public class Temperatura {
    private String hora;
    private int fecha;
    private int dni;
    private String nombre;
    private String apellido;
    int dia1, dia2, dia3, dia4, dia5, dia6, dia7, dia8, dia9, dia10, dia11, dia12, dia13, dia14, dia15, dia16, dia17,
            dia18, dia19, dia20, dia21, dia22, dia23, dia24, dia25, dia26, dia27, dia28, dia29, dia30;
    String[] base_hora = new String[10000];
    String[] base_apellido = new String[10000];
    String[] base_nombre = new String[10000];
    int[] base_dni = new int[10000];
    int[] base_fecha = new int[10000];

    public String getHora() {
        return hora;
    }

    public void setSaldo(String hora) {
        this.hora = hora;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;

    }

    public int getDni() {
        return dni;
    }

    public void setDNI(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;

    }

    public void pedida_data() {
        for (int i = 0; i < 150; i++) {
            fecha = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fecha de su cita (1-30)"));
            if (fecha > 30) {
                JOptionPane.showMessageDialog(null, "La fecha ingresada es incorrecta");
                fecha = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fecha de su cita (1-30)"));

            }
            hora = (JOptionPane.showInputDialog("Ingrese la hora de su cita"));
            nombre = (JOptionPane.showInputDialog("Ingrese su nombre"));
            apellido = (JOptionPane.showInputDialog("Ingrese su apellido"));
            dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de DNI"));
            base_hora[i] = hora;
            base_apellido[i] = apellido;
            base_dni[i] = dni;
            base_nombre[i] = nombre;
            base_fecha[i] = fecha;

        }
        for (int i = 0; i < 150; i++) {
            switch (base_fecha[i]) {
                case 1:
                    dia1 = dia1 + 1;

                    break;
                case 2:
                    dia2 = dia2 + 1;
                    break;
                case 3:
                    dia3 = dia3 + 1;

                    break;
                case 4:
                    dia4 = dia4 + 1;

                    break;
                case 5:
                    dia5 = dia5 + 1;
                    break;
                case 6:
                    dia6 = dia6 + 1;

                    break;
                case 7:
                    dia7 = dia7 + 1;

                    break;
                case 8:
                    dia8 = dia8 + 1;
                    break;
                case 9:
                    dia9 = dia9 + 1;
                    break;
                case 10:
                    dia10 = dia10 + 1;

                    break;
                case 11:
                    dia11 = dia11 + 1;

                    break;
                case 12:
                    dia12 = dia12 + 1;

                    break;
                case 13:
                    dia13 = dia13 + 1;

                    break;
                case 14:
                    dia14 = dia14 + 1;
                    break;
                case 15:
                    dia15 = dia15 + 1;

                    break;
                case 16:
                    dia16 = dia16 + 1;
                    break;
                case 17:
                    dia17 = dia17 + 1;

                    break;
                case 18:
                    dia18 = dia18 + 1;

                    break;
                case 19:
                    dia19 = dia19 + 1;

                    break;
                case 20:
                    dia20 = dia20 + 1;
                    break;
                case 21:
                    dia21 = dia21 + 1;

                    break;
                case 22:
                    dia22 = dia22 + 1;

                    break;
                case 23:
                    dia23 = dia23 + 1;

                    break;
                case 24:
                    dia24 = dia24 + 1;

                    break;
                case 25:
                    dia25 = dia25 + 1;

                    break;
                case 26:
                    dia26 = dia26 + 1;

                    break;
                case 27:
                    dia27 = dia27 + 1;

                    break;
                case 28:
                    dia28 = dia28 + 1;

                    break;
                case 29:
                    dia29 = dia29 + 1;
                    break;
                case 30:
                    dia30 = dia30 + 1;
                    break;

                default:

                    break;
            }
        }
        JOptionPane.showMessageDialog(null, "La cantidad de pacientes en el dia 1 son: " + dia1
                + "\n La cantidad de pacientes en el dia 2 son: " + dia2
                + "\n La cantidad de pacientes en el dia 3 son: " + dia3
                + "\n La cantidad de pacientes en el dia 4 son: " + dia4
                + "\n La cantidad de pacientes en el dia 5 son: " + dia5
                + "\n La cantidad de pacientes en el dia 6 son: " + dia6
                + "\n La cantidad de pacientes en el dia 7 son: " + dia7
                + "\n La cantidad de pacientes en el dia 8 son: " + dia8
                + "\n La cantidad de pacientes en el dia 9 son: " + dia9
                + "\n La cantidad de pacientes en el dia 10 son: " + dia10
                + "\n La cantidad de pacientes en el dia 11 son: " + dia11
                + "\n La cantidad de pacientes en el dia 12 son: " + dia12
                + "\n La cantidad de pacientes en el dia 13 son: " + dia13
                + "\n La cantidad de pacientes en el dia 14 son: " + dia14
                + "\n La cantidad de pacientes en el dia 15 son: " + dia15
                + "\n La cantidad de pacientes en el dia 16 son: " + dia16
                + "\n La cantidad de pacientes en el dia 17 son: " + dia17
                + "\n La cantidad de pacientes en el dia 18 son: " + dia18
                + "\n La cantidad de pacientes en el dia 19 son: " + dia19
                + "\n La cantidad de pacientes en el dia 20 son: " + dia20
                + "\n La cantidad de pacientes en el dia 21 son: " + dia21
                + "\n La cantidad de pacientes en el dia 22 son: " + dia22
                + "\n La cantidad de pacientes en el dia 23 son: " + dia23
                + "\n La cantidad de pacientes en el dia 24 son: " + dia24
                + "\n La cantidad de pacientes en el dia 25 son: " + dia25
                + "\n La cantidad de pacientes en el dia 26 son: " + dia26
                + "\n La cantidad de pacientes en el dia 27 son: " + dia27
                + "\n La cantidad de pacientes en el dia 28 son: " + dia28
                + "\n La cantidad de pacientes en el dia 29 son: " + dia29
                + "\n La cantidad de pacientes en el dia 30 son: " + dia30

        );

    }
}
