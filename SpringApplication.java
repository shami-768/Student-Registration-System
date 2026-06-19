package com.training;

import com.training.Model.Course;
import com.training.Model.Student;
import com.training.Service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SpringApplication  {
    static void main() {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        StudentService studentService=context.getBean(StudentService.class);
        Course course=context.getBean(Course.class);
        Student student=new Student(1,"Priya");
        studentService.Register(student);
        System.out.println(course.getCourseName()+"Course Registered Successfully");

    }
}
