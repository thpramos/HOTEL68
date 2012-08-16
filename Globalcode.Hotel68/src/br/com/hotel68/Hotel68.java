package br.com.hotel68;

import br.com.hotel68.dao.BaseDAO;
import br.com.hotel68.view.UserInterface;
import br.com.hotel68.view.text.TextUserInterface;

public class Hotel68 {

	public static void main(String[] args) {
		new Hotel68().run();
	}

	public void run() {
		// Somente para criar a base de dados e testar se esta funcionando - remover apos testes iniciais
		BaseDAO.testDatabase();

		// Carregar configuracoes do sistema

		// Apresentar o menu
		UserInterface ui = new TextUserInterface();
		ui.showInterface();
	}

	public static String version() {
		// TODO: implementar
		return null;
	}

}
