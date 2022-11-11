package rotaOnibus.BO;

import java.math.BigDecimal;

import rotaOnibus.controller.Main;
import rotaOnibus.model.BairroBean;
import rotaOnibus.model.RotaBean;

public class RotaBO {

		private static Integer id = 0;
		private RotaBean rotBean;
		
		public RotaBO() {
			this.rotBean = new RotaBean();
		}
		public RotaBO(RotaBean rotBean) {
			this.rotBean = rotBean;
		}

		public Integer getId() {
			return id;
		}

		public RotaBean getRotBean() {
			return rotBean;
		}

		public void setRotBean(RotaBean rotBean) {
			this.rotBean = rotBean;
		}
		
		public void addBairro(BairroBean baiBean) {
			this.rotBean.getBaiList().add(baiBean);
			
		}
		
		public void removeBairro(BairroBean baiBean) {
			this.rotBean.getBaiList().remove(baiBean);
		}
		
		public void addRota() {
			rotBean.setId(Main.rotaList.size() + 1);
			Main.rotaList.add(rotBean);
		}
		
		public void definirDescricao(String descricao) {
			this.rotBean.setDescricao(descricao);
		}
		
		public void definirKm(BigDecimal km) {
			this.rotBean.setKmRodados(km);
		}
		
		
}
