package modelo.dao;

import modelo.dao.impl.VendedorDaoJDBC;

public class DaoFactory {

	public static VendedorDao criacaoVendedorDao() {
		return new VendedorDaoJDBC();
	}
}
