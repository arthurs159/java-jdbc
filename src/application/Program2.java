package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		new DaoFactory();
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("===== TEST 1: Department insert =====");
		Department newDepartment = new Department(10, "Food");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted, new id = " + newDepartment.getId());
		
//		System.out.println("==== TEST 2: Department Update =====");
//		newDepartment.setName("Nome trocado");
//		departmentDao.update(newDepartment);
//		System.out.println("Updated Name");
		
		System.out.println("==== TEST 3: Department Delete by ID ====");
		int id = 10;
		departmentDao.deleteByID(id);
		System.out.println("Deleted ");
	
		System.out.println("==== TEST 4: Department FindByID ====");
		
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
	}

}
