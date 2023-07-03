package kr.co.jhta.hr.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.jhta.hr.service.HrService;
import kr.co.jhta.hr.vo.Department;
import kr.co.jhta.hr.vo.Employee;

public class App2 {

	public static void main(String[] args) {
		
		ApplicationContext cxt = new ClassPathXmlApplicationContext("mybatis-context.xml");
		
		HrService service = cxt.getBean(HrService.class);
		
		// 전체 직원정보를 반환하는 서비스 실행하기
//		List<Employee> employees = service.getAllEmployees();
//		for (Employee e : employees) {
//			System.out.println(e.getId()+ "\t" +e.getFirstName()+ "\t" +e.getJob().getId());
//		}
		
		// 직원 상세정보 조회하기
//		Employee emp = service.getEmployeeDetail(178);
//		System.out.println("아이디: " +emp.getId());
//		System.out.println("이름: " +emp.getFirstName() + " " +emp.getLastName());
//		System.out.println("이메일: " +emp.getEmail());
//		System.out.println("전화번호: " +emp.getPhoneNumber());
//		System.out.println("입사일: " +emp.getHireDate());
//		System.out.println("직종아이디: " +emp.getJob().getId());
//		System.out.println("직종명: " +emp.getJob().getTitle());
//		System.out.println("직종최소급여: " +emp.getJob().getMinSalary());
//		System.out.println("직종최대급여: " +emp.getJob().getMaxSalary());
//		System.out.println("급여: " +emp.getSalary());
//		System.out.println("커미션: " +emp.getCommissionPct());
//		if (emp.getManager() != null) {
//			System.out.println("매니저아이디: " +emp.getManager().getId());
//			System.out.println("매니저이름: " +emp.getManager().getLastName() + " " + emp.getManager().getFirstName());
//		}
//		if (emp.getDepartment() != null) {
//			System.out.println("소속부서아이디: " +emp.getDepartment().getId());
//			System.out.println("소속부서명: " +emp.getDepartment().getName());
//		}
		
		Department dept = service.getDepartmentWithEmployoees(60);
		System.out.println("---------------------------------------------");
		System.out.println("부서아이디: " +dept.getId());
		System.out.println("부서이름:" +dept.getName());
		System.out.println("부서관리자: " +dept.getManager().getFirstName());
		System.out.println("---------------------------------------------");
		List<Employee> employees = dept.getEmployees();
		for (Employee e : employees) {
			System.out.println(e.getId()+ "\t" +e.getFirstName());
		}
	}
}











