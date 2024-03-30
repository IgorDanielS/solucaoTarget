import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma frase: ");
        String texto = scanner.nextLine();
        
        String textoInvertido = inverterString(texto);
        
        System.out.println("Texto original: " + texto);
        System.out.println("Texto invertido: " + textoInvertido);
        

    }
    
    public static String inverterString(String texto) {
        char[] caracteres = texto.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;
        
        while (inicio < fim) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;
            
            inicio++;
            fim--;
        }
        
        return new String(caracteres);
    }
}
