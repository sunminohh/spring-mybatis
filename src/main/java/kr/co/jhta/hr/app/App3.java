package kr.co.jhta.hr.app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.jhta.hr.service.HrService;
import kr.co.jhta.hr.vo.Employee;

public class App3 {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("mybatis-context.xml");
		
		HrService service = ctx.getBean(HrService.class);
		
		Map<String, Object> param = new HashMap<String, Object>();
//		param.put("job", "IT_PROG");
//		param.put("min", 1000);
//		param.put("max", 5000);
		param.put("depts", List.of(10, 20, 30));
		
		List<Employee> employees = service.searchEmployees(param);
		System.out.println("조회 건수: " +employees.size());
		
	}
}
