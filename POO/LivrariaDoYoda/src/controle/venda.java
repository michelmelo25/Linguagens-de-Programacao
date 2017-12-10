package controle;

import java.util.Date;

import livro.Livro;

public class venda {
	private Livro livro;
	private Date dataVenda;
	
	public venda(Livro livro, Date dataVenda) {
		super();
		this.livro = livro;
		this.dataVenda = dataVenda;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public Date getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}
	
	
}
