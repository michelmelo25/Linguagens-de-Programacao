package livro;

public abstract class Livro {

	private String nome;
	private float valor;
	private int id;
	
	public Livro(String nome, float valor, int id) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
