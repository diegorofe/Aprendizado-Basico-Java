package desafiosJava;
import java.util.Scanner;
public class Produto {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int A, B, PROD;

            System.out.println("Informe o valor de A");
            A = sc.nextInt();
            System.out.println("Informe o valor de B");
            B = sc.nextInt();

            PROD = A * B;   ; //implemente o códico que representa a multiplicação.

            System.out.println("PROD = " + PROD);

            sc.close();

        }

    }

