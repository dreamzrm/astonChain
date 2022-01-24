import java.util.Base64;
import java.util.Date;
import java.sql.Timestamp;

class wallet{

    public  void generate() throws Exception{
        Date date= new Date();
	    long time = date.getTime(); 
	    Timestamp ts = new Timestamp(time);
        String in = ts.toString();
        RSA rsa= new RSA();
        byte[] publicKey = rsa.publicKeyByte;
        byte[] privateKey = rsa.privateKeyByte;
        String walletAddress = StringUtil.applySha512(in);
        System.out.println("Wallet Address"+"\t"+"Public Key"+"\t"+"Private Key");
        System.out.println(walletAddress+"\t"+publicKey+"\t"+privateKey);
        //byte[]  publicKeyByte= rsa.publicKey.getEncoded();
        //String publicKeyString = Base64.encodeBase64String(rsa.publicKey.getEncoded());
        //String publicKeyString = Base64.encodeToString(publicKeyByte, Base64.NO_WRAP);
        //byte[] privateKeyByte= rsa.privateKey.getEncoded();
        //String privateKeyString = Base64.encodeToString(privateKeyByte, Base64.NO_WRAP);
    }

}