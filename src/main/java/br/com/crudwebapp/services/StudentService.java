package br.com.crudwebapp.services;

import java.util.List;

import br.com.crudwebapp.model.Student;

public interface StudentService {
	
	public void add(Student student);
	public void edit(Student student);
	public void delete(int studentId);
	public Student getStudent(int studentId);
	public List getAllStudent();
	
}
