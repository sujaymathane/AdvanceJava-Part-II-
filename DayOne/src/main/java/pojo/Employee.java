package pojo;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name = "emps", uniqueConstraints = 
@UniqueConstraint (columnNames = { "first_name", "last_name" }))


public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private Long empid;
	@Column(name = "first_name", length = 30)
	private String firstname;
	@Column(name = "last_name", length = 30)
	private String lastname;
	@Column(length = 30)
	private String emaill;
	@Enumerated(EnumType.STRING)
	private Department dept;
	private LocalDate dob;
	private double salary;
	@Column(name = "is_permanant")
	private boolean isPermanant;

	public Employee() {

	}

	public Employee(String firstname, String lastname, String emaill, Department dept, LocalDate dob, double salary,
			boolean isPermanant) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.emaill = emaill;
		this.dept = dept;
		this.dob = dob;
		this.salary = salary;
		this.isPermanant = isPermanant;
	}

	public Long getEmpid() {
		return empid;
	}

	public void setEmpid(Long empid) {
		this.empid = empid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmaill() {
		return emaill;
	}

	public void setEmaill(String emaill) {
		this.emaill = emaill;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean isPermanant() {
		return isPermanant;
	}

	public void setPermanant(boolean isPermanant) {
		this.isPermanant = isPermanant;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", firstname=" + firstname + ", lastname=" + lastname + ", emaill=" + emaill
				+ ", dept=" + dept + ", dob=" + dob + ", salary=" + salary + ", isPermanant=" + isPermanant + "]";
	}

}
