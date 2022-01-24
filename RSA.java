import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

import javax.crypto.Cipher;

public class RSA {

    PrivateKey privateKey;
    PublicKey publicKey;
    byte[] publicKeyByte;
    byte[] privateKeyByte;


    public RSA() throws Exception{
        KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
        generator.initialize(2048, new SecureRandom());
        KeyPair pair = generator.generateKeyPair();
        privateKey= pair.getPrivate();
        publicKey = pair.getPublic();
        publicKeyByte = publicKey.getEncoded();
        privateKeyByte = privateKey.getEncoded();
    }
}
/*    
    public String encrypt(String message) throws Exception{
        byte[] messageToBytes = message.getBytes();
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.ENCRYPT_MODE, privateKey);
        byte[] encryptedBytes = cipher.doFinal(messageToBytes);
        return encode(encryptedBytes);
    }
    private String encode(byte[] data){
        return Base64.getEncoder().encodeToString(data);
    }
    private String decrypt(String encryptedMessage) throws Exception{
        byte[] encryptedBytes = decode(encryptedMessage);
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.DECRYPT_MODE, publicKey);
        byte[] decryptedMessage = cipher.doFinal(encryptedBytes); 
        return new String(decryptedMessage, "UTF-8");
    }

    private byte[] decode(String data){
        return Base64.getDecoder().decode(data);
    }

    public static void main(String args[]) throws Exception{
        RSA rsa = new RSA();
        try{
           String encryptedMessage = rsa.encrypt("Hello World!");
           String decryptedMessage = rsa.decrypt(encryptedMessage);
           System.out.println("Your public and private keys are: ");
           System.out.println(rsa.publicKey.getFormat());//.getClass().getName()
           String a= rsa.publicKey.getFormat();
           byte b[];
           KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
        generator.initialize(2048, new SecureRandom());
           PublicKey pu_ser = ((PublicKey) generator).generatePublic(new X509EncodedKeySpec(b)); 
           System.out.println();
           System.out.println(rsa.privateKey.getFormat());//.getClass().getName()
           System.out.println("Encrypted:\n"+encryptedMessage);
           System.out.println("Decrypted:\n"+decryptedMessage);
        }catch(Exception ignored){}
    }
    
}*/

/*
 // get encoded form (byte array)
        byte[] publicKeyByte = publicKey.getEncoded();
        // Base64 encoded string
        String publicKeyString = Base64.encodeToString(publicKeyByte, Base64.NO_WRAP);
        System.out.println("publicKeyString: " + publicKeyString);
        // ... transport to server
        // Base64 decoding to byte array
        byte[] publicKeyByteServer = Base64.decode(publicKeyString, Base64.NO_WRAP);
        // generate the publicKey
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PublicKey publicKeyServer = (PublicKey) keyFactory.generatePublic(new X509EncodedKeySpec(publicKeyByteServer));
        System.out.println("publicKeyServer: " + publicKeyServer);
*/ 