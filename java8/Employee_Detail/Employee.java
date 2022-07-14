package Employee_Detail;

import java.util.Date;

public class Employee {

	String empName;
	String workLoaction;
	String department;
	double salary;
	Date empDateOfBirth;
	Date dateOfJoining;
	Date dateOfResign;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String empName, String workLoaction, String department, int salary, Date empDateOfBirth,
			Date dateOfJoining, Date dateOfResign) {
		super();
		this.empName = empName;
		this.workLoaction = workLoaction;
		this.department = department;
		this.salary = salary;
		this.empDateOfBirth = empDateOfBirth;
		this.dateOfJoining = dateOfJoining;
		this.dateOfResign = dateOfResign;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getWorkLoaction() {
		return workLoaction;
	}

	public void setWorkLoaction(String workLoaction) {
		this.workLoaction = workLoaction;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getEmpDateOfBirth() {
		return empDateOfBirth;
	}

	public void setEmpDateOfBirth(Date empDateOfBirth) {
		this.empDateOfBirth = empDateOfBirth;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Date getDateOfResign() {
		return dateOfResign;
	}

	public void setDateOfResign(Date dateOfResign) {
		this.dateOfResign = dateOfResign;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", workLoaction=" + workLoaction + ", department=" + department
				+ ", salary=" + salary + ", empDateOfBirth=" + empDateOfBirth + ", dateOfJoining=" + dateOfJoining
				+ ", dateOfResign=" + dateOfResign + "]";
	}
	
}
