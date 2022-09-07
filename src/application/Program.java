package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o ID do vendedor: ");
		int id = sc.nextInt();
		
		SellerDao sellerdao = DaoFactory.createSellerDao();
		
		Seller seller = sellerdao.findById(id);
		
		System.out.println(seller);
	}

}
