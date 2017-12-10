package livro;

public class LivroComedia extends Livro{

	private String descricao;
	public LivroComedia(String nome, float valor, int id) {
		super(nome, valor, id);
		this.descricao = "Possui Capa Tipo Brochura";
		// TODO Auto-generated constructor stub
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}
