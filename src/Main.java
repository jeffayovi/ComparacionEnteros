import java.util.Scanner;

/**
 * Escriba una aplicación que pida al usuario que escriba dos enteros, que obtenga
 * los números del usuario y muestre el número más grande, seguido de las palabras “es más grande”. Si los números son
 * iguales, imprima el mensaje “Estos números son iguales”
 *
 * */
public class Main {
    public static void main(String[] args) {

        Scanner entrada =new Scanner(System.in);

        //Pedir y leer dos numeros
        System.out.println(" Escribe el primer numero: ");
        int numero1 = entrada.nextInt();

        System.out.println(" Escribe el segundo numero: ");
        int numero2 = entrada.nextInt();

        //Mostrar mensajes
        if (numero1 > numero2)
            System.out.println(numero1 + " es mas grande "+ numero2);
        if (numero2 > numero1)
            System.out.println(numero2 + " es mas grande "+ numero1);
        if (numero2 == numero1)
            System.out.println(" Estos números son iguales ");

        entrada.close();


    }
}