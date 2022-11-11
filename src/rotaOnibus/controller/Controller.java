package rotaOnibus.controller;

import java.math.BigDecimal;
import java.util.Scanner;

import rotaOnibus.BO.OnibusBO;
import rotaOnibus.BO.RotaBO;
import rotaOnibus.View.View;
import rotaOnibus.model.BairroBean;
import rotaOnibus.model.OnibusBean;
import rotaOnibus.model.RotaBean;

public class Controller {

	public static void cadastrarOnibus(Scanner sc, View view) {
		view.CadastroOnibus();

		view.inserirVeiculo();
		String descricao = sc.next();

		view.inserirKmL();
		BigDecimal kmLitro = sc.nextBigDecimal();

		OnibusBO oniBO = new OnibusBO(new OnibusBean(descricao, kmLitro));
		oniBO.adicionarOnibus();
	}

	public static void cadastrarRota(Scanner sc, View view) {
		view.CadastroRota();
		RotaBO rotBO = new RotaBO();

		view.inserirDescricao();
		String descricao = sc.next();
		rotBO.definirDescricao(descricao);
		System.out.println();

		view.mostrarBairroList();
		view.quantidadeBairros();
		Integer quantidade = sc.nextInt();

		for (int i = 1; i <= quantidade; i++) {

			view.inserirBairro();
			Integer baiId = sc.nextInt();

			for (BairroBean bairro : Main.bairroList) {
				if (bairro.getId().equals(baiId)) {
					rotBO.addBairro(bairro);
					view.mensagemSucesso();
					break;
				}
			}
		}
		rotBO.addRota();
		view.inserirKm();
		BigDecimal kmRodados = sc.nextBigDecimal();
		rotBO.definirKm(kmRodados);
		view.tracejado();
	}

	public static void adicionarBairro(Scanner sc, View view, RotaBO rotBO) {
		view.mostrarBairroList();
		view.quantidadeBairros();
		Integer quantidade = sc.nextInt();

		for (int i = 1; i <= quantidade; i++) {

			view.inserirBairro();
			Integer baiId = sc.nextInt();

			for (BairroBean bairro : Main.bairroList) {
				if (bairro.getId().equals(baiId)) {
					rotBO.addBairro(bairro);
					view.mensagemSucesso();
					break;

				}
			}
		}
	}
	
	public static void alterarRota(Scanner sc, View view) {
		view.mostrarRotaList();
		view.alterarRota();

		RotaBO rotBO = null;
		Integer rotaId = sc.nextInt();
		for (RotaBean obj : Main.rotaList) {
			if(obj.getId().equals(rotaId)) {
				rotBO = new RotaBO(obj);
				break;
			}
		}
		view.menuAlterar();
		Character escolhaAlterar = sc.next().charAt(0);
		if(escolhaAlterar.equals('1')) {
			view.inserirDescricao();
			String descricao = sc.next();
			rotBO.definirDescricao(descricao);
		}
		else if (escolhaAlterar.equals('2')) {
			Controller.adicionarBairro(sc, view, rotBO);
		}
		else if (escolhaAlterar.equals('3')) {
			for (BairroBean baiBean : rotBO.getRotBean().getBaiList()) {
				System.out.println(baiBean);
			}
			view.removerBairro();
			Integer baiId = sc.nextInt();
			for (BairroBean bairro : rotBO.getRotBean().getBaiList()) {
				if (bairro.getId().equals(baiId)) {
					rotBO.removeBairro(bairro);
					view.mensagemSucesso();
					break;
				}
			}
		}

	}
}
