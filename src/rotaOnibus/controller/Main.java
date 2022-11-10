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

		Scanner sc = new Scanner(System.in);
		View view = new View(sc);

		view.viewTelaInicial();
		view.Menu();
		Character escolha = sc.next().charAt(0);

		if (escolha.equals('1')) {
			view.CadastroOnibus();

			view.inserirVeiculo();
			String descricao = sc.next();

			view.inserirKmL();
			BigDecimal kmLitro = sc.nextBigDecimal();

			OnibusBO oniBO = new OnibusBO(new OnibusBean(descricao, kmLitro));
			oniBO.adicionarOnibus();
		}
		if (escolha.equals('2')) {
			view.CadastroRota();
			view.mostrarBairroList();
			view.quantidadeBairros();
			Integer quantidade = sc.nextInt();

			for (int i = 1; i <= quantidade; i++) {

				view.inserirBairro();
				Integer baiId = sc.nextInt();

				for (BairroBean bairro : Main.bairroList) {
					if (bairro.getId().equals(baiId)) {
						BairroBean baiBean = bairro;
						RotaBO rotBO = new RotaBO(new RotaBean());
						rotBO.addBairro(baiBean);
					}
				}
			}

		}
		
		if (escolha.equals('3')) {
			
		}

	}

}
