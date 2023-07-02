package ru.hogwarts.school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.model.Student;

import java.util.ArrayList;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    ArrayList<Student> findByAgeBetweenOrderByAge(int min, int max);
}
