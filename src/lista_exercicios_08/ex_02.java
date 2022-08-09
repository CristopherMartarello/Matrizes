
package lista_exercicios_08;

import java.util.Scanner;


public class ex_02 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int l, c;
        
        System.out.print("Digite o número de linhas da matriz: ");
        l = Integer.valueOf(input.nextLine());
        System.out.print("Digite o número de colunas da matriz: ");
        c = Integer.valueOf(input.nextLine());
        
        int[][] matriz = new int [l][c];
        
        System.out.println("PREENCHA A MATRIZ");
        for(int i = 0; i < l; i++) {
            for(int j = 0; j < c; j++){
                System.out.print("["+i+"]"+"["+j+"]: ");
                matriz[i][j] = Integer.valueOf(input.nextLine());
            }
            
        }
        
        System.out.println("IMPRIMINDO A MATRIZ");
        for(int i = 0; i < l; i++) {
            for(int j = 0; j < c; j++){
                System.out.print(" | "+ matriz[i][j] + " | ");
            }
            System.out.println("");
        }
        
        System.out.println("IMPRIMINDO A MATRIZ TRANSPOSTA");
        int[][] matrizTransposta = new int [c][l];
        for(int i = 0; i < c; i++) {
            for(int j = 0; j < l; j++){
                matrizTransposta[i][j] = matriz[j][i];
            }
 
        }
        
        for(int i = 0; i < c; i++){
            for(int j = 0; j < l; j++){
                System.out.print(" | " + matrizTransposta[i][j] + " | ");
            }
            System.out.println("");
        }
    }
    
}
