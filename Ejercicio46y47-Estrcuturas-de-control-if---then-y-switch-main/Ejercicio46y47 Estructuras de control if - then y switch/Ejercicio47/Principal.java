import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca un numero entre 1 - 7: ");

        int a = scanner.nextInt();
        String dia;

        switch(a) {
            case 1: dia = "Lunes";
                    break;
            case 2: dia = "martes";
                    break;
            case 3: dia = "miercoles";
                    break;
            case 4: dia = "jueves";
                    break;
            case 5: dia = "viernes";
                    break;
            case 6: dia = "sabado";
                    break;
            case 7: dia = "domingo";

            default: dia = "dia invalido";
                    break;
        }

        System.out.println(dia);
    }
}
