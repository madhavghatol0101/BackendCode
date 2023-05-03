package com.cjc.main.addmissioncjc.repository.app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.addmissioncjc.model.app.Student;



@Repository
public interface MyRepository extends JpaRepository<Student, Integer>{

}
