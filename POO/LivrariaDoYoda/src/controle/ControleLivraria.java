package controle;

import java.util.ArrayList;
import java.util.Date;

import org.omg.CORBA.SystemException;

import livro.*;

public class ControleLivraria {
	private ArrayList<ArrayList<LivroAventura>> estoqueAventura = new ArrayList<ArrayList<LivroAventura>>();
	private ArrayList<ArrayList<LivroComedia>> estoqueComedia = new ArrayList<ArrayList<LivroComedia>>();
	private ArrayList<ArrayList<LivroDrama>> estoqueDrama = new ArrayList<ArrayList<LivroDrama>>();
	private ArrayList<venda> historicoVendas = new ArrayList<venda>();
	private float caixa;
	
	public boolean addLivro(LivroAventura l){
		try {
			//para cara lista da lista de lista
			for (ArrayList<LivroAventura> arrayList : estoqueAventura) {
				//se a lista for do livro que pretendo add
				if(arrayList.get(0).getNome().equals(l.getNome())){
					arrayList.add(l); //add
					return true;
				}
			}
			ArrayList<LivroAventura> liv = new ArrayList<LivroAventura>();
			liv.add(l);
			estoqueAventura.add(liv);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean addLivro(LivroDrama l){
		try {
			//para cara lista da lista de lista
			for (ArrayList<LivroDrama> arrayList : estoqueDrama) {
				//se a lista for do livro que pretendo add
				if(arrayList.get(0).getNome().equals(l.getNome())){
					arrayList.add(l); //add
					return true;
				}
			}
			ArrayList<LivroDrama> liv = new ArrayList<LivroDrama>();
			liv.add(l);
			estoqueDrama.add(liv);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean addLivro(LivroComedia l){
		try {
			//para cara lista da lista de lista
			for (ArrayList<LivroComedia> arrayList : estoqueComedia) {
				//se a lista for do livro que pretendo add
				if(arrayList.get(0).getNome().equals(l.getNome())){
					arrayList.add(l); //add
					return true;
				}
			}
			ArrayList<LivroComedia> liv = new ArrayList<LivroComedia>();
			liv.add(l);
			estoqueComedia.add(liv);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public void estoque(){
		System.out.println("Estoque da Livraria do Yoda");
		
		System.out.println("-------------------------------------------------");
		//Livros de Aventura
		if(estoqueAventura.isEmpty()){
			System.out.println("Desculpe, não possuimos nenhum livro de Aventura no momento");
		}else{
			System.out.println("Livros de Aventura: " + estoqueAventura.size());
			for (ArrayList<LivroAventura> arrayList : estoqueAventura) {
					System.out.println(arrayList.get(0).getNome() + ", Estoque: " + arrayList.size());	
			}
		}
		System.out.println("-------------------------------------------------");
		
		//Livros de Comedia
		if(estoqueComedia.isEmpty()){
			System.out.println("Desculpe, não possuimos nenhum livro de Comedia no momento");
		}else{
			System.out.println("Livros de Comedia: " + estoqueComedia.size());
			for (ArrayList<LivroComedia> arrayList : estoqueComedia) {
				System.out.println(arrayList.get(0).getNome() + ", Estoque: " + arrayList.size());	 
			}
		}
		System.out.println("-------------------------------------------------");
		
		//Livros de Drama
		if(estoqueDrama.isEmpty()){
			System.out.println("Desculpe, não possuimos nenhum livro de Drama no momento");
		}else{
			System.out.println("Livros de Drama: " + estoqueDrama.size());
			for (ArrayList<LivroDrama> arrayList : estoqueDrama) {
				System.out.println(arrayList.get(0).getNome() + ", Estoque: " + arrayList.size());	 
			}
		}
		System.out.println("-------------------------------------------------");
	}
	
	
	public float cansultarCaixa(){
		return getCaixa();
	}

	public float getCaixa() {
		return caixa;
	}

	public void setCaixa(float caixa) {
		this.caixa = caixa;
	}
	
	public boolean venda(LivroAventura l, float valor){
		try {
			for (ArrayList<LivroAventura> arrayList : estoqueAventura) {
				if(arrayList.get(0).getNome().equals(l.getNome())){
					for (LivroAventura livroAventura : arrayList) {
						if(l.getId() == livroAventura.getId() ){
							float troco = valor - livroAventura.getValor();
							if(valor >= l.getValor()){
								if(getCaixa() >= troco){
									if(arrayList.size() == 1){
										estoqueAventura.remove(arrayList);
									}else{
										arrayList.remove(livroAventura);
									}							
									setCaixa(getCaixa() + (valor - troco));
									historicoVendas.add(new venda(l, new Date()));
									System.out.println("--------------");
									System.out.println("Troco: " + troco);
									System.out.println("--------------");
									return true;
								}else{
									System.out.println("Desculpe, não possuimos troco");
								}
							}
						}
					}
					
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean venda(LivroDrama l, float valor){
		try {
			for (ArrayList<LivroDrama> arrayList : estoqueDrama) {
				if(arrayList.get(0).getNome().equals(l.getNome())){
					for (LivroDrama livroDrama : arrayList) {
						if(l.getId() == livroDrama.getId() ){
							float troco = valor - livroDrama.getValor();
							if(valor >= l.getValor()){
								if(getCaixa() >= troco){
									if(arrayList.size() == 1){
										estoqueDrama.remove(arrayList);
									}else{
										arrayList.remove(livroDrama);
									}							
									setCaixa(getCaixa() + (valor - troco));
									historicoVendas.add(new venda(l, new Date()));
									System.out.println("--------------");
									System.out.println("Troco: " + troco);
									System.out.println("--------------");
									return true;
									}else{
										System.out.println("Desculpe, não possuimos troco");
								}
							}
						}
					}
					
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean venda(LivroComedia l, float valor){
		try {
			for (ArrayList<LivroComedia> arrayList : estoqueComedia) {
				if(arrayList.get(0).getNome().equals(l.getNome())){
					for (LivroComedia livroComedia : arrayList) {
						if(l.getId() == livroComedia.getId() ){
							float troco = valor - livroComedia.getValor();
							if(valor >= l.getValor()){
								if(getCaixa() >= troco){
									if(arrayList.size() == 1){
										estoqueComedia.remove(arrayList);
									}else{
										arrayList.remove(livroComedia);
									}							
									setCaixa(getCaixa() + (valor - troco));
									historicoVendas.add(new venda(l, new Date()));
									System.out.println("--------------");
									System.out.println("Troco: " + troco);
									System.out.println("--------------");
									return true;
								}else{
									System.out.println("Desculpe, não possuimos troco");
								}
							}
						}
					}
					
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public void historico(){
		System.out.println("---------------------------");
		System.out.println("historico de Vendas");
		System.out.println("---------------------------");
		for (venda vendas : historicoVendas) {
			System.out.println("Livro: " + vendas.getLivro().getNome() + "| ID: " + vendas.getLivro().getId() + " | Vendido em: " + vendas.getDataVenda());
		}
		System.out.println("---------------------------");
	}
	
	public void listarLivro(String nome, int op){
		if(op == 1){
			System.out.println("---------------------------------------");
			for (ArrayList<LivroAventura> arrayList : estoqueAventura) {
				if(arrayList.get(0).getNome().equals(nome)){
					for (LivroAventura livroAventura : arrayList) {
						System.out.println("Nome: " + livroAventura.getNome() + " | ID: " + livroAventura.getId()+ " | Detalhes: " + livroAventura.getDescricao());
					}
				}
			}
			System.out.println("---------------------------------------");
		}else if(op == 2){
			System.out.println("---------------------------------------");
			for (ArrayList<LivroComedia> arrayList : estoqueComedia) {
				if(arrayList.get(0).getNome().equals(nome)){
					for (LivroComedia livroComedia : arrayList) {
						System.out.println("Nome: " + livroComedia.getNome() + " | ID: " + livroComedia.getId() + " | Detalhes: " + livroComedia.getDescricao());
					}
				}
			}
			System.out.println("---------------------------------------");
		}else if(op == 3){
			System.out.println("---------------------------------------");
			for (ArrayList<LivroDrama> arrayList : estoqueDrama) {
				if(arrayList.get(0).getNome().equals(nome)){
					for (LivroDrama livroDrama : arrayList) {
						System.out.println("Nome: " + livroDrama.getNome() + " | ID: " + livroDrama.getId() + " | Detalhes: " + livroDrama.getDescricao());
					}
				}
			}
			System.out.println("---------------------------------------");
		}
		
	}
}
