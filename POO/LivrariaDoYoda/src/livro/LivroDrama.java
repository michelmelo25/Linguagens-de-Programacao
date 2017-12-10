package livro;

public class LivroDrama extends Livro{

	private String descricao;
	public LivroDrama(String nome, float valor, int id) {
		super(nome, valor, id);
		this.descricao = "Possui Capa Dura";
		// TODO Auto-generated constructor stub
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
 
}
