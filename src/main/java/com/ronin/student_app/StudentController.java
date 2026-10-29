package com.ronin.student_app;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class StudentController {

    private final StudentRepo studentRepo;

    public StudentController(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }
    
    @RequestMapping("/getStudents")  
    public List<Student> getStudents() {
        return studentRepo.findAll();
    }

    @RequestMapping("/addStudent")
    public void addStudent() {
        Student student = new Student();
        student.setName("Raj");
        student.setAge(23);

        studentRepo.save(student);
    }
}
