import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        if (verificarFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }
    
    public static boolean verificarFibonacci(int numero) {
        int a = 0;
        int b = 1;
        
        while (a <= numero) {
            if (a == numero) {
                return true;
            }
            int temp = a + b;
            a = b;
            b = temp;
        }
        
        return false;
    }
}
