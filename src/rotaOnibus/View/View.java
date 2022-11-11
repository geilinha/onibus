package rotaOnibus.View;

import java.util.Scanner;

import rotaOnibus.controller.Main;
import rotaOnibus.model.BairroBean;
import rotaOnibus.model.RotaBean;

public class View {

	private Scanner sc;
	
	public View(Scanner sc) {
		this.sc = sc;
	}	
	
	public void viewTelaInicial() {
		System.out.println("====================================");
		System.out.println("============= BEM VINDO ============");
		System.out.println();
	}
	
	public void Menu() {
		System.out.println("====================================");
		System.out.println("=============== MENU ===============");
		System.out.println("Escolha uma das opções abaixo:");
		System.out.println();
		System.out.println("1 - Cadastrar ônibus");
		System.out.println("2 - Cadastrar rota");
		System.out.println("3 - Alterar rota");
		System.out.println("4 - Deletar rota");
		
	}
	
	public void CadastroOnibus() {
		System.out.println("====================================");
		System.out.println("========= CADASTRO DE ÔNIBUS =======");
		System.out.println();
	}
	
	public void inserirVeiculo() {		
		System.out.print("Insira a descrição do veículo: ");
	}
	
	public void inserirKmL() {		
		System.out.print("Insira a quantidade de quilômetros por litro: ");
	}
	
	public void CadastroRota() {
		System.out.println("====================================");
		System.out.println("========== CADASTRO DE ROTA= =======");
		System.out.println();
	}		
		
	public void mostrarBairroList() {
		for (BairroBean obj : Main.bairroList) {
			System.out.println(obj);
		}
		System.out.println();
	}

	public void inserirBairro() {
		System.out.println("Insira o Id do bairro que deseja adicionar a lista: ");
	}
	public void removerBairro() {
		System.out.println("Insira o Id do bairro que deseja remover da rota: ");
	}
	
	public void quantidadeBairros() {
		System.out.println("Quantos bairros deseja adicionar a rota?");
	}
	
	public void mensagemSucesso() {
		System.out.println("Adicionado com sucesso!");
		System.out.println("====================================");
	}

	public void inserirDescricao() {
		System.out.println("Insira a descrição: ");
	}
	
	public void inserirKm() {
		System.out.println("Insira o km da rota: ");
	}

	public void tracejado() {
		System.out.println("====================================");
	}
	
	public void alterarRota() {
		System.out.println("Insira o Id da rota que deseja alterar: ");
	}
	
	public void mostrarRotaList() {
		for (RotaBean obj : Main.rotaList) {
			System.out.println(obj);
		}
		System.out.println();
	}
	
	public void menuAlterar() {
		System.out.println("====================================");
		System.out.println("=========== ALTERAR ROTA ===========");
		System.out.println("Escolha uma das opções abaixo:");
		System.out.println();
		System.out.println("1 - Alterar descrição");
		System.out.println("2 - Adicionar bairro");
		System.out.println("3 - Deletar bairro");
		System.out.println("4 - Alterar Km");

	}
	
	
	
	
	
	
	
	
}
