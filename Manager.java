import java.util.Scanner;

/*
 * class Manager
 * extends Staff
 * 
 * @author: Võ Nam Xuân An
 */

public class Manager extends Staff  {
	private int title;
	
	public Manager() {
		
	}
	
	public Manager(int id, String name, int age, int rate, String date, String part, int absent, int title) {
		super(id, name, age, rate, date, part, absent);
		this.title = title;
	}

	public int getTitle() {
		return title;
	}

	public void setTitle(int title) {
		this.title = title;
	}
	
	public void input(Scanner s) {
		super.input(s);
		
		System.out.print("Chọn chức danh (1. Business Leader, 2. Project Leader, 3. Technical Leader): ");
		title = s.nextInt();
		
	}
	
	public int salaryRespone() {
		int salary = 0;
		
		if(title == 1) {
			salary = 8000000;
		} else if(title == 2) {
			salary = 5000000;
		}else if(title == 3) {
			salary = 6000000;
		}
		
		return salary;
	}
	
	public int calculateSalary() {
		return super.getRate() * 5000000 + salaryRespone();
	}

	@Override
	protected void displayInformation() {
		System.out.println("Mã nhân viên: " + super.getId());
		System.out.println("Tên nhân viên: " + super.getName());
		System.out.println("Tuổi nhân viên: " + super.getAge());
		System.out.println("Hệ số lương: " + super.getRate());
		System.out.println("Ngày vào làm: " + super.getDate());
		System.out.println("Bộ phận làm việc: " + super.getPart());
		System.out.println("Số ngày nghỉ phép: " + super.getAbsent());
		
		if(title == 1) {
			System.out.println("Chức danh: Business Leader" );
		} else if(title == 2) {
			System.out.println("Chức danh: Project Leader");
		} else {
			System.out.println("Chức danh: Technical Leader");
		}
		
		System.out.println("Lương của anh/chị là: " + calculateSalary());
		
		
	}
	
}
