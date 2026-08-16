import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class RijndaelAES {
    public static void main(String[] args) throws Exception {
        String txt = "HelloAES1234567";   
        String k = "1234567890123456";        

        SecretKeySpec sk = new SecretKeySpec(k.getBytes(), "AES");

        Cipher enc = Cipher.getInstance("AES/ECB/PKCS5Padding");
        enc.init(Cipher.ENCRYPT_MODE, sk);
        byte[] eBytes = enc.doFinal(txt.getBytes());
        String cipher = Base64.getEncoder().encodeToString(eBytes);

        Cipher dec = Cipher.getInstance("AES/ECB/PKCS5Padding");
        dec.init(Cipher.DECRYPT_MODE, sk);
        byte[] dBytes = dec.doFinal(Base64.getDecoder().decode(cipher));

        System.out.println("Plain Text : " + txt);
        System.out.println("Cipher Text: " + cipher);
        System.out.println("Decrypted Text: " + new String(dBytes));
    }
}
