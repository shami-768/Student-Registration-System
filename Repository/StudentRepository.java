package com.training.Repository;
import com.training.Model.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
    public void save(Student student){
        System.out.println(student.getName()+" Saved Successfully");
    }
}
