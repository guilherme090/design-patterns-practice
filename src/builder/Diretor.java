package builder;

public class Diretor {
	private ConstrutorDeProduto construtor;
	
	public Diretor(ConstrutorDeProduto construtor) {
		this.construtor = construtor;
	}
	
	public Produto construirProduto() {
		construtor.construirAtributo1("Nao Encontrado");
		construtor.construirAtributo2(404f);
		construtor.construirAtributo3(true);
		return construtor.getProduto();
	}
}
