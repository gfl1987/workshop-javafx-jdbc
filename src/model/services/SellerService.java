package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class SellerService {

	private SellerDao dao = DaoFactory.createSellerDao();

	public List<Seller> findAll() { //método que retorna uma lista de vendedores
		return dao.findAll();
	}

	public void saveOrUpdate(Seller obj) { //método que insere ou atualiza informações no Vendedor
		if (obj.getId() == null) {
			dao.insert(obj);
		} else {
			dao.update(obj);
		}
	}

	public void remove(Seller obj) { //método para remover um departamento
		dao.deleteById(obj.getId());
	}
}