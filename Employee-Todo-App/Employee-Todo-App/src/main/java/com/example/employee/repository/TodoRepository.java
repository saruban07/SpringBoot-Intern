package com.example.employee.repository;

import com.example.employee.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    List<Todo> findByEmployeeId(Long employeeId);
}
