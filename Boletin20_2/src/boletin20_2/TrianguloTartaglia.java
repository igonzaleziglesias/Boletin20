package boletin20_2;

public class TrianguloTartaglia {

    public void triangulo(int n) {
        int[][] matriz;

        if (n > 0) {
            matriz = new int[n][];
            matriz[0] = new int[]{1};
            System.out.println(matriz[0][0]+"  ");

            for (int i = 1; i < matriz.length; i++) {
                matriz[i] = new int[i + 1];
                matriz[i][0] = matriz[i][i] = 1;
                System.out.print( 1+"  ");
                
                for (int j = 1; j < i; j++) {
                    matriz[i][j] = matriz[i - 1][j - 1] + matriz[i - 1][j];
                    System.out.print(matriz[i][j]+"  ");
                }
                System.out.println(1+"  ");
            }

        }
    }
}
