package Employee_Detail;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeMain {

	static List<Employee> empList = new ArrayList<Employee>();
	static double highestSalary = 0;
	static double lowestSalary = 0;
	static int highestNumberOfEmployee = 0;
	static int lowestNumberOfEmployee = 0;

	static Map<String, Integer> mapOfEmployee = new HashMap<>();

	public void addEmployees() throws ParseException {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("** Enter how many Employee details you want to enter **");
			int emps = sc.nextInt();
			for (int i = 1; i <= emps; i++) {
				Employee emp = new Employee();
				System.out.println("Enter Employee Name");
				emp.setEmpName(sc.next());
				System.out.println("Enter Employee WorkLocation(Indore,Pune,Banglore,Delhi)");
				emp.setWorkLoaction(sc.next());
				System.out.println("Enter Employee Department(HR,Java,DB,Python)");
				emp.setDepartment(sc.next());
				System.out.println("Enter Employee Salary");
				emp.setSalary(sc.nextDouble());
				System.out.println("Enter Employee Date Of Birth(DD/MM/YYYY)");
				emp.setEmpDateOfBirth(new SimpleDateFormat("dd/MM/yyyy").parse(sc.next()));
				System.out.println("Enter Employee Date Of Joining");
				emp.setDateOfJoining(new SimpleDateFormat("dd/MM/yyyy").parse(sc.next()));
				System.out.println("Enter Employee Date of resign");
				emp.setDateOfResign(new SimpleDateFormat("dd/MM/yyyy").parse(sc.next()));
				empList.add(emp);
				System.out.println("**********Successfull Added**********");
			}
		}
		System.out.println(empList);
	}

	public static void main(String[] args) throws ParseException {

		EmployeeMain em = new EmployeeMain();
		em.addEmployees();

		// a. Employee in a particular department.
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Please Enter a department(HR,Java,DB,Python):");
			String department = sc.next();
			empList.stream().filter(e -> e.department == department).forEach(System.out::println);
			
		}

		// b. Average salary of each department.

		Map<String, List<Employee>> eachDepartment = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));

		eachDepartment.forEach((department, employees) -> {
			
			System.out.print(department + " Department Average Salary :");
			System.out.println(employees.stream().collect(Collectors.averagingDouble(e -> e.salary)));
			
		});

		// c. Highest and lowest salary of each department.

		eachDepartment.forEach((department, employees) -> {
			
			employees.stream().max(Comparator.comparing(Employee::getSalary))
					.ifPresent(emp -> highestSalary = emp.getSalary());
			
			System.out.print("Highest Salary of " + department + " Department:" + highestSalary);
			
			employees.stream().min(Comparator.comparing(Employee::getSalary))
					.ifPresent(emp -> lowestSalary = emp.getSalary());
			
			System.out.print("Lowest Salary of " + department + " Department:" + lowestSalary);
		});

		// d. Department with highest no of employee and lowest no of employee.

		eachDepartment.forEach((department, employees) -> {
			int temp = 0;
			temp = (int) employees.stream().count();
			mapOfEmployee.put(department, temp);
		});
		Map.Entry<String, Integer> maximunEmployee = mapOfEmployee.entrySet().stream()
				.max(Comparator.comparing(Map.Entry::getValue)).get();

		Map.Entry<String, Integer> mininumEmployee = mapOfEmployee.entrySet().stream()
				.min(Comparator.comparing(Map.Entry::getValue)).get();
		
		System.out.println("Department with Highest Employee is *" + maximunEmployee.getKey()
				+ " number of Employee is " + maximunEmployee.getValue());
		
		System.out.println("Department with lowest Employee is *" + mininumEmployee.getKey() + " number of Employee is "
				+ mininumEmployee.getValue());
		
		
		//e. Total number of years of experience of each employee.
		empList.stream().forEach(emp->{
//			emp.getDateOfJoining();
//			Period.between(LocalDate.now(), LocalDate.parse(emp.getDateOfJoining()));
		});
		
		
		
		

	}
}
