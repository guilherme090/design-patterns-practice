package builder;

public interface ConstrutorDeProduto {
	public void construirAtributo1(String atributo1);
	public void construirAtributo2(float atributo2);
	public void construirAtributo3(boolean atributo3);
	
	public Produto getProduto();
}
