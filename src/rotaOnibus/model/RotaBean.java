package rotaOnibus.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RotaBean {

	private Integer id;
	private String descricao;
	private List<BairroBean> baiList = new ArrayList<BairroBean>();
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
	
	public void setId(Integer id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "RotaBean [Id=" + id + ", descricao=" + descricao + ", baiList=" + baiList + ", kmRodados=" + kmRodados + "]";
	}
	
	
}
