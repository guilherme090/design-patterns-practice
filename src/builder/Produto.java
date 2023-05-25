package builder;

// Classe que representa o objeto complexo a ser construído

public class Produto {
	private String atributo1;
	private float atributo2;
	private boolean atributo3;
	
	public Produto(String atributo1, float atributo2, boolean atributo3) {
		this.atributo1 = atributo1;
		this.atributo2 = atributo2;
		this.atributo3 = atributo3;
	}

	public String getAtributo1() {
		return atributo1;
	}

	public float getAtributo2() {
		return atributo2;
	}

	public boolean getAtributo3() {
		return atributo3;
	}
}
