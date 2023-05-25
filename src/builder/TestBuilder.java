package builder;

public class TestBuilder {
	public static void main(String[] args) {
		ConstrutorDeProduto construtor = new ConstrutorDeProdutoImpl();
		Diretor diretor = new Diretor(construtor);
		Produto produto = diretor.construirProduto();
		
		System.out.println(produto.getAtributo1());
		System.out.println(produto.getAtributo2());
		System.out.println(produto.getAtributo3());
	}
}
