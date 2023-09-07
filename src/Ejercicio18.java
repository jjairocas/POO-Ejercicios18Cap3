import java.util.Scanner;

public class Ejercicio18 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el código del empleado: ");
        int cod_empleado = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese los nombres del empleado: ");
        String nombres = entrada.nextLine();
        System.out.println("Ingrese la cantidad de horas trabajadas al mes: ");
        float horas_mes = entrada.nextFloat();
        System.out.println("Ingrese el valor de la hora: ");
        float valor_hora = entrada.nextFloat();
        System.out.println("Ingrese el porcentaje de retención de la fuente: ");
        float retenc_fuente = entrada.nextFloat();
        /* el siguiente condicional da la posibilidad de escribir el porcentaje con un valor del 1 al 100 o como un decimal del 0 al 1*/
        if(retenc_fuente > 1){
            retenc_fuente = retenc_fuente/100;
        }
        else{
            retenc_fuente= retenc_fuente;
        }
        System.out.println("Código: " + cod_empleado);
        System.out.println("Nombres: " + nombres);
        System.out.println("Salario bruto: " + horas_mes * valor_hora);
        System.out.println("Salario neto: " + (horas_mes* valor_hora-horas_mes*valor_hora*retenc_fuente));

    }

}