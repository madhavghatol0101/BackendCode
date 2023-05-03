package com.cjc.main.addmissioncjc.studentservicei.app;

import java.util.List;

import com.cjc.main.addmissioncjc.model.app.Student;

public interface stuServicei {

	public Student savestu(Student s);

	public List<Student> getstu();

	public void deleteone(Student s,int id);


}
