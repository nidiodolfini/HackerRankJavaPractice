import java.util.Scanner;

public class JavaEndOfFile {

    public static void main(String[] args) {
        String texto = "";
        Scanner scan = new Scanner(System.in);
        String s;
        while (true){
            s = scan.nextLine();
            if (s.compareTo("end-of-file.") == 0){
                break;
            }
        }
        texto += s;
        System.out.println(texto);
    }

}
