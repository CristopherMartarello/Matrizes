
package lista_exercicios_08;

import java.util.Scanner;


public class ex_03 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int l, c;
        
        System.out.print("Informe o tamanho da coluna da matriz: ");
        c = Integer.valueOf(input.nextLine());
        System.out.print("Informe o tamanho da linha da matriz: ");
        l = Integer.valueOf(input.nextLine());
        
        if(l < 3 || c < 3){
            do {            
            System.out.println("A coluna e a linha devem ser maiores que 3!");
            System.out.print("Informe o tamanho da coluna da matriz: ");
            c = Integer.valueOf(input.nextLine());
            System.out.print("Informe o tamanho da linha da matriz: ");
            l = Integer.valueOf(input.nextLine());
        }while(l < 3 || c < 3);
        }
        
        int[][] matriz = new int [l][c];
        int somaElementos = 0, somaElementosLinha2 = 0, somaColuna1 = 0, somaDiagonal = 0, somaElementosAcima = 0, somaElementosAbaixo = 0;
        
        System.out.println("PREENCHA A MATRIZ");
        for(int i = 0; i < l; i++){
            for(int j = 0; j < c; j++){
                System.out.print("["+i+"]"+"["+j+"]: ");
                matriz[i][j] = Integer.valueOf(input.nextLine());
            }
        }
        
        System.out.println("IMPRIMINDO A MATRIZ");
        for(int i = 0; i < l; i++){
            for(int j = 0; j < c; j++){
                System.out.print("  |  "+ matriz[i][j] + "  |  ");
            }
            System.out.println("");
        }
        
        System.out.println("SOMA DE TODOS OS ELEMENTOS DA MATRIZ");
        for(int i = 0; i < l; i++){
            for(int j = 0; j < c; j++){
                somaElementos = somaElementos + matriz[i][j];
            }
        }
        System.out.println(somaElementos);
        
        System.out.println("SOMA DE TODOS OS ELEMENTOS DA LINHA 2");
        for(int i = 1; i < 2; i++){
            for(int j = 0; j < c; j++){
                somaElementosLinha2 = somaElementosLinha2 + matriz[i][j];
            }
        }
        System.out.println(somaElementosLinha2);
        
        System.out.println("SOMA DOS ELEMENTOS DA COLUNA 1");
        for(int j = 0; j < 1; j++){
            for(int i = 0; i < l; i++){
                somaColuna1 = somaColuna1 + matriz[i][j];
            }
        }
        System.out.println(somaColuna1);
        
        System.out.println("SOMA DA DIAGONAL PRINCIPAL");
        for(int i = 0; i < l; i++){
            for(int j = 0; j < c; j++){
                if(matriz[i] == matriz[j]){
                    somaDiagonal = somaDiagonal + matriz[i][j];
                }
            }
        }
        System.out.println(somaDiagonal);
        
        System.out.println("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL");
        for(int i = 0; i < l; i++){
            for(int j = 0; j < c; j++){
                if(i < j && !(i == j)){
                    somaElementosAcima = somaElementosAcima + matriz[i][j];
                }
            }
        }
        System.out.println(somaElementosAcima);
        
        System.out.println("SOMA DOS ELEMENTOS ABAIXO DA DIAGONAL PRINCIPAL");
        for(int i = 0; i < l; i++){
            for(int j = 0; j < c; j++){
                if(i > j && !(i == j)){
                    somaElementosAbaixo = somaElementosAbaixo + matriz[i][j];
                }
            }
        }
        System.out.println(somaElementosAbaixo);
    }
    
}
