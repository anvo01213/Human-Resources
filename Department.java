import java.util.Scanner;

/*
 * class Department
 * 
 * @author: Võ Nam Xuân An
 */

public class Department {
	private int departmentId;
	private String departmentName;
	private int numberOfEmployee;
	public Department() {
		
	}
	
	public Department(int departmentId, String departmentName, int numberOfEmployee) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.numberOfEmployee = numberOfEmployee;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getNumberOfEmployee() {
		return numberOfEmployee;
	}

	public void setNumberOfEmployee(int numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}
	
	public void input(Scanner s) {
		System.out.print("Nhập id bộ phận làm việc: ");
		departmentId = s.nextInt();
		System.out.print("Nhập bộ phận làm việc: ");
		departmentName = s.next();
		System.out.print("Nhập số nhân viên có trong bộ phận: ");
		numberOfEmployee = s.nextInt();
	}
	
	public String toString() {
		return "Mã bộ phận: " + departmentId + " | Tên bộ phận: " + departmentName + " | Số lượng nhân viên: " + numberOfEmployee;
		
	}
	

}
