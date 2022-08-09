
package lista_exercicios_08;

import java.util.Scanner;


public class ex_05 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int m, n, p;
        
        System.out.print("Digite o número de linhas da matriz A: ");
        m = Integer.valueOf(input.nextLine());
        System.out.print("Digite o número de colunas da matriz A: ");
        n = Integer.valueOf(input.nextLine());
        
        int[][] matrizA = new int [m][n];
        
        System.out.println("MATRIZ A");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++){
                System.out.print("["+i+"]"+"["+j+"]: ");
                matrizA[i][j] = Integer.valueOf(input.nextLine());
            } 
        }
        
        System.out.println("MATRIZ B");
        System.out.print("Digite o número de colunas da matriz B: ");
        p = Integer.valueOf(input.nextLine());
        
        int[][] matrizB = new int [m][p];
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < p; j++){
                System.out.println("["+i+"]"+"["+j+"]: ");
                matrizB[i][j] = Integer.valueOf(input.nextLine());
            }
        }
        
        System.out.println("IMPRIMINDO MATRIZ A");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(" | " + matrizA[i][j] + " | ");
            }
            System.out.println("");
        }
        
        System.out.println("IMPRIMINDO MATRIZ B");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < p; j++){
                System.out.print(" | " + matrizB[i][j] + " | ");
            }
            System.out.println("");
        }
        
        int[][] matrizC = new int[n][p];
        
        System.out.println("MULTIPLICACÃO DA MATRIZ A E B");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                matrizC[n][p] = matrizA[m][n] * matrizB[m][p];
                p++;
            }
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < p; i++){
                System.out.print(" | "+ matrizC[n][p] + " | ");
            }
            System.out.println("");
        }
        
    }
    
}
