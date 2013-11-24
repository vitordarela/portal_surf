package br.com.web_juris.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import br.com.web_juris.dao.CadclienDao;
import br.com.web_juris.dao.CadclienDaoImp;
import br.com.web_juris.model.Cadclien;
import br.com.web_juris.utils.JSFUtils;

@ManagedBean
@SessionScoped
public class CadclienController {
	
	private Cadclien cadclien = new Cadclien();
	private DataModel<Cadclien> listaCliente;


	
	public String excluirCliente() {
		Cadclien clienteTemp = (Cadclien) (getListaCliente().getRowData());
		CadclienDao dao = new CadclienDaoImp();
		dao.remove(clienteTemp);
		return "cadclien";
	}
	
	public String prepararAdicionarCliente() {
		cadclien = new Cadclien();
		return "cadclien";
	}

	public String adicionarCliente() {
			 
		try{
			CadclienDao dao = new CadclienDaoImp();
			dao.save(cadclien);
			limpar();
			return "cadclien";
			
		} catch (Exception e) {
			JSFUtils.addErrorMessage("Preencha os campos do Cadastro!");
			return null;
		}
		
	}
	
	public String limpar() {
		cadclien = new Cadclien();
		return null;
	}
	
	public String preparaAlterarCliente() {
		cadclien = (Cadclien) (listaCliente.getRowData());
		return "cadclien";
	}


	public DataModel<Cadclien> getListaCliente() {
		List<Cadclien> lista = new CadclienDaoImp().list();
		listaCliente = new ListDataModel<Cadclien>(lista);		
		return listaCliente;
	}
	
	public void setListaCliente(DataModel<Cadclien> listaCliente) {
		this.listaCliente = listaCliente;
	}
	
	public Cadclien getCadclien() {
		return cadclien;
	}
	public void setCadclien(Cadclien cadclien) {
		this.cadclien = cadclien;
	}

}
