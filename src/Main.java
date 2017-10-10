import javax.swing.*;
import java.math.BigInteger;
import java.security.SecureRandom;

public class Main {

        public static void main(String[] args) {
            System.out.println("RSA Algorithm\n\n");


            Rsa key = new Rsa(1024);
            System.out.println(key.toString());

            String m = "Jackson ama Carol";
            byte[] bytes = m.getBytes();

            BigInteger message = new BigInteger(bytes);


            BigInteger encrypt = key.encrypt(message);
            BigInteger decrypt = key.decrypt(encrypt);



            System.out.println("message   = " + message);
            System.out.println("encrypted = " + encrypt);
            System.out.println("decrypted = " + decrypt);

            //BigInteger bi = new BigInteger(msg.getBytes());
            //System.out.println(new String(bi.toByteArray())

            String texto = new String(decrypt.toByteArray());

            System.out.println(texto);

            String  ip = (String) JOptionPane.showInputDialog("Informe o IP","192.168.0.");
            int porta = Integer.parseInt(JOptionPane.showInputDialog("Informe a Porta","5000"));

            Conexao c = new Conexao(ip, porta);

            JanelaChat j = new JanelaChat(c);
            j.setLocationRelativeTo(null);
            j.setVisible(true);






        }
}
