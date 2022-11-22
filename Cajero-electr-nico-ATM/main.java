public class Main {
    public static void main(String[] args) {
        cuenta datos1 = new  cuenta();

        cuenta menu_de_opciones = new cuenta();
        cuenta menu_registro = new  cuenta();

        int op_registro = 0;
        boolean salir = false;

        while (!salir) {
            switch (menu_de_opciones.menu()) {
                case 1:

                    System.out.println("El estado actual de su cuenta es" + datos1.getNombre_cuenta());
                    System.out.println("Cuanto dinero quiere depositar: ");

                    break;
                case 2:
                    System.out.println("");

                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("-------------------");
                    System.out.println("| OPCION NO VALIDA|");
                    System.out.println("-------------------");
            }
        }
        System.out.println("-------------------------");
        System.out.println("| GRACIAS VUELVA PRONTO |");
        System.out.println("-------------------------");
    }
}


