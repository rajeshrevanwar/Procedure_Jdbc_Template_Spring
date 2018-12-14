package com.talix.in;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TalixDao {

	@Autowired
	JdbcTemplate jdbctemp; 
	
	
	public void addData() {
		System.out.println("Before Adding the Data");
		for(int i=0;i<10000;i++){
			Employee e=new Employee(i,"Rajesh"+i,(3+i));
			String query="insert into employee values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";  
			jdbctemp.update(query); 
		}
		System.out.println("After Adding the Data");
	}

	public void deleteData() {
		System.out.println("Before deleting the Data");
		jdbctemp.update("call DeleteALLEmployee()");
		System.out.println("After deleting the Data");
		
		/*Employee e=new Employee(1,"Rajesh",34210f);
		String query="delete from employee where id='"+e.getId()+"' ";  
	    jdbctemp.update(query); */
		
		System.out.println("Before deleting the Data");
		String query="delete from employee";  
	    jdbctemp.update(query);
	    System.out.println("After deleting the Data");
	}

}