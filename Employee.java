import java.util.Scanner;

/*
 * class Employee
 * extends Staff
 * 
 * @author: Võ Nam Xuân An
 */

public class Employee extends Staff {
	private int overTime;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, int age, int rate, String date, String part, int absent, int overTime) {
		super(id, name, age, rate, date, part, absent);
		this.setOverTime(overTime);
	}


	public int getOverTime() {
		return overTime;
	}

	public void setOverTime(int overTime) {
		this.overTime = overTime;
	}
	
	public void input(Scanner s) {
		super.input(s);
		System.out.print("Nhập số giờ làm thêm: ");
		overTime = s.nextInt();
	}
	
	public int calculateSalary() {
		return super.getRate() * 3000000 + overTime * 200000;
	}
	
	protected void displayInformation() {
		System.out.println("Mã nhân viên: " + super.getId());
		System.out.println("Tên nhân viên: " + super.getName());
		System.out.println("Tuổi nhân viên: " + super.getAge());
		System.out.println("Hệ số lương: " + super.getRate());
		System.out.println("Ngày vào làm: " + super.getDate());
		System.out.println("Bộ phận làm việc: " + super.getPart());
		System.out.println("Số ngày nghỉ phép: " + super.getAbsent());
		System.out.println("Số giờ làm thêm: " + overTime);
		System.out.println("Lương của anh chị là: " + calculateSalary());
	}
}
