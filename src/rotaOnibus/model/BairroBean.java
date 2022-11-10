package rotaOnibus.model;

public class BairroBean {


	private Integer id;
	private String descricao;


	public BairroBean() {
	}

	public BairroBean(Integer id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
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
	
	@Override
	public String toString() {
		return "BairroBean [id=" + id + ", descricao=" + descricao + "]";
	}
	
	
	
	
	
	
}