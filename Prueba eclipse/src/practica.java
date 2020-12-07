import java.util.Scanner;

public class practica
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce primer numero: ");
        int numero1 = teclado.nextInt();
        System.out.println("Introduce segundo numero: ");
        int numero2 = teclado.nextInt();
        int suma = 0;
        int suma2 = 0;
        funcion(numero1,suma);
        funcion2(numero2,suma2);
        if (funcion(numero1,suma) == funcion2(numero2,suma)){
            System.out.println("Son amigos");
        }else{
            System.out.println("No son amigos");
            }
        }

    public static int funcion(int numero1,int suma) {
        for (int i = 1; i < numero1-1; i++) {
            if (numero1 % i == 0) {
                suma += 0;
            }
        }
        return suma;
    }

    public static int funcion2(int numero2, int suma2) {
        for (int i = 1; i < numero2-1; i++) {
            if (numero2 % i == 0) {
                suma2 += 0;
            }
        }
        return suma2;
    }
}
