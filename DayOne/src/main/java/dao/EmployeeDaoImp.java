package dao;

import static utils.HibernateUtils.getFactory;
import org.hibernate.*;

import pojo.Employee;

public class EmployeeDaoImp implements EmployeeDao {

	@Override
	public String addEmployeeDetails(Employee newemp) {
		String msg = "Insertion of new employee is failed!!!!";
		Session session = getFactory().getCurrentSession();

		Transaction tx = session.beginTransaction();

		try {
			Long empid = (Long) session.save(newemp);
			tx.commit();
			msg = "New employee details are added";

		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return msg;
	}

}
