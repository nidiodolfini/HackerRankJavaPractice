import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        BigInteger n = scanner.nextBigInteger();
        scanner.close();
        if(n.isProbablePrime(1)){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }



    }

}
