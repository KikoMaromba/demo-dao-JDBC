package application;


import java.util.Date;
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

		System.out.println("\n=== Test 3: Seller FindALL ====");
		list = sellerdao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== Test 4: Seller Insert ====");
		Seller newSeller = new Seller(null, "Greg Wolf", "Greg@Gmail", new Date(), 4000.00, dep);
		sellerdao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
	}
}
