package tester;
import static utils.HibernateUtils.getFactory;
import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.*;

import dao.EmployeeDaoImp;
import pojo.Department;
import pojo.Employee;

public class AddempTester {

	public static void main(String[] args) {
	
		try(SessionFactory session=getFactory()){
			Scanner sc=new Scanner(System.in);
			EmployeeDaoImp empDao=new EmployeeDaoImp();
			System.out.println( "String firstname, String lastname, String emaill, Department dept, LocalDate dob, double salary, isPermanent");
			
//		String firstname, String lastname, String emaill, Department dept, LocalDate dob, double salary,
			
			Employee  emp=new Employee(sc.next(),sc.next(),sc.next(),Department.valueOf(sc.next()),LocalDate.parse(sc.next()),sc.nextDouble(),sc.nextBoolean());
			System.out.println(empDao.addEmployeeDetails(emp));
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
