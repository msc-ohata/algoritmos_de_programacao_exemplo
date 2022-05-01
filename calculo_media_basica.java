package calculo_media;

import java.util.Scanner;

/*
 * Conteúdo desenvolvido para atividade da disciplina de programação de algoritmos
 * Aula do dia 25/04/22 - Prof. Daniel Ohata
 */


public class calculo_basico_media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Uso do Scanner para entrada de dados
		Scanner ent = new Scanner(System.in);
        
		//Declaração das variaveis
		double nota1, nota2, nota3, media;
        int i, contAluno = 0;
        
            //Uso do for para contagem e repetição do programa    	
	        for(i = 0; i < 3; i++){
	            //Contador
	            contAluno++;
	            
	            //Entrada de dados nota1, nota2 e nota3
	            System.out.printf("Aluno " + contAluno + ", digite a primeira nota: ");
	            //Leitura do valor entrado
	            nota1 = ent.nextDouble();
	                    
	            System.out.printf("Aluno " + contAluno + ", digite a segunda nota: ");
	            nota2 = ent.nextDouble();
	                    
	            System.out.printf("Aluno " + contAluno + ", digite a terceira nota: ");
	            nota3 = ent.nextDouble();
	            
	            //Cálculo da média dos alunos
	            media = (nota1 + nota2 + nota3) / 3;
	            
	            //Apresentação para o usuário dos valores calculados e devidamente formatados
	            System.out.printf("A media do aluno " + contAluno + " e " + "%.2f", media);
	            
	            //Condicional para identificação se o aluno está Aprovado, Reprovado ou Recuperação	            
	            if (media >= 7.5){
	                System.out.printf("\nAluno Aprovado\n\n");
	            } else if(media < 7.5 && media >= 6.0){
	                System.out.printf("\nAluno Recuperação\n\n");
	            } else {
	                System.out.printf("\nAluno Reprovado\n\n");
	            }
	        }
	}

}
