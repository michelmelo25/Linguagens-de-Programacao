package controle;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import livro.LivroAventura;
import livro.LivroComedia;
import livro.LivroDrama;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ControleLivraria livraria = new ControleLivraria();
		int op = 0;
		int es = 0;
		String nome = null;
		float valor;
		int id = 0;
	
	do {
		System.out.println("[0] - Exit");
		System.out.println("[1] - add");
		System.out.println("[2] - Vender");
		System.out.println("[3] - Caixa");
		System.out.println("[4] - Historico");
		System.out.println("[5] - Estoque");
		System.out.println("[6] - Detalhar Livro");
		op = sc.nextInt();
		switch (op) {
		case 1:
			System.out.println("Tipo do Livro");
			System.out.println("[1] - Aventura | [2] - Comedia | [3] - Drama");
			es = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Nome: ");
			nome = sc.nextLine();
			
			System.out.println("Valor: ");
			valor = sc.nextFloat();
			System.out.println("Identificador: ");
			id = sc.nextInt();
			sc.nextLine();
			switch (es) {
			case 1:				
				LivroAventura aventura = new LivroAventura(nome, valor, id);
				livraria.addLivro(aventura);
				break;
			case 2:
				LivroComedia comedia = new LivroComedia(nome, valor, id);
				livraria.addLivro(comedia);
				break;
			case 3:
				LivroDrama drama = new LivroDrama(nome, valor, id);
				livraria.addLivro(drama);
				break;
			default:
				System.out.println("Tipo inexistente, operação cancelada");
				break;
			}
			break;
		case 2:
			System.out.println("Tipo do Livro");
			System.out.println("[1] - Aventura | [2] - Comedia | [3] - Drama");
			 es = sc.nextInt();
			 sc.nextLine();
			 System.out.println("Nome: ");
			 nome = sc.nextLine();
			 System.out.println("Valor: ");
			 valor = sc.nextFloat();
			 System.out.println("Identificador: ");
			 id = sc.nextInt();
			 sc.nextLine();
			switch (es) {
			case 1:				
				LivroAventura aventura = new LivroAventura(nome, valor, id);
				livraria.venda(aventura, valor);
				break;
			case 2:
				LivroComedia comedia = new LivroComedia(nome, valor, id);
				livraria.venda(comedia,valor);
				break;
			case 3:
				LivroDrama drama = new LivroDrama(nome, valor, id);
				livraria.venda(drama,valor);
				break;
			default:
				System.out.println("Tipo inexistente, operação cancelada");
				break;
			}			
			break;
		case 3:
			System.out.println("R$ " + livraria.cansultarCaixa());
			System.out.println("---------------------");
			break;
		case 4:
			livraria.historico();
			break;
		case 5:
			livraria.estoque();
			break;
		case 6:
			System.out.println("Tipo do Livro");
			System.out.println("[1] - Aventura | [2] - Comedia | [3] - Drama");
			int tipo = sc.nextInt();
			sc.nextLine();
			System.out.println("Nome:");
			nome = sc.nextLine();
			livraria.listarLivro(nome,tipo);
			break;
		case 0:
			op = 0;
			System.out.println("Adeus!");
			break;
		}
	} while (op != 0);
	
	}
}
