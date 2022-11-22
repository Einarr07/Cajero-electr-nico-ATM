import java.util.Scanner;
public class cuenta {
    //Atributos
    String nombre_cuenta;
    double deposito;
    double estado_actual;
    double retiro;

    //
    public cuenta(){
        nombre_cuenta = "Mateo Congo";
        deposito = 0;
        estado_actual = 100;
    }
    Scanner entrada = new Scanner(System.in);
    int menu() {
        int op = -1;
        while ((op < 0) || ( op > 3)) {
            System.out.println("---------------------------------------");
            System.out.println("| BIENVENIDO A LA CUENTA DE BANCO |");
            System.out.println("---------------------------------------");
            System.out.println("---------------------------------------------");
            System.out.println("|     1.- Realizar un deposito               |");
            System.out.println("|                                           |");
            System.out.println("|     2.- Realizar un retiro                |");
            System.out.println("|                                           |");
            System.out.println("|     3.- Salir                             |");
            System.out.println("---------------------------------------------");
            System.out.print("Ingrese la opcion que desea ejecutar: ");
            op = entrada.nextInt();

            if ((op < 0) || (op > 3)){
                System.out.println("--------------------");
                System.out.println("| Opcion no valida |");
                System.out.println("--------------------");
            }
        }
        return op;
    }
    public void cuenta (cuenta datos1)
    {
        System.out.println("El estado de su cuenta es");
    }
    public void setNombre_cuenta(String nombre_cuenta) {
        this.nombre_cuenta = nombre_cuenta;
    }

    public String getNombre_cuenta() {
        return this.nombre_cuenta;
    }

    public Scanner getEntrada() {
        return this.entrada;
    }

    public void setEntrada(final Scanner entrada) {
        this.entrada = entrada;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getEstado_actual() {
        return estado_actual;
    }

    public void setEstado_actual(double estado_actual) {
        this.estado_actual = estado_actual;
    }

    public double getRetiro() {
        return retiro;
    }

    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }
}