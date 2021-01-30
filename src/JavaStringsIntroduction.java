import java.util.Scanner;

public class JavaStringsIntroduction {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        if (A.compareTo(B) <=0){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }

        char[] array = A.toCharArray();

        array[0] = Character.toUpperCase(array[0]);

        String result = new String(array);
        char[] array1 = B.toCharArray();

        array1[0] = Character.toUpperCase(array1[0]);

        String result1 = new String(array1);
        System.out.println(result +" "+result1);

    }
}
