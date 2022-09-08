package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerdao = DaoFactory.createSellerDao();

		System.out.println("\n=== Test 1: seller FindById ====");
		Seller seller = sellerdao.findById(5);
		System.out.println(seller);

		System.out.println("\n=== Test 2: Deparment FindByDepartment ====");
		Department dep = new Department(2, null);
		List<Seller> list = sellerdao.findByDepartment(dep);
		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n=== Test 3: Deparment FindALL ====");
		list = sellerdao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
	}

}
