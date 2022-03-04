package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {

	private DepartmentDao dao = DaoFactory.createDepartmentDao();

	public List<Department> findAll() { //m�todo que retorna uma lista de departamento
		return dao.findAll();
	}

	public void saveOrUpdate(Department obj) { //m�todo que insere ou atualiza informa��es no Departamento
		if (obj.getId() == null) {
			dao.insert(obj);
		} else {
			dao.update(obj);
		}
	}

	public void remove(Department obj) { //m�todo para remover um departamento
		dao.deleteById(obj.getId());
	}
}