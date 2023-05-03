package com.cjc.main.addmissioncjc.controller.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.addmissioncjc.model.app.Student;
import com.cjc.main.addmissioncjc.studentservicei.app.stuServicei;

@RestController
public class CjcController {
	@Autowired
	stuServicei ssi;
	
	@PostMapping(value = "/studentsave")
	public ResponseEntity<Student> savestu(@RequestBody Student s){
		
		Student stu = ssi.savestu(s);
		return new ResponseEntity<Student>(stu,HttpStatus.CREATED);
		
	}
	@GetMapping(value="/students")
	public ResponseEntity<List<Student>> getStu(){
		
		List<Student> list = ssi.getstu();
		return new ResponseEntity<List<Student>>(list,HttpStatus.OK);
	}

}
