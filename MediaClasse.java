package aulas;
import java.util.Scanner;
public class MediaClasse {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner (System.in); //scanner com o nome entrada
	
	double ac1, ac2, ag, af, media;
	
	System.out.println("Digite a nota da AC1:");
	
	ac1 = entrada.nextDouble(); // ac1 recebe a nota do usuario e assim respectivamente 
	
	System.out.println("Digite a nota da AC2:");
	
	ac2 = entrada.nextDouble();
	
	System.out.println("Digite a nota da AG:");
	
	ag = entrada.nextDouble();
	
	System.out.println("Digite a nota da AF:");
	
	af = entrada.nextDouble();
	entrada.close(); // fechei o scanner
	
	double ac01 = (ac1*0.15); // criei variaveis doubles com os nomes parecidos para definir o peso das provas
	double ac02 = (ac2* 0.3);
	double agg = (ag*0.1);
	double aff = (af* 0.45);
	
	
	media = (ac01 + ac02 + agg + aff); // média recebe as somas de todas as provas
	
	System.out.println("SUA MÉDIA É:" + media);

	
	
	if (media > 5){ // se a media for maior que 5, aparecer que o usuario foi APROVADO
		System.out.printf("PARABÉNS, VOCÊ FOI APROVADO!");
	}
	else System.out.printf("QUE PENA, VOCÊ FOI REPROVADO!"); //se não, aparecer que foi REPROVADO
	


	}

}
