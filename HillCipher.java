import java.util.Scanner;

public class HillCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] key = {{3, 3}, {2, 5}};
        int[][] invKey = {{15, 17}, {20, 9}}; 
        System.out.print("Enter text (even length): ");
        String text = sc.nextLine().toUpperCase().replaceAll("[^A-Z]", "");

        if (text.length() % 2 != 0) {
            text += "X";
        }

        String encrypted = "";
        for (int i = 0; i < text.length(); i += 2) {
            int x1 = text.charAt(i) - 'A';
            int x2 = text.charAt(i + 1) - 'A';

            int y1 = (key[0][0] * x1 + key[0][1] * x2) % 26;
            int y2 = (key[1][0] * x1 + key[1][1] * x2) % 26;

            encrypted += (char) (y1 + 'A');
            encrypted += (char) (y2 + 'A');
        }

    
        String decrypted = "";
        for (int i = 0; i < encrypted.length(); i += 2) {
            int x1 = encrypted.charAt(i) - 'A';
            int x2 = encrypted.charAt(i + 1) - 'A';

            int y1 = (invKey[0][0] * x1 + invKey[0][1] * x2) % 26;
            int y2 = (invKey[1][0] * x1 + invKey[1][1] * x2) % 26;

            decrypted += (char) (y1 + 'A');
            decrypted += (char) (y2 + 'A');
        }

        System.out.println("Encrypted Text: " + encrypted);
        System.out.println("Decrypted Text: " + decrypted);

        sc.close();
    }
}
