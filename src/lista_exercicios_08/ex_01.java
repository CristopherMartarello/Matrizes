
package lista_exercicios_08;

import java.util.Scanner;


public class ex_01 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int [][] matrizA = new int [5][4];
        int [][] matrizB = new int [5][4];
        int [][] somaMatrizes = new int [5][4];
        
        System.out.println("PREENCHA A MATRIZ A");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
              System.out.print("["+i+"]"+"["+j+"]: ");
              matrizA[i][j] = Integer.valueOf(input.nextLine());
            }
        }
        
        System.out.println("PREENCHA A MATRIZ B");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                System.out.println("["+i+"]"+"["+j+"]: ");
                matrizB[i][j] = Integer.valueOf(input.nextLine());
            }
            
        }
        
        
        System.out.println("MATRIZ A");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(" | " + matrizA[i][j] + " | ");
            }
            System.out.println("");
        }
        
        System.out.println("MATRIZ B");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(" | " + matrizB[i][j] + " | ");
            }
            System.out.println("");
        }
        
        
        System.out.println("SOMA DAS MATRIZES A e B");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                somaMatrizes[i][j] = matrizA[i][j] + matrizB[i][j];
            }
            
        }
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 4; j++){
                System.out.print(" | "+ somaMatrizes[i][j] + " | ");
            }
            System.out.println("");
        }
    }
    
}
