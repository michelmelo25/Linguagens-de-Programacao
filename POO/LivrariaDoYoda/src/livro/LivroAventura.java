package livro;

public class LivroAventura extends Livro{

	private String descricao;
	public LivroAventura(String nome, float valor, int id) {
		super(nome, valor, id);
		this.descricao = "Possui Ilustrações";
		// TODO Auto-generated constructor stub
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}
