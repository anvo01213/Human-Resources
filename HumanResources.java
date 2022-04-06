import java.util.ArrayList;
import java.util.Scanner;

/*
 * class HumanResources
 * 
 * run System.
 *  @author: Võ Nam Xuân An
 */

public class HumanResources {
	private ArrayList<Staff> list = new ArrayList<>();
	private ArrayList<Department> list1 = new ArrayList<>();

	// input Department
	public void inputDepartment() {
		Scanner s = new Scanner(System.in);

		do {
			System.out.print("Xin chọn: 1. Thêm bộ phận / 2. Thoát ");
			int select = s.nextInt();

			if (select == 2) {
				break;
			}
			Department department = new Department();
			department.input(s);
			list1.add(department);

		} while (true);
		
	}
	
	// display all the department in the company
	public void displayDepartment() {
		System.out.println("----------------------------");
		System.out.println("Các bộ phận trong công ty: ");
		for (Department o : list1) {
			System.out.println(o.toString());

		}
		System.out.println();
	}

	// input Staff
	public void inputStaff() {
		Scanner s = new Scanner(System.in);

		do {
			System.out.print("Chọn chức vụ (1. Manager, 2. Employee, 3. Thoát): ");
			String staff = s.next();

			if (staff == null || staff.equals("")) {
				continue;
			}
			int selectStaff = Integer.parseInt(staff);

			if (selectStaff == 3) {
				break;
			}

			switch (selectStaff) {
			case 1:
				Manager manager = new Manager();
				manager.input(s);
				list.add(manager);

				for (int i = 1; i < list1.size(); i++) {
					if (manager.getPart().equals(list1.get(i).getDepartmentName())) {
						list1.get(i).setNumberOfEmployee(list1.get(i).getNumberOfEmployee() + 1);
					}
				}
				break;
			case 2:
				Employee employee = new Employee();
				employee.input(s);
				list.add(employee);

				for (int i = 1; i < list1.size(); i++) {
					if (employee.getPart().equals(list1.get(i).getDepartmentName())) {
						list1.get(i).setNumberOfEmployee(list1.get(i).getNumberOfEmployee() + 1);
					}
				}
				break;
			}
		} while (true);

	}

	// display Staff Information
	public void displayInformation() {
		System.out.println("------------------------------");
		System.out.println("Danh sách: ");

		for (int i = 0; i < list1.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if (list1.get(i).getDepartmentName().equals(list.get(j).getPart())) {

					list.get(j).displayInformation();
				}
				System.out.println();

			}
		}
	}

	// find Staff by Id
	public void findStaffById(Scanner s) {
		System.out.print("Nhập mã id để tìm kiếm nhân viên: ");
		int id = s.nextInt();
		Staff findStaff = null;
		for (Staff o : list) {
			if (o.getId() == id) {
				findStaff = o;
				break;
			}
		}
		if (findStaff != null) {
			System.out.println("Đây là nhân viên có mã trên: ");
			findStaff.displayInformation();
		} else {
			System.out.println("Không tìm thấy nhân viên có mã trên!");
		}
	}

	public void findStaffByName(Scanner s) {
		System.out.print("Nhập tên để tìm kiếm nhân viên: ");
		String name = s.next();
		Staff findStaff = null;
		for (Staff o : list) {
			if (o.getName().equals(name)) {
				findStaff = o;
				break;
			}
		}
		if (findStaff != null) {
			System.out.println("Đây là nhân viên có tên trên: ");
			findStaff.displayInformation();
		} else {
			System.out.println("Không tìm thấy nhân viên có tên trên!");
		}
	}
	
	public static void showMenu() {
		System.out.println("Đây là chương trình Quản lý nhân viên");
		System.out.println("Xin vui lòng chọn chức năng sau:");
		System.out.println("1. Thêm bộ phận");
		System.out.println("2. Hiển thị các bộ phận đang có");
		System.out.println("3. Nhập thông tin nhân viên");
		System.out.println("4. Hiển thị thông tin nhân viên và lương");
		System.out.println("5. Thoát");
	}

	// main : run system
	public static void main(String[] args) {
		HumanResources hr = new HumanResources();
		Scanner s = new Scanner(System.in);

		int choose;
		do {
			showMenu();
			choose = Integer.parseInt(s.nextLine());
			
			switch(choose) {
			case 1:
				hr.inputDepartment();
				break;
			case 2:
				hr.displayDepartment();
				break;
			case 3:
				hr.inputStaff();
				break;
			case 4:
				hr.displayInformation();
				break;
			case 5:
				System.out.println("Xin cảm ơn bạn đã sử dụng chương trình !");
				break;
				default: System.out.println("Xin hãy nhập lại !!!");
			}
		} while(choose != 5);

		
		do {
			System.out.print("Chọn phương thức tìm kiếm (1. Bằng Id / 2. Bằng Tên nhân viên): ");
			int num = s.nextInt();
			if (num == 1) {
				hr.findStaffById(s);
			} else if (num == 2) {
				hr.findStaffByName(s);
			} else {
				System.out.println("Chúc bạn có một ngày vui vẻ");
				break;
			}
		} while (true);

	}

}
