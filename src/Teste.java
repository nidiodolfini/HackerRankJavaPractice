import java.util.Scanner;

class Teste {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();

        String simbol = scanner.next();

        long b = scanner.nextLong();
        switch (simbol){
            case "/":


                try{
                    System.out.println(a / b);
                }catch (ArithmeticException e){
                    System.out.println("Division by 0!");
                }

                break;
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            default:
                System.out.println("Unknown operator");

        }


//        int peso = scanner.nextInt();
//        int tamanho  = scanner.nextInt();
//        int next = 0;
//        int i = 0;
//       do {
//            next = scanner.nextInt();
////            i += next;
//
//           if (i < 1000){
//               i += next;
//           }else if(i >= 1000){
//               i -= 1000 ;
//               break;
//           }
//           if (next == 0){
//               break;
//           }
//
//
//        }while (scanner.hasNext());
//        System.out.println(i);

//        if (crash) {
//            System.out.println("Will crash on bridge " + i);
//        }else{
//            System.out.println("Will not crash");
//        }
//
    }
}
//        int[] numeros = new int[1000];
//        int elem = 1;
//        int i = 0;
//        while (elem != 0) {
//            elem = scanner.nextInt();
//            if (elem == 0) {
//                break;
//            }
//            numeros[i] = elem;
//            i++;
//
//        }
//        System.out.println(numeros);

//        int n = scanner.nextInt();
//
//        int sum = 0;
//        int elem = 1;
//        while (elem != 0) {
//            elem = scanner.nextInt();
//            if (elem == 0){
//                break;
//            }
//            if (elem % 2 == 0 ) {
//                System.out.println("even");
//            }else if(elem % 2 != 0){
//                System.out.println("odd");
//            }
//        }
////                int current = 1;
//                int count = 0;
//
//                while (count != n) {
//                    for (int i = 0; i < current; i++) {
//                        System.out.print(current + " ");
//                        count += 1;
//
//                        if (count == n) {
//                            break;
//                        }
//                    }
//                    current += 1;
//                }

//
//        int n = 10;
//        for (int i = 0; i < n; i++) {
//            if (i * i < 36) {
//                continue;
//            }
//            System.out.print(i + " ");
//        }

//        Scanner scanner = new Scanner(System.in);
////
////        int m = scanner.nextInt();
////        int p = scanner.nextInt();
////        int k = scanner.nextInt();
////        int i = 1;
////        while (m <= k){
////            m += m* (1+p/100);
////            i++;
////        }
////        System.out.println(i);
//
//        int sum = 0;
//        int elem = 1;
//        while (elem !=0) {
//            elem = scanner.nextInt();
//            if (elem > sum){
//                sum = elem;
//            }
//        }
//
//        System.out.println(sum);


//        int a;
//        int maior = 0;
//        int b = scanner.nextInt();
//        for (int i = 0; i < b; i++) {
//            a = scanner.nextInt();
//            if (a % 6 == 0 ) {
//                maior += a;
//            }
//        }
//        System.out.println(maior);
        //        String texto = "nidioLaranjaTeste";
//
//        String palavras[] = texto.split("(?<!(^|[A-Z0-9]))(?=[A-Z0-9])|(?<!(^|[^A-Z]))(?=[0-9])|(?<!(^|[^0-9]))(?=[A-Za-z])|(?<!^)(?=[A-Z][a-z])");
//
//        for (int i =0;i > palavras.length; i++){
//            System.out.println(palavras[i]);
//        }


//        for (int i = 0; i < palavras.length(); i++) {
//            Character letra = palavras.charAt(i);
//
//           if (Character.isUpperCase(letra)){
//               System.out.println(letra);
//           }
//        }


//                Scanner scanner = new Scanner(System.in);
//                int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        int d = scanner.nextInt();
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);

//        if (a +b > c || a + c > b || b  +c > a  ){
//            System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }
        //                int a = n / 1000 %10;
//                int b = n / 100 %10;
//                int c = n / 10 %10;
//                int d = n / 1 %10;
//        System.out.println(a +" " + b +" "+ c + " "+ d);
//            System.out.println("no army");
//        }else if (a >= 1 && a<=19){
//            System.out.println("pack");
//        }else if (a >= 20 && a<=249){
//            System.out.println("throng");
//        }else if (a >= 250 && a<=999){
//            System.out.println("zounds");
//        }else{
//            System.out.println("legion");
//        }
        // put your code here

        // put your code here
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.next();
//        s.toLowerCase();
//        if (s.startsWith("J") || s.startsWith("j")){
//            System.out.println("true");
//        }else{
//            System.out.println("false");

//        String a = scanner.next();
//        String b = scanner.next();
//        String c = scanner.next();
//        String d = scanner.next();
//        String e = scanner.next();
//        System.out.println("The form for " + a + " is completed. We will contact you if we need a chef that cooks " +  e + " dishes.");
////        System.out.println(b);
////        System.out.println(c);
//        System.out.println(d);
//
//        int n = scanner.nextInt();
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
////        Math.ceil((a+b+c)/2
////        System.out.println((int) Math.ceil(a/2) + (int )Math.ceil(b/2) + (int) Math.ceil(c/2) );
////        int n = 0;
////        System.out.print(++n);
////        System.out.print(n++);
////        System.out.print(n++);
//
//        System.out.println(--n + " " + --a + " " + --b + " " + --c);

//        ArrayList<String> lista = new ArrayList();
//
//        lista.add("1");
//        lista.add("2");
//        System.out.println(lista);
//
//        String s = "teste";
//        s = "nidio";
//        s = "dolfini";
//        System.out.println(s);

//        String s = scanner.next();
//        System.out.println(s.replace('a','b'));
//       char a = (char)(int)(s.charAt(0)+1);
//        char b = (char)(int)(s.charAt(1)+1);
//        char c = (char)(int)(s.charAt(2)+1);
//
//        System.out.println(a+""+b+""+c);

//    }
//
//}