import java.util.Scanner;

public class InverteString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite uma string para inverter: ");
        String inputString = scanner.nextLine();


        String invertedString = inverterString(inputString);


        System.out.println("String invertida: " + invertedString);

        scanner.close();
    }

    public static String inverterString(String original) {
        char[] caracteres = original.toCharArray();
        int inicio = 0;
        int fim = original.length() - 1;

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
