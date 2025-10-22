package executavel;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		Carro carro1 = new Carro(0,0);
		Carro carro2 = new Carro(0,0);
		
		int distanciaMaxima = 28;
		Random random = new Random();
		
		System.out.println("-------------------------------");
		for(int i =0;i<carro1.distancia;i++) {
			System.out.print(" ");
		}
		System.out.println("#");
		
		for(int i =0;i<carro2.distancia;i++) {
			System.out.print(" ");
		}
		System.out.println("#");
		System.out.println("\n-------------------------------");
		
		while(true) {
			int distanciaCarro1 = random.nextInt(3) + 1;
			int distanciaCarro2 = random.nextInt(3) + 1;
			carro1.distancia += distanciaCarro1;
			carro2.distancia += distanciaCarro2;
			System.out.println("-------------------------------");
			for(int i =0;i<carro1.distancia;i++) {
				System.out.print(" ");
			}
			System.out.println("#");
			
			for(int i =0;i<carro2.distancia;i++) {
				System.out.print(" ");
			}
			System.out.println("#");
			System.out.println("\n-------------------------------");
			
			if(carro1.distancia >= distanciaMaxima || carro2.distancia >= distanciaMaxima) {
				break;
			}
			
		}
		
		if(carro1.distancia > carro2.distancia) {
			System.out.println("Carro 1 ganhou");
		}else if(carro2.distancia > carro1.distancia) {
			System.out.println("Carro 2 ganhou");
		}else {
			System.out.println("Carro 1 e Carro 2 empataram");
		}

	}

}
