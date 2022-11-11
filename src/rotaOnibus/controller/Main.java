package rotaOnibus.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import rotaOnibus.BO.OnibusBO;
import rotaOnibus.BO.RotaBO;
import rotaOnibus.View.View;
import rotaOnibus.model.BairroBean;
import rotaOnibus.model.OnibusBean;
import rotaOnibus.model.RotaBean;

public class Main {

	public static List<OnibusBean> onibusList = new ArrayList<OnibusBean>();
	public static List<RotaBean> rotaList = new ArrayList<RotaBean>();
	public static List<BairroBean> bairroList = new ArrayList<BairroBean>();

	static {
		bairroList.add(new BairroBean(1, "Bela Vista"));
		bairroList.add(new BairroBean(2, "Liberdade"));
		bairroList.add(new BairroBean(3, "República"));
		bairroList.add(new BairroBean(4, "Sé"));
		bairroList.add(new BairroBean(5, "Consolação"));
		bairroList.add(new BairroBean(6, "Barra Funda"));
	}

	public static void main(String[] args) {

		do {
			Scanner sc = new Scanner(System.in);
			View view = new View(sc);

			view.viewTelaInicial();
			view.Menu();
			Character escolha = sc.next().charAt(0);

			if (escolha.equals('1')) {
				Controller.cadastrarOnibus(sc, view);
			}
			if (escolha.equals('2')) {
				Controller.cadastrarRota(sc, view);

			}
			if (escolha.equals('3')) {
				Controller.alterarRota(sc, view);
			}

		} while(true);
	}

}
