package factoryMethod;

public class FactoryPessoa {

	public Pessoa getPessoa(String nome, char sexo) {	
		
		sexo = Character.toUpperCase(sexo);

		switch (sexo) {	
			case 'M':
				return new Homem(nome, sexo);					
			case 'F':
				return new Mulher(nome, sexo);
			default:
				return null;
		}
	}	
}
