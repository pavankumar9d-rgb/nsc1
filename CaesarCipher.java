import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(String.in);

        System.out.print("Enter plaintext: ");
        String text = sc.nextLine();

        System.out.print("Enter shift value: ");
        int shift = sc.nextInt();

        String encrypted = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                char shifted = (char) (c + shift);
                if (shifted > 'Z') { shifted = (char) (shifted - 26); }
                encrypted += shifted;
            } 
            else if (c >= 'a' && c <= 'z') {
                char shifted = (char) (c + shift);
                if (shifted > 'z') { shifted = (char) (shifted - 26); }
                encrypted += shifted;
            } 
            else {
                encrypted += c; 
            }
        }

        String decrypted = "";
        for (int i = 0; i < encrypted.length(); i++) {
            char c = encrypted.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                char shifted = (char) (c - shift);
                if (shifted < 'A') { shifted = (char) (shifted + 26); }
                decrypted += shifted;
            } 
            else if (c >= 'a' && c <= 'z') {
                char shifted = (char) (c - shift);
                if (shifted < 'a') { shifted = (char) (shifted + 26); }
                decrypted += shifted;
            } 
            else {
                decrypted += c;
            }
        }

        System.out.println("Encrypted Text: " + encrypted);
        System.out.println("Decrypted Text: " + decrypted);
        
        sc.close();
    }
}
