package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		new DaoFactory();
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("=== TEST 1: findById =======");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);

		System.out.println("\n=== TEST 2: findAll =======");
		List<Department> list = departmentDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}

		System.out.println("===== TEST 3: Department insert =====");
		Department newDepartment = new Department(null, "Food");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted, new id = " + newDepartment.getId());
		
		System.out.println("==== TEST 4: Department Update =====");
		Department dep2 = departmentDao.findById(1);
		dep2.setName("Music");
		departmentDao.update(dep2);
		System.out.println("Update completed");
		
		System.out.println("==== TEST 3: Department Delete by ID ====");
		int id = 11;
		departmentDao.deleteByID(id);
		System.out.println("Deleted ");
	}

}
