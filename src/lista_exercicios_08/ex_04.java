
package lista_exercicios_08;

import java.util.Scanner;


public class ex_04 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        char[] respostaCorreta = new char [10];
        int qtdAlunos = 0, k = 0;
        char[] respostaAluno = new char [10];
        int[] contAcerto = new int [10];
        
        System.out.println("INFORME AS CORRETAS EM 'A', 'B', 'C', 'D' OU 'E'");
        for(int i = 0; i < respostaCorreta.length; i++){
            System.out.print("Informe a resposta correta da questão "+ (i+1) +": ");
            respostaCorreta[i] = input.nextLine().charAt(0);
        }
        
        System.out.print("Quantos alunos fizeram a prova? -> ");
        qtdAlunos = Integer.valueOf(input.nextLine());
        
        String[] nome = new String[qtdAlunos];
        
        for(int i = 0; i < qtdAlunos; i++){
            System.out.println("Informe o nome do aluno "+(i+1)+": ");
            nome[i] = input.nextLine();
        }
        
        for(int i = 0; i < qtdAlunos; i++){
                for(int j = 0; j < 10; j++){
                System.out.print("Resposta de "+ nome[i] +" na questão ["+j+"]: ");
                respostaAluno[j] = input.nextLine().charAt(0);
                if(respostaAluno[j] == respostaCorreta[j]){
                    contAcerto[i]++;
                }
            }
        }
        
        for(int i = 0; i < qtdAlunos; i++){
            System.out.println(nome[i] +": "+contAcerto[i]+" acertos.");
        }
        
        
        
    }
    
}
