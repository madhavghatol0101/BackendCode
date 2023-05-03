package com.cjc.main.addmissioncjc.studentserviceimpl.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.addmissioncjc.model.app.Student;
import com.cjc.main.addmissioncjc.repository.app.MyRepository;
import com.cjc.main.addmissioncjc.studentservicei.app.stuServicei;
@Service
public class studentServiceimpl implements stuServicei{

	@Autowired
	MyRepository mr;
	@Override
	public Student savestu(Student s) {
		
		Student stu = mr.save(s);
		return stu;
	}
	@Override
	public List<Student> getstu() {
		
		List<Student> stuall = mr.findAll();
		return stuall;
	}

}
