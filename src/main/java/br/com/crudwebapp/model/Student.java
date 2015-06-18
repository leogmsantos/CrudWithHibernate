	package br.com.crudwebapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity	
public class Student {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) // for autoIncrement
	private int idStudent;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private int yearLevel;
	@Column
	private String father;
	
	public Student(){
		
	}
	
	public Student(int idStudent, String firstName, String lastName,
			int yearLevel, String father) {
		super();
		this.idStudent = idStudent;
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearLevel = yearLevel;
		this.father = father;
	}

	public int getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getYearLevel() {
		return yearLevel;
	}

	public void setYearLevel(int yearLevel) {
		this.yearLevel = yearLevel;
	}

	public String getFather() {
		return father;
	}

	public void setFather(String father) {
		this.father = father;
	}
	
	
	
}
