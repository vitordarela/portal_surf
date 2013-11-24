package br.com.web_juris.dao;

import java.util.List;

import br.com.web_juris.model.Cadclien;

public interface CadclienDao {
	
	public void save(Cadclien cadclien);

	public List<Cadclien> list();

	public void remove(Cadclien cadclien);


}
