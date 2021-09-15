package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = new DaoFactory().createSellerDao();
		
		Seller seller = sellerDao.findById(4);
		
		System.out.println(seller);

	}

}
