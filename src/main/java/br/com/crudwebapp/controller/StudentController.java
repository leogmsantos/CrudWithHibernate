package br.com.crudwebapp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.crudwebapp.model.Student;
import br.com.crudwebapp.services.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/index")
	public String setupFom(Map<String, Object> map){
		Student student = new Student();
		map.put("student", student);
		map.put("studentList", studentService.getAllStudent());
		return "student";
	}
	
	@RequestMapping(value="/student.do", method=RequestMethod.POST)
	public String doActions (@ModelAttribute Student student, BindingResult result, @RequestParam String action, Map<String, Object> map){
		
		Student studentResult = new Student();
		switch(action.toLowerCase()){ //only in Java7 you can put String in switch
		
		case "add": 
			studentService.add(student);
			studentResult = student;
			break;
		case "edit":
			studentService.edit(student);
			studentResult = student;
			break;
		case "delete":
			studentService.delete(student.getIdStudent());
			studentResult = new Student();
			break;
		case "search":
			Student searchStudent = studentService.getStudent(student.getIdStudent());
			studentResult = searchStudent != null ? searchStudent : new Student();
			break;
		}
		map.put("studentList", studentService.getAllStudent());
		return "student";
	}
	
}
