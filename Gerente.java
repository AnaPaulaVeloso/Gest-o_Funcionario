public class Gerente extends Funcionario{

	Gerente(String nome, int idade, String funcao) {
		super(nome, idade, funcao);
	}
	@Override
	void Trabalhar () {
		System.out.println("O Gerente " + getNome() + " está trabalhando..");
	}
	
}
