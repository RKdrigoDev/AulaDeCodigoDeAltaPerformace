import java.util.Scanner;
public class EX1 {
    public static void main(String[] args) {
        final int N = 30;

        int rm[] = new int[N];
        double nota1[] = new double[N];
        double nota2[] = new double[N];

        Scanner le = new Scanner(System.in);
        int n;
        System.out.print("Informe RM (negativo para encerrar): ");
        int rmLido = le.nextInt();
        for (n = 0; n < N && rmLido > 0; n++) {
            rm[n] = rmLido;
            System.out.print("Nota1: ");
            nota1[n] = le.nextDouble();
            System.out.print("Nota2: ");
            nota2[n] = le.nextDouble();
            System.out.print("Informe RM (negativo para encerrar): ");
            rmLido = le.nextInt();
        }
        if (n != 0) {
            double media[] = new double[n];
            for (int i = 0; i < n; i++) {
                media[i] = (nota1[i] + nota2[i]) / 2;
                System.out.println("RM: " + rm[i] + "\t media: " + media[i]);
            }
            int aprovados[] = new int[n];
            int nAp = 0;
            for (int i = 0; i < n; i++) {
                if (media[i] >= 6) {
                    aprovados[nAp] = rm[i];
                    nAp++;
                }
            }

            System.out.println("\n **** Lista de Aprovados ****");
            for (int i = 0; i < nAp; i++) {
                System.out.println(aprovados[i]);
            }
        }
    }
}
