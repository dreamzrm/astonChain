import java.util.*;
public class user {
    public static void main(String args[]){
        try{
        Scanner ob = new Scanner(System.in);
        System.out.println("Welcome to astonChain");
        System.out.println("Enter 1 to generate new keys, 2 to view the chain or 3 to perform a transaction");
        int x= ob.nextInt();
        switch(x){
            case 1: wallet newWallet= new wallet();
            newWallet.generate();
            break;
            case 2: ChainExplorer.chain();
            break;
            }
        }
    
    catch(Exception ignored){}
    
}
}
