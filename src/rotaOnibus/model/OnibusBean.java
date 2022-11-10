package rotaOnibus.model;

import java.math.BigDecimal;

public class OnibusBean {

	private static Integer id;
	private String descricao;
	private BigDecimal kmLitro;
	private final BigDecimal taxaEntrada = new BigDecimal(23.5);
	
	public OnibusBean() {
	}

	public OnibusBean(String descricao, BigDecimal kmLitro) {
		this.descricao = descricao;
		this.kmLitro = kmLitro;
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

	public BigDecimal getKmLitro() {
		return kmLitro;
	}

	public void setKmLitro(BigDecimal kmLitro) {
		this.kmLitro = kmLitro;
	}
	
	public BigDecimal getTaxaEntrada() {
		return taxaEntrada;
	}	
}
