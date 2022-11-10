package rotaOnibus.BO;

import rotaOnibus.controller.Main;
import rotaOnibus.model.BairroBean;
import rotaOnibus.model.RotaBean;

public class RotaBO {

		private Integer id;
		private RotaBean rotBean;
		
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
			rotBean.getBaiList().add(baiBean);
		}
		
		
}
