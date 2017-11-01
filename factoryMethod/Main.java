package factoryMethod;

public class Main {

	public static void main(String args[]) {

		FactoryPessoa factory = new FactoryPessoa();
		String nome = "José";
		char sexo = 'M';
		
		Pessoa pessoa = factory.getPessoa(nome, sexo);		
		
		System.out.println("Classe: " + pessoa.getClass().getName());
		System.out.println();
		System.out.printf("Nome: %s\nSexo: %c", pessoa.getNome(), pessoa.getSexo() );

	}
}