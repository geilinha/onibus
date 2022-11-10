package rotaOnibus.BO;

import rotaOnibus.controller.Main;
import rotaOnibus.model.OnibusBean;

public class OnibusBO {
	
	private static Integer id = 0;
	private OnibusBean oniBean;
	
	public OnibusBO(OnibusBean oniBean) {
		this.oniBean = oniBean;
	}
		
	public OnibusBean getOniBean() {
		return oniBean;
	}

	public void setOniBean(OnibusBean oniBean) {
		this.oniBean = oniBean;
	}

	public void iniciarBO(OnibusBean oniBean) {
		
	}
	
	public void adicionarOnibus() {
		Main.onibusList.add(oniBean);
	}
	
}
