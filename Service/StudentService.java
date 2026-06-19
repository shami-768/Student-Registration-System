package com.training.Service;

import com.training.Model.Student;
import com.training.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    NotificationService notificationService;
    public void Register(Student student){
        studentRepository.save(student);
        notificationService.sendnotification(student.getName());
        System.out.println("Student Registered Successfully");


    }
}
