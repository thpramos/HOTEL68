package br.com.hotel68.view.text;

import static java.lang.System.out;

import java.util.Scanner;

import br.com.hotel68.Hotel68;
import br.com.hotel68.view.UserInterface;

public class TextUserInterface implements UserInterface {

	@Override
	public void showInterface() {
		out.println("");
		out.println("------------------------------------");
		out.println("           Hotel 68");
		out.println("");
		out.println("versao " + Hotel68.version());
		out.println("------------------------------------");

		// TODO: implementar

		out.println("");
		out.println("Tecle <enter> para sair...");
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
	}
}
