import java.util.Arrays;
import java.util.Scanner;
public class TP1 {

	public static void main(String[] args) {
		int opt;
		int opt2;
		int opt3;
		int qtd;
		int qtdPalavras = 0;
		int temas = 0;
		int qtdTemas = 0;
		int palavras = 10;
		String temaBuscado;
		String novaPalavra;
		String tema;
		String [][] matriz = new String[51][51];
		matriz[0][0] = "animais"; matriz[0][1] = "vaca"; matriz[0][2] = "rato"; matriz[0][3] = "peixe"; matriz[0][4] = "lobo"; matriz[0][5] = "cachorro"; matriz[0][6] = "gato"; matriz[0][7] = "coelho"; matriz[0][8] = "macaco"; matriz[0][9] = "galinha"; matriz[0][10] = "pato";
		matriz[1][0] = "carros"; matriz[1][1] = "camaro"; matriz[1][2] = "hb20"; matriz[1][3] = "fusion"; matriz[1][4] = "tracker"; matriz[1][5] = "siena"; matriz[1][6] = "onix"; matriz[1][7] = "celta"; matriz[1][8] = "corsa"; matriz[1][9] = "fiesta"; matriz[1][10] = "palio";
		matriz[2][0] = "paises"; matriz[2][1] = "brasil"; matriz[2][2] = "russia"; matriz[2][3] = "argentina"; matriz[2][4] = "espanha"; matriz[2][5] = "nigeria"; matriz[2][6] = "angola"; matriz[2][7] = "mexico"; matriz[2][8] = "noruega"; matriz[2][9] = "inglaterra"; matriz[2][10] = "colombia";
		matriz[3][0] = "frutas"; matriz[3][1] = "banana"; matriz[3][2] = "maca"; matriz[3][3] = "morango"; matriz[3][4] = "uva"; matriz[3][5] = "kiwi"; matriz[3][6] = "melancia"; matriz[3][7] = "limao"; matriz[3][8] = "laranja"; matriz[3][9] = "melao"; matriz[3][10] = "mamao";
		matriz[4][0] = "cores"; matriz[4][1] = "azul"; matriz[4][2] = "rosa"; matriz[4][3] = "amarelo"; matriz[4][4] = "vermelho"; matriz[4][5] = "laranja"; matriz[4][6] = "roxo"; matriz[4][7] = "branco"; matriz[4][8] = "preto"; matriz[4][9] = "verde"; matriz[4][10] = "violeta";
		Scanner ler = new Scanner(System.in);
		System.out.println("Bem vindo ao jogo da forca, escolha uma opção.");
		System.out.println("1. Gerenciar temas");
		System.out.println("2. Gerenciar palavras");
		System.out.println("3. Jogar");
		System.out.println("4. Sair");
		
		do {
			opt = ler.nextInt();
			switch (opt) {
			case 1:
				System.out.println("Escolha o que deseja fazer agora:");
				System.out.println("1. Cadastro");
				System.out.println("2. Exclusão");
				System.out.println("3.Busca");
				opt2 = ler.nextInt();
				switch (opt2) {
				case 1:
					System.out.println("Primeiramente, defina quantos temas deseja cadastrar.");
					qtd = ler.nextInt();
					temas = qtd;
					for (int i = 0; i < qtd; i++) {
						System.out.println("Digite o tema a ser cadastrado");
						tema = ler.next();
						matriz[qtdTemas][0] = tema;
						qtdTemas = qtdTemas + 5;
						qtdTemas++;
					}
					System.out.println("Esses são os temas cadastrados até agora:");
					for (int j = 0; j < qtd + 4; j++) {
						System.out.println(matriz[j][0]);
					}
					break;
				case 2:
					System.out.println("Opção indisponivel");
				case 3:
					System.out.print("Digite o tema que deseja buscar");
					temaBuscado = ler.next();
					String temaEncontrado = null;
					for(int i = 0; i<qtdTemas; i++) {
						if(matriz[i][0].equals(temaBuscado)) {
							temaEncontrado = matriz[i][0];
							break;
						}						
					}
					if(temaEncontrado != null) {
						System.out.println("Tema encontrado: " + temaEncontrado);
					} else {
						System.out.println("Tema não encontrado!");
					}
					
				}
				System.out.println("Bem vindo ao jogo da forca, escolha uma opção.");
				System.out.println("1. Gerenciar temas");
				System.out.println("2. Gerenciar palavras");
				System.out.println("3. Jogar");
				System.out.println("4. Sair");
				
				break;
			case 2:
				System.out.println("Escolha o que deseja fazer:");
				System.out.println("1. Cadastro");
				System.out.println("2. Exclusão");
				System.out.println("3. Busca");
				System.out.println("4. Listagem");
				opt3 = ler.nextInt();
				
				switch (opt3) {
				case 1:
					int escolha;
					System.out.println("Esses são os temas cadastrados até agora:");
					for (int j = 0; j < temas + 5; j++) {
						System.out.println(j + ". " + matriz[j][0]);
					}
					System.out.println("Escolha uma opção para cadastrar palavras, use o número correspondente e lembre-se que inicia em zero");
					escolha = ler.nextInt();
					System.out.println("Digite a nova palavra:");
					novaPalavra = ler.next();
					qtdPalavras = qtdPalavras + 10;
					qtdPalavras++;
					palavras++;
					for (int i = 0; i < 1; i++) {
						for (int j = 0; j < 1; j++) {							
							matriz[escolha][qtdPalavras] = novaPalavra;
						}
					}
					break;
				case 2:
					System.out.println("opcao2");
					break;
				case 3:
					System.out.println("opcao3");
					break;
				case 4:
					System.out.println("Essas são todas as palavras e temas cadastrados:");
					for (int i = 0; i < temas + 5; i++) {
						System.out.println(" ");
						for (int j = 0; j < palavras + 1; j++) {
							System.out.print(matriz[i][j] + " ");
						}
					}
				}
				break;
			case 3:
				System.out.println("opcao 3");
				break;
			case 4:
				System.out.println("Obrigado por jogar!");
				break;
			default:
				System.out.println("Escolha uma opção válida!");
			}
		}while(opt != 4);
		// TODO Auto-generated method stub

	}

}
