package com.telusko.spring_data_jpa_ex;

import com.telusko.spring_data_jpa_ex.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

//    We can remove the @Query annotation when using JPQL, but the method name findBy... must match the variable name.
    //    @Query("select s from Student s where s.name = ?1")

    List<Student> findByName(String name);

    List<Student> findByMarksGreaterThan(int marks);
}
