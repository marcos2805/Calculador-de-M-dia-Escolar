import java.util.Scanner;
public class MediaAluno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a Primeira Nota: ");
		float v1 = sc.nextInt();
		System.out.println("Digite a Segunda Nota: ");
		float v2 = sc.nextInt();
		System.out.println("Digite a Terceiro Nota: ");
		float v3 = sc.nextInt();
		System.out.println("Digite a Quarto Nota: ");
		float v4 = sc.nextInt();
		
		float media = (v1+v2+v3+v4)/4;
		
		
		System.out.println("Média do aluno: " +media);
		
		if (media >= 7) {
			System.out.println("Parabéns você foi Aprovado!!");
		}else {
			System.out.println("Você foi Reprovado na Media!!" );			
		}
			System.out.println("Digite sua nota da recuperação:");
			float Notarecuperacao = sc.nextFloat();
			
			float NovaNota= (media + Notarecuperacao);
			
			if (NovaNota >= 7) {
				System.out.println("Parabéns você foi Aprovado na Recuperação!!");
				
			}else {
				System.out.println("Você Reprovou, infelizmente." );		
				
			}
		}
		
	}


