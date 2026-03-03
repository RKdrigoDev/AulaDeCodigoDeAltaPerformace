import java.util.Scanner;

public class EX2 {
    static final int N = 30;
    public static void main(String[] args) {


        int rm[] = new int[N];
        double nota1[] = new double[N];
        double nota2[] = new double[N];
        int n=entradaDedados(rm, nota1,nota2);
        for (int i=0; i<n; i++){
            System.out.println(rm[i]);
        }

    }
    public static int entradaDedados( int [] rm, double[] nota1, double[] nota2){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Informe RM (negativo para encerrar): ");
        int rmLido = sc.nextInt();
        for (n = 0; n < N && rmLido > 0; n++) {
            rm[n] = rmLido;
            System.out.print("Nota1: ");
            nota1[n] = sc.nextDouble();
            System.out.print("Nota2: ");
            nota2[n] = sc.nextDouble();
            System.out.print("Informe RM (negativo para encerrar): ");
            rmLido = sc.nextInt();
        }
        return n;
    }
}
