package builder;

public class ConstrutorDeProdutoImpl implements ConstrutorDeProduto {
	private String atributo1;
	private float atributo2;
	private boolean atributo3;
	
	@Override
	public void construirAtributo1(String atributo1) {
		this.atributo1 = atributo1;
	}
	
	@Override
	public void construirAtributo2(float atributo2) {
		this.atributo2 = atributo2;
	}
	
	@Override
	public void construirAtributo3(boolean atributo3) {
		this.atributo3 = atributo3;
	}
	
	@Override
	public Produto getProduto() {
		return new Produto(atributo1, atributo2, atributo3);
	}
}
