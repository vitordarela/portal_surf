package br.com.web_juris.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.web_juris.model.Cadclien;
import br.com.web_juris.utils.HibernateUtil;
import br.com.web_juris.utils.JSFUtils;

public class CadclienDaoImp implements CadclienDao{
	
		public void valida(Cadclien cadclien) {
			
			if (cadclien.getNome() == null || "".equals(cadclien.getNome())) {
				JSFUtils.addErrorMessage("Nome: Campo com preenchimento Obrigatório");
			}
			
			if (cadclien.getCpf() == null || "".equals(cadclien.getCpf())) {
				JSFUtils.addErrorMessage("CPF: Campo com preenchimento Obrigatório");
			}
			
		}
	
	
	   public void save(Cadclien cadclien) {
	        
	        valida(cadclien);
	        
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction t = session.beginTransaction();
	        if(cadclien.getId_clien() == null) {
	        	session.save(cadclien);
	        	 JSFUtils.addSuccessMessage("Cliente salvo com Sucesso");
	        } else {
	        	session.update(cadclien);
	        	 JSFUtils.addSuccessMessage("Cliente Atualizado com Sucesso");
	        }
	        t.commit();
	    }
	    @SuppressWarnings("unchecked")
		public List<Cadclien> list() {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction t = session.beginTransaction();
	        List<Cadclien> lista = session.createQuery("from Cadclien").list();
	        t.commit();
	        return lista;
	    }
	    public void remove(Cadclien cadclien) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction t = session.beginTransaction();
	        session.delete(cadclien);
	        t.commit();
	    }

}
