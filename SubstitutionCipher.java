import java.util.Scanner;

public class SubstitutionCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String key      = "QWERTYUIOPASDFGHJKLZXCVBNM";

        System.out.print("Enter text: ");
        String input = sc.nextLine().toUpperCase();

        String encrypted = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int index = alphabet.indexOf(c); 

            if (index != -1) {
                encrypted += key.charAt(index); 
            } else {
                encrypted += c; 
            }
        }

        String decrypted = "";
        for (int i = 0; i < encrypted.length(); i++) {
            char c = encrypted.charAt(i);
            int index = key.indexOf(c);

            if (index != -1) {
                decrypted += alphabet.charAt(index); 
            } else {
                decrypted += c;
            }
        }

        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);

        sc.close();
    }
}
