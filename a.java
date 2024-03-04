import java.util.Scanner;

public class a {

    public static void main(String[] agrs) {
        Scanner leitor = new Scanner(System.in);
        int[] vet1 = new int[3];
        int[] vet2 = new int[] { 2, 3, 4 };
        System.out.println("o valor é" + " " + vet1[0]);
        System.out.println("o valor é" + " " + vet2[0]);
        System.out.println("o valor é" + " " + vet2[1]);
        for (int i = 0; i < 3; i++) {
            System.out.println("digite o valor da posiçao" + "" + (i + 1));
            int vlrdigitado = leitor.nextInt();
            vet1[i] = vlrdigitado;
        }
        int contador = 0;
        while (contador < 3) {
            int vlrdovetor = vet1[contador];
            System.out.println("valor na posiçao" + "" + (contador + 1) + " " + vlrdovetor);
            contador++;
        }
    }

}
