package com.telusko.spring_data_jpa_ex;

import com.telusko.spring_data_jpa_ex.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaExApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);

        StudentRepo repo = context.getBean(StudentRepo.class);

        Student s1 = context.getBean(Student.class);
        Student s2 = context.getBean(Student.class);
        Student s3 = context.getBean(Student.class);

//        s1.setRollNo(101);
//        s1.setName("Jhon");
//        s1.setMarks(75);
//
//        s2.setRollNo(102);
//        s2.setName("Gustav");
//        s2.setMarks(76);
//
//        s3.setRollNo(103);
//        s3.setName("Arnold");
//        s3.setMarks(77);
//
//        repo.save(s1);
//        repo.save(s2);
//        repo.save(s3);

        System.out.println(repo.findByName("Gustav"));
        System.out.println(repo.findByMarksGreaterThan(70));

    }

}
