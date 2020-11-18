package br.edu.up.others;

public class Impressora {

	public static void imprimirMenuInicial() {

		System.out.println("\nSeja bem-vindo(a) ao Mercadinho Meio-sangue!");
		System.out.println("\nDiga-nos, o que vocÃª Ã©?\n");
		System.out.println("0) Encerrar o programa");
		System.out.println("1) Sou um(a) CLIENTE");
		System.out.println("2) Sou um(a) FUNCIONÃ�RIO(A)");
		System.out.println("3) Sou um(a)/o(a) PROPRIETÃ�RIO(A)");
		System.out.print("\nInsira a opÃ§Ã£o adequada (1, 2 OU 3): ");
	}

	public static void imprimirMenuFuncionario() {

		System.out.println("\nOlÃ¡, funcionÃ¡rio!");
		System.out.println("\nDiga-nos, com qual entidade deseja interagir?\n");
		System.out.println("1) Clientes");
		System.out.println("2) Produtos");
		System.out.println("3) Fornecedores");
		System.out.print("\nInsira a opÃ§Ã£o adequada: ");
	}

	public static void imprimirMenuCliente() {

		System.out.println("\nO que deseja realizar?\n");
		System.out.println("1) Ver todos os clientes");
		System.out.println("2) Atualizar Cliente");
		System.out.println("3) Adicionar Clientes");
		System.out.println("4) Apagar Clientes");
		System.out.print("\nInsira a opÃ§Ã£o adequada: ");
	}

	public static void imprimirMenuProduto() {

		System.out.println("\nO que deseja realizar?\n");
		System.out.println("1) Ver todos os produtos");
		System.out.println("2) Atualizar um produto");
		System.out.println("3) Adicionar um roduto");
		System.out.println("4) Apagar um produto");
		System.out.print("\nInsira a opÃ§Ã£o adequada: ");
	}

	public static void imprimirMenuFornecedor() {

		System.out.println("\nO que deseja realizar?\n");
		System.out.println("1) Ver todos os fornecedores");
		System.out.println("2) Atualizar um fornecedor");
		System.out.println("3) Adicionar um fornecedor");
		System.out.println("4) Apagar um fornecedor");
		System.out.print("\nInsira a opÃ§Ã£o adequada: ");
	}

	public static void imprimirMenuProprietario() {

		System.out.println("\nOlá proprietário!\n");
		System.out.println("\nDiga-nos com qual entidade você deseja interagir\n");
		System.out.println("1) Clientes");
		System.out.println("2) Produtos");
		System.out.println("3) Fornecedores");
		System.out.println("4) Funcionários");
		System.out.print("\nInsira a opÃ§Ã£o adequada: ");
	}

	public static void imprimirMenuAtualizarCliente() {

		System.out.println(
				"\nInsira o CPF/CNPJ, Nome/Nome Fantasia, Sobrenome/RazÃ£o Social, Tipo de Pessoa e E-mail do cliente:\n");
	}

	public static void imprimirMenuAtualizarFornecedor() {

		System.out.println(
				"\nInsira o CPF/CNPJ, Nome/Nome Fantasia, Sobrenome/RazÃ£o Social, Tipo de Pessoa, InscriÃ§Ã£o Estadual e InscriÃ§Ã£o Municipal do fornecedor:");
	}
	
	public static void imprimirMenuAtualizarFuncionario() {

		System.out.println(
				"\nInsira o CPF, Matricula, Nome, Sobrenome, Email, Função, Complemento, Número, Rua, Bairro, Cidade, UF, CEP do funcionario:");
	}

	public static void imprimirMenuAddCliente() {

		System.out.println(
				"\nInsira o CPF/CNPJ, Nome/RazÃ£o Social, Sobrenome/Nome Fantasia, Tipo de Pessoa e E-mail do novo cliente:\n");
	}

	public static void imprimirMenuAddProduto() {

		System.out.println(
				"\nInsira o SKU, EAN, DescriÃ§Ã£o, Quantidade Total, Unidade, NCM, Custo e Valor de venda do produto:\n");
	}

	public static void imprimirMenuApagarCliente() {

		System.out.println("\nInsira o CPF/CNPJ do cliente que deseja apagar:\n");
	}
	
	public static void imprimirMenuApagarFornecedor() {

		System.out.println("\nInsira o CPF/CNPJ do fornecedor que deseja apagar:\n");
	}
	
	public static void imprimirMenuAddFornecedor() {

		System.out.println(
				"\nInsira o CPF/CNPJ, Nome/Nome Fantasia, Sobrenome/RazÃ£o Social, Tipo de Pessoa, InscriÃ§Ã£o Estadual e InscriÃ§Ã£o Municipal do fornecedor:\n");
	}
	
	public static void imprimirMenuAddFuncionario() {

		System.out.println(
				"\nInsira o CPF, Matricula, Nome, Sobrenome, Email, Função, Complemento, Número, Rua, Bairro, Cidade, UF, CEP do funcionario:");
	}
	
	public static void imprimirMenuApagarFuncionario() {

		System.out.println("\nInsira a Matricula do funcionário que deseja apagar:\n");
	}
	
	
}