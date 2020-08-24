

import java.util.Scanner;

public class Programa {
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		Lanche lanche;
		int opcao;
		
		System.out.println("Selecione o tipo de lanche: ");
		System.out.println("[1] Sanduiches  [2] Massas  [3] Bolos");
		opcao = teclado.nextInt();
		
		if(opcao == 1) {
			lanche = new Sanduiche();
			menuSanduiche((Sanduiche) lanche);
			
		}
		else if(opcao == 2) {
			lanche = new Massa();
			menuMassa((Massa) lanche);
		}
		else if(opcao == 3) {
			lanche = new Bolo();
			menuBolo((Bolo) lanche);
		}
	}
	
	public static void menuSanduiche(Sanduiche lanche) {
		String[] ingredientes = new String[10];
		String ingrediente = "";
		int i = 0;
		int distancia;
		
		System.out.println("Você escolheu a opção sanduiche");
		System.out.println("Escolha os ingredientes (digite 0 para finalizar a escolha)");
		
		while(i < 10 && !ingrediente.equals("0")) {
			ingrediente = teclado.nextLine();
			ingredientes[i] = ingrediente;
			i++;
		}
		
		lanche.setIngredientes(ingredientes);
		System.out.println("Informe a sua distância (km): ");
		distancia = teclado.nextInt();
		System.out.println("Tempo estimado de espera (min): " + lanche.calculaTempo(distancia));
	}
	
	public static void menuMassa(Massa massa) {
		int distancia;
		String molho;
		String tipoDeMassa;
		
		System.out.println("Você escolheu a opção massa");
		teclado.nextLine();
		 System.out.println("digite o molho que você deseja");
		 molho = teclado.nextLine();
		 
		 System.out.println("vc escolheu: " + molho);
		 massa.setMolho(molho);
		 System.out.println("escolha o tipo de massa entre: pizza, macarrão e lasanha");
		 tipoDeMassa = teclado.nextLine();
		 if (tipoDeMassa != "pizza" || tipoDeMassa != "macarrão" || tipoDeMassa != "lasanha") {
			 
			 System.out.println("insira uma opção valida");
			 tipoDeMassa = teclado.nextLine();
		 }
		 else {massa.setTipoDeMassa(tipoDeMassa);}
		
		
		
		System.out.println("Informe a sua distância (km): ");
		distancia = teclado.nextInt();
		System.out.println("Tempo estimado de espera (min): " + massa.calculaTempo(distancia));
	}

	public static void menuBolo(Bolo bolo) {
		String massa, recheio, cobertura;
		int distancia;
		
		System.out.println("Você escolheu a opção bolo");
		teclado.nextLine();
		System.out.println("Digite o sabor da massa");
		massa = teclado.nextLine();
		bolo.setMassa(massa);
		System.out.println("Digite o sabor da cobertura");
		cobertura = teclado.nextLine();
		bolo.setCobertura(cobertura);
		System.out.println("Digite o sabor do recheio");
		recheio = teclado.nextLine();
		bolo.setRecheio(recheio);
		System.out.println("Informe a sua distância (km): ");
		distancia = teclado.nextInt();
		System.out.println("Tempo estimado de espera (min): " + bolo.calculaTempo(distancia));
		
		

}
}

