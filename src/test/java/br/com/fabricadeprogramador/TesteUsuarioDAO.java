package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class TesteUsuarioDAO {

	public static void main(String[] args) {
		testExcluir();
	}

	public static void testCadastrar() {
		// criando o usuario
		Usuario usu = new Usuario();
		usu.setNome("Jãozao");
		usu.setLogin("eeeita");
		usu.setSenha("ei2ta");

		// Cadastrando usuário no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);
	}
	
	public static void testAlterar() {
		// criando o usuario
		Usuario usu = new Usuario();
		usu.setId(1);
		usu.setNome("OPA");
		usu.setLogin("novo");
		usu.setSenha("deucerto");

		// Cadastrando usuário no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);
		System.out.println("Alterado com Sucesso");
	}
	
	public static void testExcluir() {
		// criando o usuario
		Usuario usu = new Usuario();
		usu.setId(4);
	
		// Cadastrando usuário no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu);
		System.out.println("Excluido com Sucesso");
	}

}
