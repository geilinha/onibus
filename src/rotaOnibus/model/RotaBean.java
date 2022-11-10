package rotaOnibus.model;

import java.math.BigDecimal;
import java.util.List;

public class RotaBean {

	private static Integer id;
	private String descricao;
	private List<BairroBean> baiList;
	private BigDecimal kmRodados;
	
	public RotaBean() {
	}

	public RotaBean(String descricao, List<BairroBean> baiList, BigDecimal kmRodados) {
		this.descricao = descricao;
		this.baiList = baiList;
		this.kmRodados = kmRodados;
	}

	public Integer getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<BairroBean> getBaiList() {
		return baiList;
	}

	public void setBaiList(List<BairroBean> baiList) {
		this.baiList = baiList;
	}

	public BigDecimal getKmRodados() {
		return kmRodados;
	}

	public void setKmRodados(BigDecimal kmRodados) {
		this.kmRodados = kmRodados;
	}
	
}
