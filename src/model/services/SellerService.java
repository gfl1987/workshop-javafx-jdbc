package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class SellerService {

	private SellerDao dao = DaoFactory.createSellerDao();

	public List<Seller> findAll() { //m�todo que retorna uma lista de vendedores
		return dao.findAll();
	}

	public void saveOrUpdate(Seller obj) { //m�todo que insere ou atualiza informa��es no Vendedor
		if (obj.getId() == null) {
			dao.insert(obj);
		} else {
			dao.update(obj);
		}
	}

	public void remove(Seller obj) { //m�todo para remover um departamento
		dao.deleteById(obj.getId());
	}
}