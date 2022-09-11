package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n=== Test 1: Department FindById ====");
		Department dep = depDao.findById(2);
		System.out.println(dep);
		
		System.out.println("\n === Test 2: Department FindALL ====");
		List<Department>list = depDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n === Test 3: Department Insert ====");
		Department depar = new Department(null, "Clear");
		depDao.insert(depar);
		System.out.println("Inserted! New id = " + depar.getId());
		
		System.out.println("\n=== Test 4: Department UpDate ====");
		dep = depDao.findById(3);
		dep.setName("Food");
		depDao.upDate(dep);
		System.out.println("UpDate Complete!");
		
		
		System.out.println("\n=== Test 5: Department DeletById ====");
		System.out.print("Entre com Id a ser deletado: ");
		int id = sc.nextInt();
		depDao.deletById(id);
		System.out.println("Deletado!");
		
		sc.close();
	}

}
