import java.util.Scanner;

/* 
 * Class abstract Staff
 * implements ICalculator
 * 
 * @author: Võ Nam Xuân An
 */

public abstract class Staff implements ICalculator {
	private int id, age, rate, absent;
	private String name, date, part;
	
	public Staff() {
		
	}
	
	public Staff(int id, String name, int age, int rate, String date, String part, int absent) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.rate = rate;
		this.date = date;
		this.part = part;
		this.absent = absent;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getRate() {
		return rate;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	public String getDate() {
		return date;
	}
	
	public void setPart(String part) {
		this.part = part;
	}
	public String getPart() {
		return part;
	}
	
	public void setAbsent(int absent) {
		this.absent = absent;
	}
	public int getAbsent() {
		return absent;
	}
	
	public void input(Scanner s) {
		System.out.print("Nhập id: ");
		id = s.nextInt();
		s.nextLine(); // bỏ ký tự \n, vì id chỉ lấy số
		System.out.print("Nhập tên: ");
		name = s.nextLine();
		System.out.print("Nhập tuổi: ");
		age = s.nextInt();
		s.nextLine();
		System.out.print("Nhập hệ số lương: ");
		rate = s.nextInt();
		s.nextLine();
		System.out.print("Nhập ngày vào làm việc: ");
		date = s.nextLine();
		System.out.print("Nhập tên bộ phận làm việc: ");
		part = s.nextLine();
		System.out.print("Nhập số ngày nghỉ phép: ");
		absent = s.nextInt();
		s.nextLine();
	}
	
	

	protected abstract void displayInformation();

}
