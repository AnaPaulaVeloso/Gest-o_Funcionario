import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		

		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		funcionarios.add(new Funcionario("Zeca", 23, "Faxineiro"));
		funcionarios.add(new Gerente("Ricardo", 25, "Gerente"));
		funcionarios.add(new Desenvolvedor("Denis", 18, "Desenvolvedor"));
		
		for (Funcionario funcionario : funcionarios) {
			funcionario.Trabalhar();
		}
	}	
}
