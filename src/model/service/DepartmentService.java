package model.service;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {
	
	public List<Department> findAll(){
		
		//Colocando dados MOCK - É um termo em programação para inserir dados ficticios
		
		List<Department> list = new ArrayList<>();
		list.add(new Department(1, "Computers"));
		list.add(new Department(2, "Eletronics"));
		list.add(new Department(3, "Books"));
		
		return list;
		
	}

}
