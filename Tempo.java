import java.util.Scanner;
 
public class Tempo {
  	
	public static void main(String [] args) {
	
		double horas, mins, segs;
		
		Scanner in= new Scanner (System.in);
		
		System.out.print("Duracao (H M S)? ");
		
		horas=in.nextDouble();   // o primeiro valor introduzido pelo utilizador é reconhecido como sendo horas
		
		mins=in.nextDouble();   // o segundo valor introduzido pelo utilizador é reconhecido como sendo minutos
		
		segs=in.nextDouble();    // o terceiro valor introduzido pelo utilizador é reconhecido como sendo segundos
		
		double convmins, convhoras, minsoitocd, horasoitocd, convsegs;
		
		convsegs=(horas*3600)+(mins*60)+segs;    //conversao de horas para segundos e de minutos para segundos
		
		convmins=(horas*60)+mins+(segs/60);     //conversao de horas para minutos e de segundos para minutos
		
	
		double maxRight = 100000000; // numero maximo de casas decimais
		double maxLeft = 1; // numero de digitos a esquerda
		
		while((int)(convmins/maxLeft) != 0) // ver se existem mais digitos a esquerda
		{
			maxRight /= 10; // se existe diminui o numero maximo de casas decimais
			maxLeft *= 10;
		}
		
		minsoitocd = ((int)(convmins*maxRight+0.5))/maxRight;//limitar o resultado a 8 casas decimais

		
		
		convhoras=horas+(mins/60)+(segs/3600);     //conversao de minutos para horas e de segundos para horas 
		
		
		maxRight = 100000000;
		maxLeft = 1;
		
		while((int)(convhoras/maxLeft) != 0)
		{
			maxRight /= 10;
			maxLeft *= 10;
		}
		
		horasoitocd = ((int)(convhoras*maxRight+0.5))/maxRight;//limitar o resultado a 8 casas decimais

		System.out.print((int)convsegs+" segs = "+(minsoitocd)+" min = "+(horasoitocd)+" h");
		
	}

}